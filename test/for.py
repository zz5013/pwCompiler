import numpy as np
import tensorflow as tf

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,50), 1.0/50, dtype=float), name = "sigma")

# Generator Update Operator
u = np.zeros((50, 50))
u[:, 9] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, u)
updateOp1 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((50, 50))
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
u[20, 21] = 1
u[21, 22] = 1
u[22, 23] = 1
u[23, 24] = 1
u[24, 25] = 1
u[25, 26] = 1
u[26, 27] = 1
u[27, 28] = 1
u[28, 29] = 1
u[29, 30] = 1
u[30, 31] = 1
u[31, 32] = 1
u[32, 33] = 1
u[33, 34] = 1
u[34, 35] = 1
u[35, 36] = 1
u[36, 37] = 1
u[37, 38] = 1
u[38, 39] = 1
u[39, 40] = 1
u[40, 41] = 1
u[41, 42] = 1
u[42, 43] = 1
u[43, 44] = 1
u[44, 45] = 1
u[45, 46] = 1
u[46, 47] = 1
u[47, 48] = 1
u[48, 49] = 1
u[49, -1] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, u)
updateOp2 = tf.Variable(updateOp)

# Define WHILE Statement
loopCount0 = tf.Variable(0)
def condition0(sigma, loopCount0):
    return tf.less(loopCount0, tf.constant(100))
def body0(sigma, loopCount0):
    loopCount0 = tf.add(loopCount0, tf.constant(1))
    sigma = tf.matmul(sigma, updateOp2)
    return sigma, loopCount0

# Main Program
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())
    sigma = tf.matmul(sigma, updateOp1)
    sigma, loopCount0 = tf.while_loop(condition0, body0, [sigma, loopCount0])
    print sess.run(sigma)

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
