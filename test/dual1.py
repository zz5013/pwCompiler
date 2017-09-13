import numpy as np
import tensorflow as tf
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt

paras = [(ak, 1 - ak, bk, 1 - bk) for ak in np.linspace(.2, 1, 5) for bk in np.linspace(.2, 1, 5) ]
para = -1
result = [[] for x in range(len(paras))]
for (ak, am, bk, bm) in paras:
    para = para + 1

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,2), 1.0/2, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,4), 1.0/4, dtype=float), name = "sigma")

    ak = tf.Variable(ak*np.identity(4), dtype=tf.float64)
    am = tf.Variable(am*np.identity(4), dtype=tf.float64)
    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp1 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp2 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp3 = tf.Variable(updateOp)

    # Generate Test Operator
    t = np.zeros((2, 2))
    t[1, 1] = 1
    testOp = np.array([1.0])
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, t)
    testTemp2 = testOp
    testOp2 = tf.Variable(testOp)
    testNOp2 = tf.Variable(np.identity(4) - testOp)

    # Generate Test Operator
    t = np.zeros((2, 2))
    t[0, 0] = 1
    testOp = np.array([1.0])
    testOp =  np.kron(testOp, t)
    testOp =  np.kron(testOp, np.identity(2))
    testTemp3 = testOp
    testOp3 = tf.Variable(testOp)
    testNOp3 = tf.Variable(np.identity(4) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp4 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp5 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp6 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp7 = tf.Variable(updateOp)

    # Define WHILE Statement
    def condition2(sigma, ak, am):
        sigma = tf.matmul(sigma, testOp2)
        return tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([4], dtype=tf.float64))))
    def body2(sigma, ak, am):
        outOfLoop = tf.matmul(sigma, testNOp2)
        sigma = tf.matmul(sigma, testOp2)
        sigma3_ogn = sigma
        sigma = tf.matmul(sigma, testOp3)
        sigma4_ogn = sigma
        sigma = tf.matmul(sigma, updateOp4)
        sigma4_choose1 = sigma
        sigma = sigma4_ogn
        sigma = tf.matmul(sigma, updateOp5)
        sigma4_choose2 = sigma

        sigma = tf.matmul(sigma4_choose1, ak)
        #ak = tf.add(ak, tf.constant(0.1*np.identity(4), dtype=tf.float64))
        def f1(): return tf.add(ak, tf.constant(0.1*np.identity(4), dtype=tf.float64))
        def f2(): return ak
        ak = tf.cond(tf.less(ak[0,0], tf.constant(np.identity(4), dtype=tf.float64)[0,0]), f1, f2)


        sigma = tf.add(sigma, tf.matmul(sigma4_choose2, am))
        #am = tf.subtract(am, tf.constant(0.1*np.identity(4), dtype=tf.float64))
        def f1(): return tf.add(am, tf.constant(-0.1*np.identity(4), dtype=tf.float64))
        def f2(): return am
        am = tf.cond(tf.greater(am[0,0], tf.constant(np.zeros((4,4)), dtype=tf.float64)[0,0]), f1, f2)

        sigma3_then = sigma
        sigma = tf.matmul(sigma3_ogn, testNOp3)
        sigma5_ogn = sigma
        sigma = tf.matmul(sigma, updateOp6)
        sigma5_choose1 = sigma
        sigma = sigma5_ogn
        sigma = tf.matmul(sigma, updateOp7)
        sigma5_choose2 = sigma
        sigma = tf.matmul(sigma5_choose1, tf.constant(bk*np.identity(4), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma5_choose2, tf.constant(bm*np.identity(4), dtype=tf.float64)))
        sigma3_else = sigma
        sigma = tf.add(sigma3_then, sigma3_else)
        sigma = tf.add(sigma, outOfLoop)
        return sigma, ak, am

    # Main Program
    with tf.Session() as sess:
        sess.run(tf.global_variables_initializer())
        sigma1_ogn = sigma
        sigma = tf.matmul(sigma, updateOp1)
        sigma1_choose1 = sigma
        sigma = sigma1_ogn
        sigma = tf.matmul(sigma, updateOp2)
        sigma1_choose2 = sigma
        sigma = tf.matmul(sigma1_choose1, tf.constant(0.5*np.identity(4), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma1_choose2, tf.constant(0.5*np.identity(4), dtype=tf.float64)))
        sigma = tf.matmul(sigma, updateOp3)
        sigma, ak, am = tf.while_loop(condition2, body2, [sigma, ak, am])
        print sess.run(sigma)
        result[para] = sess.run(sigma)[0]

fig = plt.figure()
ax = fig.add_subplot(111, projection = '3d')
for z in range(para + 1):
    xs = np.arange(4)
    ys = result[z]
    ax.bar(xs, ys, zs = z, zdir = 'y')
ax.set_xlabel('Sigma')
ax.set_ylabel('Parameters')
ax.set_zlabel('Probability')
plt.show()

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
