import numpy as np
import tensorflow as tf

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,21), 1.0/21, dtype=float), name = "sigma")

# Generate Update Operator
u = np.zeros((21, 21))
u[:, 11] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, u)
updateOp1 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((21, 21))
u[:, 9] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, u)
updateOp2 = tf.Variable(updateOp)

# Generate Test Operator
t = np.zeros((21, 21))
t[0, 0] = 1
t[1, 1] = 1
t[2, 2] = 1
t[3, 3] = 1
t[4, 4] = 1
t[5, 5] = 1
t[6, 6] = 1
t[7, 7] = 1
t[8, 8] = 1
t[9, 9] = 1
t[11, 11] = 1
t[12, 12] = 1
t[13, 13] = 1
t[14, 14] = 1
t[15, 15] = 1
t[16, 16] = 1
t[17, 17] = 1
t[18, 18] = 1
t[19, 19] = 1
t[20, 20] = 1
testOp = np.array([1.0])
testOp =  np.kron(testOp, t)
testTemp2 = testOp
testOp2 = tf.Variable(testOp)
testNOp2 = tf.Variable(np.identity(21) - testOp)

# Generate Update Operator
u = np.zeros((21, 21))
u[0, 1] = 1
u[1, 2] = 1
u[2, 3] = 1
u[3, 4] = 1
u[4, 5] = 1
u[5, 6] = 1
u[6, 7] = 1
u[7, 8] = 1
u[8, 9] = 1
u[9, 10] = 1
u[10, 11] = 1
u[11, 12] = 1
u[12, 13] = 1
u[13, 14] = 1
u[14, 15] = 1
u[15, 16] = 1
u[16, 17] = 1
u[17, 18] = 1
u[18, 19] = 1
u[19, 20] = 1
u[20, 20] = 1
updateOp = u
updateOp3 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((21, 21))
u[0, 0] = 1
u[1, 0] = 1
u[2, 1] = 1
u[3, 2] = 1
u[4, 3] = 1
u[5, 4] = 1
u[6, 5] = 1
u[7, 6] = 1
u[8, 7] = 1
u[9, 8] = 1
u[10, 9] = 1
u[11, 10] = 1
u[12, 11] = 1
u[13, 12] = 1
u[14, 13] = 1
u[15, 14] = 1
u[16, 15] = 1
u[17, 16] = 1
u[18, 17] = 1
u[19, 18] = 1
u[20, 19] = 1
updateOp = u
updateOp4 = tf.Variable(updateOp)

# Define WHILE Statement
loopCount2 = tf.Variable(0)
def condition2(sigma, loopCount2):
    sigma = tf.matmul(sigma, testOp2)
    return tf.logical_and(tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([21], dtype=tf.float64)))), tf.less(loopCount2, tf.constant(1000)))
def body2(sigma, loopCount2):
    loopCount2 = tf.add(loopCount2, tf.constant(1))
    outOfLoop = tf.matmul(sigma, testNOp2)
    sigma = tf.matmul(sigma, testOp2)
    sigma3_ogn = sigma
    sigma = tf.matmul(sigma, updateOp3)
    sigma3_choose1 = sigma
    sigma = sigma3_ogn
    sigma = tf.matmul(sigma, updateOp4)
    sigma3_choose2 = sigma
    sigma = tf.add(tf.matmul(sigma3_choose1, tf.constant(0.5*np.identity(21), dtype=tf.float64)), tf.matmul(sigma3_choose2, tf.constant(0.5*np.identity(21), dtype=tf.float64)))
    sigma = tf.add(sigma, outOfLoop)
    return sigma, loopCount2

# Main Program
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())
    sigma1_ogn = sigma
    sigma = tf.matmul(sigma, updateOp1)
    sigma1_choose1 = sigma
    sigma = sigma1_ogn
    sigma = tf.matmul(sigma, updateOp2)
    sigma1_choose2 = sigma
    sigma = tf.add(tf.matmul(sigma1_choose1, tf.constant(0.5*np.identity(21), dtype=tf.float64)), tf.matmul(sigma1_choose2, tf.constant(0.5*np.identity(21), dtype=tf.float64)))
    sigma, loopCount2 = tf.while_loop(condition2, body2, [sigma, loopCount2])
    print sess.run(sigma)

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
