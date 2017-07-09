import numpy as np
import tensorflow as tf

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,3), 1.0/3, dtype=float), name = "sigma")

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,9), 1.0/9, dtype=float), name = "sigma")

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,27), 1.0/27, dtype=float), name = "sigma")

# Generate Update Operator
u_1 = np.zeros((3, 3))
u_1[:, 0] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, u_1)
uo1 = np.kron(uo1, np.identity(3))
uo1 = np.kron(uo1, np.identity(3))
u_2 = np.zeros((3, 3))
u_2[:, 1] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, u_2)
uo2 = np.kron(uo2, np.identity(3))
uo2 = np.kron(uo2, np.identity(3))
u_3 = np.zeros((3, 3))
u_3[:, 2] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, u_3)
uo3 = np.kron(uo3, np.identity(3))
uo3 = np.kron(uo3, np.identity(3))
updateOp1 = tf.Variable(1.0/3 * (uo1 + uo2 + uo3))

# Generate Update Operator
u_1 = np.zeros((3, 3))
u_1[:, 0] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, np.identity(3))
uo1 = np.kron(uo1, u_1)
uo1 = np.kron(uo1, np.identity(3))
u_2 = np.zeros((3, 3))
u_2[:, 1] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, np.identity(3))
uo2 = np.kron(uo2, u_2)
uo2 = np.kron(uo2, np.identity(3))
u_3 = np.zeros((3, 3))
u_3[:, 2] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, np.identity(3))
uo3 = np.kron(uo3, u_3)
uo3 = np.kron(uo3, np.identity(3))
updateOp2 = tf.Variable(1.0/3 * (uo1 + uo2 + uo3))

# Generate Update Operator
u_1 = np.zeros((3, 3))
u_1[:, 0] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, np.identity(3))
uo1 = np.kron(uo1, np.identity(3))
uo1 = np.kron(uo1, u_1)
u_2 = np.zeros((3, 3))
u_2[:, 1] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, np.identity(3))
uo2 = np.kron(uo2, np.identity(3))
uo2 = np.kron(uo2, u_2)
u_3 = np.zeros((3, 3))
u_3[:, 2] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, np.identity(3))
uo3 = np.kron(uo3, np.identity(3))
uo3 = np.kron(uo3, u_3)
updateOp3 = tf.Variable(1.0/3 * (uo1 + uo2 + uo3))

# Generate Test Operator
testOp = np.zeros((27, 27))
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[0, 0] = 1
t2[0, 0] = 1
t = np.array([1.0])
t = np.kron(t, np.identity(3))
t = np.kron(t, t2)
t = np.kron(t, t1)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[1, 1] = 1
t2[1, 1] = 1
t = np.array([1.0])
t = np.kron(t, np.identity(3))
t = np.kron(t, t2)
t = np.kron(t, t1)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[2, 2] = 1
t2[2, 2] = 1
t = np.array([1.0])
t = np.kron(t, np.identity(3))
t = np.kron(t, t2)
t = np.kron(t, t1)
testOp = testOp + t
testTemp1 = testOp
testOp1 = tf.Variable(testOp)
testNOp1 = tf.Variable(np.identity(27) - testOp)

# Generate Test Operator
testOp = np.zeros((27, 27))
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[0, 0] = 1
t2[0, 0] = 1
t = np.array([1.0])
t = np.kron(t, t2)
t = np.kron(t, np.identity(3))
t = np.kron(t, t1)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[1, 1] = 1
t2[1, 1] = 1
t = np.array([1.0])
t = np.kron(t, t2)
t = np.kron(t, np.identity(3))
t = np.kron(t, t1)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[2, 2] = 1
t2[2, 2] = 1
t = np.array([1.0])
t = np.kron(t, t2)
t = np.kron(t, np.identity(3))
t = np.kron(t, t1)
testOp = testOp + t
testTemp2 = testOp
testOp2 = tf.Variable(testOp)
testNOp2 = tf.Variable(np.identity(27) - testOp)

# Generate Test Operator
testOp = np.zeros((27, 27))
for i in range(27):
    if testTemp1[i, i] == 1 or testTemp2[i, i] == 1:
        testOp[i, i] = 1
testOp3 = tf.Variable(testOp)
testNOp3 = tf.Variable(np.identity(27) - testOp)

