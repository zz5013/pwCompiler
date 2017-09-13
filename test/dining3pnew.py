import numpy as np
import tensorflow as tf
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt

paras = [(p1, 1 - p1, p2, 1 - p2, p3, 1 - p3, p4, 1 - p4, p5, 1 - p5) for p1 in np.linspace(0, 1, 2) for p2 in np.linspace(0, 1, 2) for p3 in np.linspace(0, 1, 2) for p4 in np.linspace(0, 1, 2) for p5 in np.linspace(0, 1, 2) ]
para = -1
result = [[] for x in range(len(paras))]
for (p1, q1, p2, q2, p3, q3, p4, q4, p5, q5) in paras:
    para = para + 1
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
    updateOp1 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
    u[0, 8] = 1
    u[1, 9] = 1
    u[2, 10] = 1
    u[3, 11] = 1
    u[4, 12] = 1
    u[5, 13] = 1
    u[6, 14] = 1
    u[7, 15] = 1
    u[8, 8] = 1
    u[9, 9] = 1
    u[10, 10] = 1
    u[11, 11] = 1
    u[12, 12] = 1
    u[13, 13] = 1
    u[14, 14] = 1
    u[15, 15] = 1
    u[16, 16] = 1
    u[17, 17] = 1
    u[18, 18] = 1
    u[19, 19] = 1
    u[20, 20] = 1
    u[21, 21] = 1
    u[22, 22] = 1
    u[23, 23] = 1
    u[24, 16] = 1
    u[25, 17] = 1
    u[26, 18] = 1
    u[27, 19] = 1
    u[28, 20] = 1
    u[29, 21] = 1
    u[30, 22] = 1
    u[31, 23] = 1
    u[32, 40] = 1
    u[33, 41] = 1
    u[34, 42] = 1
    u[35, 43] = 1
    u[36, 44] = 1
    u[37, 45] = 1
    u[38, 46] = 1
    u[39, 47] = 1
    u[40, 40] = 1
    u[41, 41] = 1
    u[42, 42] = 1
    u[43, 43] = 1
    u[44, 44] = 1
    u[45, 45] = 1
    u[46, 46] = 1
    u[47, 47] = 1
    u[48, 48] = 1
    u[49, 49] = 1
    u[50, 50] = 1
    u[51, 51] = 1
    u[52, 52] = 1
    u[53, 53] = 1
    u[54, 54] = 1
    u[55, 55] = 1
    u[56, 48] = 1
    u[57, 49] = 1
    u[58, 50] = 1
    u[59, 51] = 1
    u[60, 52] = 1
    u[61, 53] = 1
    u[62, 54] = 1
    u[63, 55] = 1
    updateOp = u
    updateOp2 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
    u[0, 0] = 1
    u[1, 1] = 1
    u[2, 2] = 1
    u[3, 3] = 1
    u[4, 4] = 1
    u[5, 5] = 1
    u[6, 6] = 1
    u[7, 7] = 1
    u[8, 0] = 1
    u[9, 1] = 1
    u[10, 2] = 1
    u[11, 3] = 1
    u[12, 4] = 1
    u[13, 5] = 1
    u[14, 6] = 1
    u[15, 7] = 1
    u[16, 24] = 1
    u[17, 25] = 1
    u[18, 26] = 1
    u[19, 27] = 1
    u[20, 28] = 1
    u[21, 29] = 1
    u[22, 30] = 1
    u[23, 31] = 1
    u[24, 24] = 1
    u[25, 25] = 1
    u[26, 26] = 1
    u[27, 27] = 1
    u[28, 28] = 1
    u[29, 29] = 1
    u[30, 30] = 1
    u[31, 31] = 1
    u[32, 32] = 1
    u[33, 33] = 1
    u[34, 34] = 1
    u[35, 35] = 1
    u[36, 36] = 1
    u[37, 37] = 1
    u[38, 38] = 1
    u[39, 39] = 1
    u[40, 32] = 1
    u[41, 33] = 1
    u[42, 34] = 1
    u[43, 35] = 1
    u[44, 36] = 1
    u[45, 37] = 1
    u[46, 38] = 1
    u[47, 39] = 1
    u[48, 56] = 1
    u[49, 57] = 1
    u[50, 58] = 1
    u[51, 59] = 1
    u[52, 60] = 1
    u[53, 61] = 1
    u[54, 62] = 1
    u[55, 63] = 1
    u[56, 56] = 1
    u[57, 57] = 1
    u[58, 58] = 1
    u[59, 59] = 1
    u[60, 60] = 1
    u[61, 61] = 1
    u[62, 62] = 1
    u[63, 63] = 1
    updateOp = u
    updateOp3 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
    u[0, 4] = 1
    u[1, 5] = 1
    u[2, 6] = 1
    u[3, 7] = 1
    u[4, 4] = 1
    u[5, 5] = 1
    u[6, 6] = 1
    u[7, 7] = 1
    u[8, 8] = 1
    u[9, 9] = 1
    u[10, 10] = 1
    u[11, 11] = 1
    u[12, 8] = 1
    u[13, 9] = 1
    u[14, 10] = 1
    u[15, 11] = 1
    u[16, 20] = 1
    u[17, 21] = 1
    u[18, 22] = 1
    u[19, 23] = 1
    u[20, 20] = 1
    u[21, 21] = 1
    u[22, 22] = 1
    u[23, 23] = 1
    u[24, 24] = 1
    u[25, 25] = 1
    u[26, 26] = 1
    u[27, 27] = 1
    u[28, 24] = 1
    u[29, 25] = 1
    u[30, 26] = 1
    u[31, 27] = 1
    u[32, 36] = 1
    u[33, 37] = 1
    u[34, 38] = 1
    u[35, 39] = 1
    u[36, 36] = 1
    u[37, 37] = 1
    u[38, 38] = 1
    u[39, 39] = 1
    u[40, 40] = 1
    u[41, 41] = 1
    u[42, 42] = 1
    u[43, 43] = 1
    u[44, 40] = 1
    u[45, 41] = 1
    u[46, 42] = 1
    u[47, 43] = 1
    u[48, 52] = 1
    u[49, 53] = 1
    u[50, 54] = 1
    u[51, 55] = 1
    u[52, 52] = 1
    u[53, 53] = 1
    u[54, 54] = 1
    u[55, 55] = 1
    u[56, 56] = 1
    u[57, 57] = 1
    u[58, 58] = 1
    u[59, 59] = 1
    u[60, 56] = 1
    u[61, 57] = 1
    u[62, 58] = 1
    u[63, 59] = 1
    updateOp = u
    updateOp4 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
    u[0, 0] = 1
    u[1, 1] = 1
    u[2, 2] = 1
    u[3, 3] = 1
    u[4, 0] = 1
    u[5, 1] = 1
    u[6, 2] = 1
    u[7, 3] = 1
    u[8, 12] = 1
    u[9, 13] = 1
    u[10, 14] = 1
    u[11, 15] = 1
    u[12, 12] = 1
    u[13, 13] = 1
    u[14, 14] = 1
    u[15, 15] = 1
    u[16, 16] = 1
    u[17, 17] = 1
    u[18, 18] = 1
    u[19, 19] = 1
    u[20, 16] = 1
    u[21, 17] = 1
    u[22, 18] = 1
    u[23, 19] = 1
    u[24, 28] = 1
    u[25, 29] = 1
    u[26, 30] = 1
    u[27, 31] = 1
    u[28, 28] = 1
    u[29, 29] = 1
    u[30, 30] = 1
    u[31, 31] = 1
    u[32, 32] = 1
    u[33, 33] = 1
    u[34, 34] = 1
    u[35, 35] = 1
    u[36, 32] = 1
    u[37, 33] = 1
    u[38, 34] = 1
    u[39, 35] = 1
    u[40, 44] = 1
    u[41, 45] = 1
    u[42, 46] = 1
    u[43, 47] = 1
    u[44, 44] = 1
    u[45, 45] = 1
    u[46, 46] = 1
    u[47, 47] = 1
    u[48, 48] = 1
    u[49, 49] = 1
    u[50, 50] = 1
    u[51, 51] = 1
    u[52, 48] = 1
    u[53, 49] = 1
    u[54, 50] = 1
    u[55, 51] = 1
    u[56, 60] = 1
    u[57, 61] = 1
    u[58, 62] = 1
    u[59, 63] = 1
    u[60, 60] = 1
    u[61, 61] = 1
    u[62, 62] = 1
    u[63, 63] = 1
    updateOp = u
    updateOp5 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
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
    u[16, 18] = 1
    u[17, 19] = 1
    u[18, 18] = 1
    u[19, 19] = 1
    u[20, 20] = 1
    u[21, 21] = 1
    u[22, 20] = 1
    u[23, 21] = 1
    u[24, 26] = 1
    u[25, 27] = 1
    u[26, 26] = 1
    u[27, 27] = 1
    u[28, 28] = 1
    u[29, 29] = 1
    u[30, 28] = 1
    u[31, 29] = 1
    u[32, 34] = 1
    u[33, 35] = 1
    u[34, 34] = 1
    u[35, 35] = 1
    u[36, 36] = 1
    u[37, 37] = 1
    u[38, 36] = 1
    u[39, 37] = 1
    u[40, 42] = 1
    u[41, 43] = 1
    u[42, 42] = 1
    u[43, 43] = 1
    u[44, 44] = 1
    u[45, 45] = 1
    u[46, 44] = 1
    u[47, 45] = 1
    u[48, 50] = 1
    u[49, 51] = 1
    u[50, 50] = 1
    u[51, 51] = 1
    u[52, 52] = 1
    u[53, 53] = 1
    u[54, 52] = 1
    u[55, 53] = 1
    u[56, 58] = 1
    u[57, 59] = 1
    u[58, 58] = 1
    u[59, 59] = 1
    u[60, 60] = 1
    u[61, 61] = 1
    u[62, 60] = 1
    u[63, 61] = 1
    updateOp = u
    updateOp6 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
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
    u[16, 16] = 1
    u[17, 17] = 1
    u[18, 16] = 1
    u[19, 17] = 1
    u[20, 22] = 1
    u[21, 23] = 1
    u[22, 22] = 1
    u[23, 23] = 1
    u[24, 24] = 1
    u[25, 25] = 1
    u[26, 24] = 1
    u[27, 25] = 1
    u[28, 30] = 1
    u[29, 31] = 1
    u[30, 30] = 1
    u[31, 31] = 1
    u[32, 32] = 1
    u[33, 33] = 1
    u[34, 32] = 1
    u[35, 33] = 1
    u[36, 38] = 1
    u[37, 39] = 1
    u[38, 38] = 1
    u[39, 39] = 1
    u[40, 40] = 1
    u[41, 41] = 1
    u[42, 40] = 1
    u[43, 41] = 1
    u[44, 46] = 1
    u[45, 47] = 1
    u[46, 46] = 1
    u[47, 47] = 1
    u[48, 48] = 1
    u[49, 49] = 1
    u[50, 48] = 1
    u[51, 49] = 1
    u[52, 54] = 1
    u[53, 55] = 1
    u[54, 54] = 1
    u[55, 55] = 1
    u[56, 56] = 1
    u[57, 57] = 1
    u[58, 56] = 1
    u[59, 57] = 1
    u[60, 62] = 1
    u[61, 63] = 1
    u[62, 62] = 1
    u[63, 63] = 1
    updateOp = u
    updateOp7 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
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
    u[16, 17] = 1
    u[17, 17] = 1
    u[18, 18] = 1
    u[19, 18] = 1
    u[20, 21] = 1
    u[21, 21] = 1
    u[22, 22] = 1
    u[23, 22] = 1
    u[24, 25] = 1
    u[25, 25] = 1
    u[26, 26] = 1
    u[27, 26] = 1
    u[28, 29] = 1
    u[29, 29] = 1
    u[30, 30] = 1
    u[31, 30] = 1
    u[32, 33] = 1
    u[33, 33] = 1
    u[34, 34] = 1
    u[35, 34] = 1
    u[36, 37] = 1
    u[37, 37] = 1
    u[38, 38] = 1
    u[39, 38] = 1
    u[40, 41] = 1
    u[41, 41] = 1
    u[42, 42] = 1
    u[43, 42] = 1
    u[44, 45] = 1
    u[45, 45] = 1
    u[46, 46] = 1
    u[47, 46] = 1
    u[48, 49] = 1
    u[49, 49] = 1
    u[50, 50] = 1
    u[51, 50] = 1
    u[52, 53] = 1
    u[53, 53] = 1
    u[54, 54] = 1
    u[55, 54] = 1
    u[56, 57] = 1
    u[57, 57] = 1
    u[58, 58] = 1
    u[59, 58] = 1
    u[60, 61] = 1
    u[61, 61] = 1
    u[62, 62] = 1
    u[63, 62] = 1
    updateOp = u
    updateOp8 = tf.Variable(updateOp)

    # Generate Update Operator
    u = np.zeros((64, 64))
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
    u[16, 16] = 1
    u[17, 16] = 1
    u[18, 19] = 1
    u[19, 19] = 1
    u[20, 20] = 1
    u[21, 20] = 1
    u[22, 23] = 1
    u[23, 23] = 1
    u[24, 24] = 1
    u[25, 24] = 1
    u[26, 27] = 1
    u[27, 27] = 1
    u[28, 28] = 1
    u[29, 28] = 1
    u[30, 31] = 1
    u[31, 31] = 1
    u[32, 32] = 1
    u[33, 32] = 1
    u[34, 35] = 1
    u[35, 35] = 1
    u[36, 36] = 1
    u[37, 36] = 1
    u[38, 39] = 1
    u[39, 39] = 1
    u[40, 40] = 1
    u[41, 40] = 1
    u[42, 43] = 1
    u[43, 43] = 1
    u[44, 44] = 1
    u[45, 44] = 1
    u[46, 47] = 1
    u[47, 47] = 1
    u[48, 48] = 1
    u[49, 48] = 1
    u[50, 51] = 1
    u[51, 51] = 1
    u[52, 52] = 1
    u[53, 52] = 1
    u[54, 55] = 1
    u[55, 55] = 1
    u[56, 56] = 1
    u[57, 56] = 1
    u[58, 59] = 1
    u[59, 59] = 1
    u[60, 60] = 1
    u[61, 60] = 1
    u[62, 63] = 1
    u[63, 63] = 1
    updateOp = u
    updateOp9 = tf.Variable(updateOp)

    # Generate Test Operator
    testOp = np.zeros((64, 64))
    t1 = np.zeros((2, 2))
    t2 = np.zeros((2, 2))
    t1[0, 0] = 1
    t2[0, 0] = 1
    t = np.array([1.0])
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t1)
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
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
    t = np.kron(t, np.identity(2))
    t = np.kron(t, np.identity(2))
    t = np.kron(t, t2)
    testOp = testOp + t
    testTemp5 = testOp
    testOp5 = tf.Variable(testOp)
    testNOp5 = tf.Variable(np.identity(64) - testOp)

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
    updateOp10 = tf.Variable(updateOp)

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
    updateOp11 = tf.Variable(updateOp)

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
    updateOp12 = tf.Variable(updateOp)

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
    updateOp13 = tf.Variable(updateOp)

    # Main Program
    with tf.Session() as sess:
        sess.run(tf.global_variables_initializer())
        sigma = tf.matmul(sigma, updateOp1)
        sigma1_ogn = sigma
        sigma = tf.matmul(sigma, updateOp2)
        sigma1_choose1 = sigma
        sigma = sigma1_ogn
        sigma = tf.matmul(sigma, updateOp3)
        sigma1_choose2 = sigma
        sigma = tf.matmul(sigma1_choose1, tf.constant(p2*np.identity(64), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma1_choose2, tf.constant(q2*np.identity(64), dtype=tf.float64)))
        sigma2_ogn = sigma
        sigma = tf.matmul(sigma, updateOp4)
        sigma2_choose1 = sigma
        sigma = sigma2_ogn
        sigma = tf.matmul(sigma, updateOp5)
        sigma2_choose2 = sigma
        sigma = tf.matmul(sigma2_choose1, tf.constant(p3*np.identity(64), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma2_choose2, tf.constant(q3*np.identity(64), dtype=tf.float64)))
        sigma3_ogn = sigma
        sigma = tf.matmul(sigma, updateOp6)
        sigma3_choose1 = sigma
        sigma = sigma3_ogn
        sigma = tf.matmul(sigma, updateOp7)
        sigma3_choose2 = sigma
        sigma = tf.matmul(sigma3_choose1, tf.constant(p4*np.identity(64), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma3_choose2, tf.constant(q4*np.identity(64), dtype=tf.float64)))
        sigma4_ogn = sigma
        sigma = tf.matmul(sigma, updateOp8)
        sigma4_choose1 = sigma
        sigma = sigma4_ogn
        sigma = tf.matmul(sigma, updateOp9)
        sigma4_choose2 = sigma
        sigma = tf.matmul(sigma4_choose1, tf.constant(p5*np.identity(64), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma4_choose2, tf.constant(q5*np.identity(64), dtype=tf.float64)))
        sigma5_ogn = sigma
        sigma = tf.matmul(sigma, testOp5)
        sigma6_ogn = sigma
        sigma = tf.matmul(sigma, updateOp10)
        sigma6_choose1 = sigma
        sigma = sigma6_ogn
        sigma = tf.matmul(sigma, updateOp11)
        sigma6_choose2 = sigma
        sigma = tf.matmul(sigma6_choose1, tf.constant(p1*np.identity(64), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma6_choose2, tf.constant(q1*np.identity(64), dtype=tf.float64)))
        sigma5_then = sigma
        sigma = tf.matmul(sigma5_ogn, testNOp5)
        sigma7_ogn = sigma
        sigma = tf.matmul(sigma, updateOp12)
        sigma7_choose1 = sigma
        sigma = sigma7_ogn
        sigma = tf.matmul(sigma, updateOp13)
        sigma7_choose2 = sigma
        sigma = tf.matmul(sigma7_choose1, tf.constant(p1*np.identity(64), dtype=tf.float64))
        sigma = tf.add(sigma, tf.matmul(sigma7_choose2, tf.constant(q1*np.identity(64), dtype=tf.float64)))
        sigma5_else = sigma
        sigma = tf.add(sigma5_then, sigma5_else)
        result[para] = sess.run(sigma)[0]
        print result[para]

fig = plt.figure()
ax = fig.add_subplot(111, projection = '3d')
for z in range(para + 1):
    xs = np.arange(64)
    ys = result[z]
    ax.bar(xs, ys, zs = z, zdir = 'y')
ax.set_xlabel('Sigma')
ax.set_ylabel('Parameters')
ax.set_zlabel('Probability')
plt.show()

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
