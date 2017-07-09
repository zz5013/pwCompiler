import numpy as np
import tensorflow as tf

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,3), 1.0/3, dtype=float), name = "sigma")

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,9), 1.0/9, dtype=float), name = "sigma")

# Generate Update Operator
u_1 = np.zeros((3, 3))
u_1[:, 0] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, u_1)
uo1 = np.kron(uo1, np.identity(3))
u_2 = np.zeros((3, 3))
u_2[:, 1] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, u_2)
uo2 = np.kron(uo2, np.identity(3))
u_3 = np.zeros((3, 3))
u_3[:, 2] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, u_3)
uo3 = np.kron(uo3, np.identity(3))
updateOp1 = tf.Variable(1.0/3 * (uo1 + uo2 + uo3))

# Generate Update Operator
u_1 = np.zeros((3, 3))
u_1[:, 0] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, np.identity(3))
uo1 = np.kron(uo1, u_1)
u_2 = np.zeros((3, 3))
u_2[:, 1] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, np.identity(3))
uo2 = np.kron(uo2, u_2)
u_3 = np.zeros((3, 3))
u_3[:, 2] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, np.identity(3))
uo3 = np.kron(uo3, u_3)
updateOp2 = tf.Variable(1.0/3 * (uo1 + uo2 + uo3))

# Generate Test Operator
t = np.zeros((3, 3))
t[0, 0] = 1
t[1, 1] = 1
testOp = np.array([1.0])
testOp =  np.kron(testOp, t)
testOp =  np.kron(testOp, np.identity(3))
testTemp1 = testOp
testOp1 = tf.Variable(testOp)
testNOp1 = tf.Variable(np.identity(9) - testOp)

# Generate Update Operator
u = np.zeros((9, 9))
u[0, 3] = 1
u[1, 4] = 1
u[2, 5] = 1
u[3, 6] = 1
u[4, 7] = 1
u[5, 8] = 1
u[6, 6] = 1
u[7, 7] = 1
u[8, 8] = 1
updateOp = u
updateOp3 = tf.Variable(updateOp)

# Generate Test Operator
testOp = np.zeros((9, 9))
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[0, 0] = 1
t2[1, 1] = 1
t = np.array([1.0])
t = np.kron(t, t2)
t = np.kron(t, t1)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[0, 0] = 1
t2[2, 2] = 1
t = np.array([1.0])
t = np.kron(t, t2)
t = np.kron(t, t1)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[1, 1] = 1
t2[2, 2] = 1
t = np.array([1.0])
t = np.kron(t, t2)
t = np.kron(t, t1)
testOp = testOp + t
testTemp2 = testOp
testOp2 = tf.Variable(testOp)
testNOp2 = tf.Variable(np.identity(9) - testOp)

# Generate Update Operator
u = np.zeros((9, 9))
u[0, 0] = 1
u[1, 0] = 1
u[2, 0] = 1
u[3, 4] = 1
u[4, 4] = 1
u[5, 4] = 1
u[6, 8] = 1
u[7, 8] = 1
u[8, 8] = 1
updateOp = u
updateOp4 = tf.Variable(updateOp)

# Define WHILE Statement
def condition1(sigma):
    sigma = tf.matmul(sigma, testOp1)
    return tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([9], dtype=tf.float64))))
def body1(sigma):
    outOfLoop = tf.matmul(sigma, testNOp1)
    sigma = tf.matmul(sigma, testOp1)
    sigma = tf.matmul(sigma, updateOp3)
    sigma2_ogn = sigma
    sigma = tf.matmul(sigma, testOp2)
    sigma = tf.matmul(sigma, updateOp4)
    sigma2_then = sigma
    sigma = tf.matmul(sigma2_ogn, testNOp2)
    sigma2_else = sigma
    sigma = tf.add(sigma2_then, sigma2_else)
    sigma = tf.add(sigma, outOfLoop)
    return sigma

# Main Program
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())
    sigma = tf.matmul(sigma, updateOp1)
    sigma = tf.matmul(sigma, updateOp2)
    sigma = tf.while_loop(condition1, body1, [sigma])
    print sess.run(sigma)

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
