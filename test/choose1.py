import numpy as np
import tensorflow as tf

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,10), 1.0/10, dtype=float), name = "sigma")

# Generate Update Operator
u_1 = np.zeros((10, 10))
u_1[:, 0] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, u_1)
u_2 = np.zeros((10, 10))
u_2[:, 1] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, u_2)
u_3 = np.zeros((10, 10))
u_3[:, 2] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, u_3)
u_4 = np.zeros((10, 10))
u_4[:, 3] = 1
uo4 = np.array([1.0])
uo4 = np.kron(uo4, u_4)
u_5 = np.zeros((10, 10))
u_5[:, 4] = 1
uo5 = np.array([1.0])
uo5 = np.kron(uo5, u_5)
updateOp1 = tf.Variable(1.0/5 * (uo1 + uo2 + uo3 + uo4 + uo5))

# Define CHOOSE Statement
def choose0():
    return tf.less(tf.random_uniform([]), 0.5)
def first0(sigma):
    sigma = tf.matmul(sigma, updateOp1)
    return sigma

# Generate Update Operator
u_6 = np.zeros((10, 10))
u_6[:, 5] = 1
uo1 = np.array([1.0])
uo1 = np.kron(uo1, u_6)
u_7 = np.zeros((10, 10))
u_7[:, 6] = 1
uo2 = np.array([1.0])
uo2 = np.kron(uo2, u_7)
u_8 = np.zeros((10, 10))
u_8[:, 7] = 1
uo3 = np.array([1.0])
uo3 = np.kron(uo3, u_8)
u_9 = np.zeros((10, 10))
u_9[:, 8] = 1
uo4 = np.array([1.0])
uo4 = np.kron(uo4, u_9)
u_10 = np.zeros((10, 10))
u_10[:, 9] = 1
uo5 = np.array([1.0])
uo5 = np.kron(uo5, u_10)
updateOp2 = tf.Variable(1.0/5 * (uo1 + uo2 + uo3 + uo4 + uo5))

# Continue Defining CHOOSE
def second0(sigma):
    sigma = tf.matmul(sigma, updateOp2)
    return sigma

# Main Program
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())
    sigma = tf.cond(choose0(), lambda: first0(sigma), lambda: second0(sigma))
    print sess.run(sigma)

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
