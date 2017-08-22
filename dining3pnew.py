import numpy as np
import tensorflow as tf
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt

paras = [(p1, 1 - p1, p2, 1 - p2, p3, 1 - p3) for p1 in np.linspace(0, 1, 2) for p2 in np.linspace(0, 1, 2) for p3 in np.linspace(0, 1, 2) ]
para = -1
result = [[] for x in range(len(paras))]
for (p1, q1, p2, q2, p3, q3) in paras:
    para = para + 1
    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,2), 1.0/2, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,4), 1.0/4, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,8), 1.0/8, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,16), 1.0/16, dtype=float), name = "sigma")

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp1 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp2 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((16, 16))
    u[0, 2] = 1
    u[1, 3] = 1
    u[2, 2] = 1
    u[3, 3] = 1
    u[4, 4] = 1
    u[5, 5] = 1
    u[6, 4] = 1
    u[7, 5] = 1
    u[8, 10] = 1
    u[9, 11] = 1
    u[10, 10] = 1
    u[11, 11] = 1
    u[12, 12] = 1
    u[13, 13] = 1
    u[14, 12] = 1
    u[15, 13] = 1
    updateOp = u
    updateOp3 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((16, 16))
    u[0, 0] = 1
    u[1, 1] = 1
    u[2, 0] = 1
    u[3, 1] = 1
    u[4, 6] = 1
    u[5, 7] = 1
    u[6, 6] = 1
    u[7, 7] = 1
    u[8, 8] = 1
    u[9, 9] = 1
    u[10, 8] = 1
    u[11, 9] = 1
    u[12, 14] = 1
    u[13, 15] = 1
    u[14, 14] = 1
    u[15, 15] = 1
    updateOp = u
    updateOp4 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((16, 16))
    u[0, 1] = 1
    u[1, 1] = 1
    u[2, 2] = 1
    u[3, 2] = 1
    u[4, 5] = 1
    u[5, 5] = 1
    u[6, 6] = 1
    u[7, 6] = 1
    u[8, 9] = 1
    u[9, 9] = 1
    u[10, 10] = 1
    u[11, 10] = 1
    u[12, 13] = 1
    u[13, 13] = 1
    u[14, 14] = 1
    u[15, 14] = 1
    updateOp = u
    updateOp5 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((16, 16))
    u[0, 0] = 1
    u[1, 0] = 1
    u[2, 3] = 1
    u[3, 3] = 1
    u[4, 4] = 1
    u[5, 4] = 1
    u[6, 7] = 1
    u[7, 7] = 1
    u[8, 8] = 1
    u[9, 8] = 1
    u[10, 11] = 1
    u[11, 11] = 1
    u[12, 12] = 1
    u[13, 12] = 1
    u[14, 15] = 1
    u[15, 15] = 1
    updateOp = u
    updateOp6 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((16, 16))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    testOp = testOp + t
    testTemp4 = testOp
    testOp4 = tf.Variable(testOp)
    testNOp4 = tf.Variable(np.identity(16) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp7 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp8 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp9 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp10 = tf.Variable(updateOp)

    # Main Program
    with tf.Session() as sess:
        sess.run(tf.global_variables_initializer())
        sigma1_ogn = sigma
        sigma = tf.matmul(sigma, updateOp1)
        sigma1_choose1 = sigma
        sigma = sigma1_ogn
        sigma = tf.matmul(sigma, updateOp2)
        sigma1_choose2 = sigma
        sigma = tf.matmul(sigma1_choose1, tf.constant(0.5*np.identity(16), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma1_choose2, tf.constant(0.5*np.identity(16), dtype=tf.float64)))
        sigma2_ogn = sigma
        sigma = tf.matmul(sigma, updateOp3)
        sigma2_choose1 = sigma
        sigma = sigma2_ogn
        sigma = tf.matmul(sigma, updateOp4)
        sigma2_choose2 = sigma
        sigma = tf.matmul(sigma2_choose1, tf.constant(p2*np.identity(16), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma2_choose2, tf.constant(q2*np.identity(16), dtype=tf.float64)))
        sigma3_ogn = sigma
        sigma = tf.matmul(sigma, updateOp5)
        sigma3_choose1 = sigma
        sigma = sigma3_ogn
        sigma = tf.matmul(sigma, updateOp6)
        sigma3_choose2 = sigma
        sigma = tf.matmul(sigma3_choose1, tf.constant(p3*np.identity(16), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma3_choose2, tf.constant(q3*np.identity(16), dtype=tf.float64)))
        sigma4_ogn = sigma
        sigma = tf.matmul(sigma, testOp4)
        sigma5_ogn = sigma
        sigma = tf.matmul(sigma, updateOp7)
        sigma5_choose1 = sigma
        sigma = sigma5_ogn
        sigma = tf.matmul(sigma, updateOp8)
        sigma5_choose2 = sigma
        sigma = tf.matmul(sigma5_choose1, tf.constant(p1*np.identity(16), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma5_choose2, tf.constant(q1*np.identity(16), dtype=tf.float64)))
        sigma4_then = sigma
        sigma = tf.matmul(sigma4_ogn, testNOp4)
        sigma6_ogn = sigma
        sigma = tf.matmul(sigma, updateOp9)
        sigma6_choose1 = sigma
        sigma = sigma6_ogn
        sigma = tf.matmul(sigma, updateOp10)
        sigma6_choose2 = sigma
        sigma = tf.matmul(sigma6_choose1, tf.constant(p1*np.identity(16), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma6_choose2, tf.constant(q1*np.identity(16), dtype=tf.float64)))
        sigma4_else = sigma
        sigma = tf.add(sigma4_then, sigma4_else)
        result[para] = sess.run(sigma)[0]
        print result[para]

fig = plt.figure()
ax = fig.add_subplot(111, projection = '3d')
for z in range(para + 1):
    xs = np.arange(16)
    ys = result[z]
    ax.bar(xs, ys, zs = z, zdir = 'y')
ax.set_xlabel('Sigma')
ax.set_ylabel('Parameters')
ax.set_zlabel('Probability')
plt.show()

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