# Generate Update Operator
u = np.zeros((27, 27))
u[0, 1] = 1
u[1, 2] = 1
u[2, 0] = 1
u[3, 4] = 1
u[4, 5] = 1
u[5, 3] = 1
u[6, 7] = 1
u[7, 8] = 1
u[8, 6] = 1
u[9, 10] = 1
u[10, 11] = 1
u[11, 9] = 1
u[12, 13] = 1
u[13, 14] = 1
u[14, 12] = 1
u[15, 16] = 1
u[16, 17] = 1
u[17, 15] = 1
u[18, 19] = 1
u[19, 20] = 1
u[20, 18] = 1
u[21, 22] = 1
u[22, 23] = 1
u[23, 21] = 1
u[24, 25] = 1
u[25, 26] = 1
u[26, 24] = 1
updateOp = u
updateOp4 = tf.Variable(updateOp)

# Define WHILE Statement
def condition3(sigma):
    sigma = tf.matmul(sigma, testOp3)
    return tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([27], dtype=tf.float64))))
def body3(sigma):
    outOfLoop = tf.matmul(sigma, testNOp3)
    sigma = tf.matmul(sigma, testOp3)
    sigma = tf.matmul(sigma, updateOp4)
    sigma = tf.add(sigma, outOfLoop)
    return sigma

# Generate Update Operator
u = np.zeros((27, 27))
u[0, 3] = 1
u[1, 4] = 1
u[2, 5] = 1
u[3, 6] = 1
u[4, 7] = 1
u[5, 8] = 1
u[6, 0] = 1
u[7, 1] = 1
u[8, 2] = 1
u[9, 12] = 1
u[10, 13] = 1
u[11, 14] = 1
u[12, 15] = 1
u[13, 16] = 1
u[14, 17] = 1
u[15, 9] = 1
u[16, 10] = 1
u[17, 11] = 1
u[18, 21] = 1
u[19, 22] = 1
u[20, 23] = 1
u[21, 24] = 1
u[22, 25] = 1
u[23, 26] = 1
u[24, 18] = 1
u[25, 19] = 1
u[26, 20] = 1
updateOp = u
updateOp5 = tf.Variable(updateOp)

# Generate Test Operator
testOp = np.zeros((27, 27))
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[0, 0] = 1
t2[0, 0] = 1
t = np.array([1.0])
t = np.kron(t, np.identity(3))
t = np.kron(t, t1)
t = np.kron(t, t2)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[1, 1] = 1
t2[1, 1] = 1
t = np.array([1.0])
t = np.kron(t, np.identity(3))
t = np.kron(t, t1)
t = np.kron(t, t2)
testOp = testOp + t
t1 = np.zeros((3, 3))
t2 = np.zeros((3, 3))
t1[2, 2] = 1
t2[2, 2] = 1
t = np.array([1.0])
t = np.kron(t, np.identity(3))
t = np.kron(t, t1)
t = np.kron(t, t2)
testOp = testOp + t
testTemp4 = testOp
testOp4 = tf.Variable(testOp)
testNOp4 = tf.Variable(np.identity(27) - testOp)

# Generate Update Operator
u = np.zeros((27, 27))
u[0, 3] = 1
u[1, 4] = 1
u[2, 5] = 1
u[3, 6] = 1
u[4, 7] = 1
u[5, 8] = 1
u[6, 0] = 1
u[7, 1] = 1
u[8, 2] = 1
u[9, 12] = 1
u[10, 13] = 1
u[11, 14] = 1
u[12, 15] = 1
u[13, 16] = 1
u[14, 17] = 1
u[15, 9] = 1
u[16, 10] = 1
u[17, 11] = 1
u[18, 21] = 1
u[19, 22] = 1
u[20, 23] = 1
u[21, 24] = 1
u[22, 25] = 1
u[23, 26] = 1
u[24, 18] = 1
u[25, 19] = 1
u[26, 20] = 1
updateOp = u
updateOp6 = tf.Variable(updateOp)

# Define WHILE Statement
def condition4(sigma):
    sigma = tf.matmul(sigma, testOp4)
    return tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([27], dtype=tf.float64))))
def body4(sigma):
    outOfLoop = tf.matmul(sigma, testNOp4)
    sigma = tf.matmul(sigma, testOp4)
    sigma = tf.matmul(sigma, updateOp6)
    sigma = tf.add(sigma, outOfLoop)
    return sigma

# Main Program
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())
    sigma = tf.matmul(sigma, updateOp1)
    sigma = tf.matmul(sigma, updateOp2)
    sigma = tf.matmul(sigma, updateOp3)
    sigma = tf.while_loop(condition3, body3, [sigma])
    sigma = tf.matmul(sigma, updateOp5)
    sigma = tf.while_loop(condition4, body4, [sigma])
    print sess.run(sigma)

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
