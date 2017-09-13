import numpy as np
import tensorflow as tf
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt

for p in range(1):
    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,2), 1.0/2, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,4), 1.0/4, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,8), 1.0/8, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,16), 1.0/16, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,32), 1.0/32, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,64), 1.0/64, dtype=float), name = "sigma")

    # Declare Variable Scopes
    sigma = tf.Variable(np.full((1,256), 1.0/256, dtype=float), name = "sigma")

    # Generate Update Operator
    u = np.zeros((4, 4))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp1 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((4, 4))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp2 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((4, 4))
    u[:, 2] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp3 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((4, 4))
    u[:, 3] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp4 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp5 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp6 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp7 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp8 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp9 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp10 = tf.Variable(updateOp)

    # Generate Test Operator
    t = np.zeros((4, 4))
    t[0, 0] = 1
    testOp = np.array([1.0])
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, t)
    testTemp5 = testOp
    testOp5 = tf.Variable(testOp)
    testNOp5 = tf.Variable(np.identity(256) - testOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp6 = testOp
    testOp6 = tf.Variable(testOp)
    testNOp6 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp11 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp12 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp7 = testOp
    testOp7 = tf.Variable(testOp)
    testNOp7 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp13 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp14 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp8 = testOp
    testOp8 = tf.Variable(testOp)
    testNOp8 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp15 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp16 = tf.Variable(updateOp)

    # Generate Test Operator
    t = np.zeros((4, 4))
    t[1, 1] = 1
    testOp = np.array([1.0])
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, t)
    testTemp9 = testOp
    testOp9 = tf.Variable(testOp)
    testNOp9 = tf.Variable(np.identity(256) - testOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp10 = testOp
    testOp10 = tf.Variable(testOp)
    testNOp10 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp17 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp18 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp11 = testOp
    testOp11 = tf.Variable(testOp)
    testNOp11 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp19 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp20 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp12 = testOp
    testOp12 = tf.Variable(testOp)
    testNOp12 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp21 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp22 = tf.Variable(updateOp)

    # Generate Test Operator
    t = np.zeros((4, 4))
    t[2, 2] = 1
    testOp = np.array([1.0])
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, t)
    testTemp13 = testOp
    testOp13 = tf.Variable(testOp)
    testNOp13 = tf.Variable(np.identity(256) - testOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp14 = testOp
    testOp14 = tf.Variable(testOp)
    testNOp14 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp23 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp24 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp15 = testOp
    testOp15 = tf.Variable(testOp)
    testNOp15 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp25 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp26 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp16 = testOp
    testOp16 = tf.Variable(testOp)
    testNOp16 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp27 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp28 = tf.Variable(updateOp)

    # Generate Test Operator
    t = np.zeros((4, 4))
    t[3, 3] = 1
    testOp = np.array([1.0])
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, np.identity(2))
    testOp =  np.kron(testOp, t)
    testTemp17 = testOp
    testOp17 = tf.Variable(testOp)
    testNOp17 = tf.Variable(np.identity(256) - testOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp18 = testOp
    testOp18 = tf.Variable(testOp)
    testNOp18 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp29 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp30 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp19 = testOp
    testOp19 = tf.Variable(testOp)
    testNOp19 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp31 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp32 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((256, 256))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[1, 1] = 1
    t2[1, 1] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, t2)
    t = np.kron(t, np.identity(4))
    testOp = testOp + t
    testTemp20 = testOp
    testOp20 = tf.Variable(testOp)
    testNOp20 = tf.Variable(np.identity(256) - testOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 1] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp33 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((2, 2))
    u[:, 0] = 1
    updateOp = np.array([1.0])
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, u)
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(2))
    updateOp = np.kron(updateOp, np.identity(4))
    updateOp34 = tf.Variable(updateOp)

    # Main Program
    with tf.Session() as sess:
        sess.run(tf.global_variables_initializer())
        sigma1_ogn = sigma
        sigma = tf.matmul(sigma, updateOp1)
        sigma1_choose1 = sigma
        sigma = sigma1_ogn
        sigma = tf.matmul(sigma, updateOp2)
        sigma1_choose2 = sigma
        sigma = sigma1_ogn
        sigma = tf.matmul(sigma, updateOp3)
        sigma1_choose3 = sigma
        sigma = sigma1_ogn
        sigma = tf.matmul(sigma, updateOp4)
        sigma1_choose4 = sigma
        sigma = tf.matmul(sigma1_choose1, tf.constant(0.5*np.identity(256), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma1_choose2, tf.constant(0.16666666666666666*np.identity(256), dtype=tf.float64)))
        sigma = tf.add(sigma, tf.matmul(sigma1_choose3, tf.constant(0.16666666666666666*np.identity(256), dtype=tf.float64)))
        sigma = tf.add(sigma, tf.matmul(sigma1_choose4, tf.constant(0.16666666666666666*np.identity(256), dtype=tf.float64)))
        sigma2_ogn = sigma
        sigma = tf.matmul(sigma, updateOp5)
        sigma2_choose1 = sigma
        sigma = sigma2_ogn
        sigma = tf.matmul(sigma, updateOp6)
        sigma2_choose2 = sigma
        sigma = tf.matmul(sigma2_choose1, tf.constant(0.5*np.identity(256), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma2_choose2, tf.constant(0.5*np.identity(256), dtype=tf.float64)))
        sigma3_ogn = sigma
        sigma = tf.matmul(sigma, updateOp7)
        sigma3_choose1 = sigma
        sigma = sigma3_ogn
        sigma = tf.matmul(sigma, updateOp8)
        sigma3_choose2 = sigma
        sigma = tf.matmul(sigma3_choose1, tf.constant(0.5*np.identity(256), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma3_choose2, tf.constant(0.5*np.identity(256), dtype=tf.float64)))
        sigma4_ogn = sigma
        sigma = tf.matmul(sigma, updateOp9)
        sigma4_choose1 = sigma
        sigma = sigma4_ogn
        sigma = tf.matmul(sigma, updateOp10)
        sigma4_choose2 = sigma
        sigma = tf.matmul(sigma4_choose1, tf.constant(0.5*np.identity(256), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma4_choose2, tf.constant(0.5*np.identity(256), dtype=tf.float64)))
        sigma5_ogn = sigma
        sigma = tf.matmul(sigma, testOp5)
        sigma6_ogn = sigma
        sigma = tf.matmul(sigma, testOp6)
        sigma = tf.matmul(sigma, updateOp11)
        sigma6_then = sigma
        sigma = tf.matmul(sigma6_ogn, testNOp6)
        sigma = tf.matmul(sigma, updateOp12)
        sigma6_else = sigma
        sigma = tf.add(sigma6_then, sigma6_else)
        sigma7_ogn = sigma
        sigma = tf.matmul(sigma, testOp7)
        sigma = tf.matmul(sigma, updateOp13)
        sigma7_then = sigma
        sigma = tf.matmul(sigma7_ogn, testNOp7)
        sigma = tf.matmul(sigma, updateOp14)
        sigma7_else = sigma
        sigma = tf.add(sigma7_then, sigma7_else)
        sigma8_ogn = sigma
        sigma = tf.matmul(sigma, testOp8)
        sigma = tf.matmul(sigma, updateOp15)
        sigma8_then = sigma
        sigma = tf.matmul(sigma8_ogn, testNOp8)
        sigma = tf.matmul(sigma, updateOp16)
        sigma8_else = sigma
        sigma = tf.add(sigma8_then, sigma8_else)
        sigma5_then = sigma
        sigma = tf.matmul(sigma5_ogn, testNOp5)
        sigma5_else = sigma
        sigma = tf.add(sigma5_then, sigma5_else)
        sigma9_ogn = sigma
        sigma = tf.matmul(sigma, testOp9)
        sigma10_ogn = sigma
        sigma = tf.matmul(sigma, testOp10)
        sigma = tf.matmul(sigma, updateOp17)
        sigma10_then = sigma
        sigma = tf.matmul(sigma10_ogn, testNOp10)
        sigma = tf.matmul(sigma, updateOp18)
        sigma10_else = sigma
        sigma = tf.add(sigma10_then, sigma10_else)
        sigma11_ogn = sigma
        sigma = tf.matmul(sigma, testOp11)
        sigma = tf.matmul(sigma, updateOp19)
        sigma11_then = sigma
        sigma = tf.matmul(sigma11_ogn, testNOp11)
        sigma = tf.matmul(sigma, updateOp20)
        sigma11_else = sigma
        sigma = tf.add(sigma11_then, sigma11_else)
        sigma12_ogn = sigma
        sigma = tf.matmul(sigma, testOp12)
        sigma = tf.matmul(sigma, updateOp21)
        sigma12_then = sigma
        sigma = tf.matmul(sigma12_ogn, testNOp12)
        sigma = tf.matmul(sigma, updateOp22)
        sigma12_else = sigma
        sigma = tf.add(sigma12_then, sigma12_else)
        sigma9_then = sigma
        sigma = tf.matmul(sigma9_ogn, testNOp9)
        sigma9_else = sigma
        sigma = tf.add(sigma9_then, sigma9_else)
        sigma13_ogn = sigma
        sigma = tf.matmul(sigma, testOp13)
        sigma14_ogn = sigma
        sigma = tf.matmul(sigma, testOp14)
        sigma = tf.matmul(sigma, updateOp23)
        sigma14_then = sigma
        sigma = tf.matmul(sigma14_ogn, testNOp14)
        sigma = tf.matmul(sigma, updateOp24)
        sigma14_else = sigma
        sigma = tf.add(sigma14_then, sigma14_else)
        sigma15_ogn = sigma
        sigma = tf.matmul(sigma, testOp15)
        sigma = tf.matmul(sigma, updateOp25)
        sigma15_then = sigma
        sigma = tf.matmul(sigma15_ogn, testNOp15)
        sigma = tf.matmul(sigma, updateOp26)
        sigma15_else = sigma
        sigma = tf.add(sigma15_then, sigma15_else)
        sigma16_ogn = sigma
        sigma = tf.matmul(sigma, testOp16)
        sigma = tf.matmul(sigma, updateOp27)
        sigma16_then = sigma
        sigma = tf.matmul(sigma16_ogn, testNOp16)
        sigma = tf.matmul(sigma, updateOp28)
        sigma16_else = sigma
        sigma = tf.add(sigma16_then, sigma16_else)
        sigma13_then = sigma
        sigma = tf.matmul(sigma13_ogn, testNOp13)
        sigma13_else = sigma
        sigma = tf.add(sigma13_then, sigma13_else)
        sigma17_ogn = sigma
        sigma = tf.matmul(sigma, testOp17)
        sigma18_ogn = sigma
        sigma = tf.matmul(sigma, testOp18)
        sigma = tf.matmul(sigma, updateOp29)
        sigma18_then = sigma
        sigma = tf.matmul(sigma18_ogn, testNOp18)
        sigma = tf.matmul(sigma, updateOp30)
        sigma18_else = sigma
        sigma = tf.add(sigma18_then, sigma18_else)
        sigma19_ogn = sigma
        sigma = tf.matmul(sigma, testOp19)
        sigma = tf.matmul(sigma, updateOp31)
        sigma19_then = sigma
        sigma = tf.matmul(sigma19_ogn, testNOp19)
        sigma = tf.matmul(sigma, updateOp32)
        sigma19_else = sigma
        sigma = tf.add(sigma19_then, sigma19_else)
        sigma20_ogn = sigma
        sigma = tf.matmul(sigma, testOp20)
        sigma = tf.matmul(sigma, updateOp33)
        sigma20_then = sigma
        sigma = tf.matmul(sigma20_ogn, testNOp20)
        sigma = tf.matmul(sigma, updateOp34)
        sigma20_else = sigma
        sigma = tf.add(sigma20_then, sigma20_else)
        sigma17_then = sigma
        sigma = tf.matmul(sigma17_ogn, testNOp17)
        sigma17_else = sigma
        sigma = tf.add(sigma17_then, sigma17_else)
        print sess.run(sigma)
        result = sess.run(sigma)[0]
fig,ax = plt.subplots()
xs = np.arange(256)
ax.bar(xs, result)
plt.show()

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
