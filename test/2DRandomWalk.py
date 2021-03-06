import numpy as np
import tensorflow as tf

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,21), 1.0/21, dtype=float), name = "sigma")

# Declare Variable Scopes
sigma = tf.Variable(np.full((1,441), 1.0/441, dtype=float), name = "sigma")

# Generate Update Operator
u = np.zeros((21, 21))
u[:, 11] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, u)
updateOp = np.kron(updateOp, np.identity(21))
updateOp1 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((21, 21))
u[:, 9] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, u)
updateOp = np.kron(updateOp, np.identity(21))
updateOp2 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((21, 21))
u[:, 11] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, np.identity(21))
updateOp = np.kron(updateOp, u)
updateOp3 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((21, 21))
u[:, 9] = 1
updateOp = np.array([1.0])
updateOp = np.kron(updateOp, np.identity(21))
updateOp = np.kron(updateOp, u)
updateOp4 = tf.Variable(updateOp)

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
testOp =  np.kron(testOp, np.identity(21))
testTemp3 = testOp
testOp3 = tf.Variable(testOp)
testNOp3 = tf.Variable(np.identity(441) - testOp)

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
testOp =  np.kron(testOp, np.identity(21))
testOp =  np.kron(testOp, t)
testTemp4 = testOp
testOp4 = tf.Variable(testOp)
testNOp4 = tf.Variable(np.identity(441) - testOp)

# Generate Test Operator
testOp = np.zeros((441, 441))
for i in range(441):
    if testTemp3[i, i] == 1 or testTemp4[i, i] == 1:
        testOp[i, i] = 1
testTemp5 = testOp
testOp5 = tf.Variable(testOp)
testNOp5 = tf.Variable(np.identity(441) - testOp)

# Generate Update Operator
u = np.zeros((441, 441))
u[0, 21] = 1
u[1, 22] = 1
u[2, 23] = 1
u[3, 24] = 1
u[4, 25] = 1
u[5, 26] = 1
u[6, 27] = 1
u[7, 28] = 1
u[8, 29] = 1
u[9, 30] = 1
u[10, 31] = 1
u[11, 32] = 1
u[12, 33] = 1
u[13, 34] = 1
u[14, 35] = 1
u[15, 36] = 1
u[16, 37] = 1
u[17, 38] = 1
u[18, 39] = 1
u[19, 40] = 1
u[20, 41] = 1
u[21, 42] = 1
u[22, 43] = 1
u[23, 44] = 1
u[24, 45] = 1
u[25, 46] = 1
u[26, 47] = 1
u[27, 48] = 1
u[28, 49] = 1
u[29, 50] = 1
u[30, 51] = 1
u[31, 52] = 1
u[32, 53] = 1
u[33, 54] = 1
u[34, 55] = 1
u[35, 56] = 1
u[36, 57] = 1
u[37, 58] = 1
u[38, 59] = 1
u[39, 60] = 1
u[40, 61] = 1
u[41, 62] = 1
u[42, 63] = 1
u[43, 64] = 1
u[44, 65] = 1
u[45, 66] = 1
u[46, 67] = 1
u[47, 68] = 1
u[48, 69] = 1
u[49, 70] = 1
u[50, 71] = 1
u[51, 72] = 1
u[52, 73] = 1
u[53, 74] = 1
u[54, 75] = 1
u[55, 76] = 1
u[56, 77] = 1
u[57, 78] = 1
u[58, 79] = 1
u[59, 80] = 1
u[60, 81] = 1
u[61, 82] = 1
u[62, 83] = 1
u[63, 84] = 1
u[64, 85] = 1
u[65, 86] = 1
u[66, 87] = 1
u[67, 88] = 1
u[68, 89] = 1
u[69, 90] = 1
u[70, 91] = 1
u[71, 92] = 1
u[72, 93] = 1
u[73, 94] = 1
u[74, 95] = 1
u[75, 96] = 1
u[76, 97] = 1
u[77, 98] = 1
u[78, 99] = 1
u[79, 100] = 1
u[80, 101] = 1
u[81, 102] = 1
u[82, 103] = 1
u[83, 104] = 1
u[84, 105] = 1
u[85, 106] = 1
u[86, 107] = 1
u[87, 108] = 1
u[88, 109] = 1
u[89, 110] = 1
u[90, 111] = 1
u[91, 112] = 1
u[92, 113] = 1
u[93, 114] = 1
u[94, 115] = 1
u[95, 116] = 1
u[96, 117] = 1
u[97, 118] = 1
u[98, 119] = 1
u[99, 120] = 1
u[100, 121] = 1
u[101, 122] = 1
u[102, 123] = 1
u[103, 124] = 1
u[104, 125] = 1
u[105, 126] = 1
u[106, 127] = 1
u[107, 128] = 1
u[108, 129] = 1
u[109, 130] = 1
u[110, 131] = 1
u[111, 132] = 1
u[112, 133] = 1
u[113, 134] = 1
u[114, 135] = 1
u[115, 136] = 1
u[116, 137] = 1
u[117, 138] = 1
u[118, 139] = 1
u[119, 140] = 1
u[120, 141] = 1
u[121, 142] = 1
u[122, 143] = 1
u[123, 144] = 1
u[124, 145] = 1
u[125, 146] = 1
u[126, 147] = 1
u[127, 148] = 1
u[128, 149] = 1
u[129, 150] = 1
u[130, 151] = 1
u[131, 152] = 1
u[132, 153] = 1
u[133, 154] = 1
u[134, 155] = 1
u[135, 156] = 1
u[136, 157] = 1
u[137, 158] = 1
u[138, 159] = 1
u[139, 160] = 1
u[140, 161] = 1
u[141, 162] = 1
u[142, 163] = 1
u[143, 164] = 1
u[144, 165] = 1
u[145, 166] = 1
u[146, 167] = 1
u[147, 168] = 1
u[148, 169] = 1
u[149, 170] = 1
u[150, 171] = 1
u[151, 172] = 1
u[152, 173] = 1
u[153, 174] = 1
u[154, 175] = 1
u[155, 176] = 1
u[156, 177] = 1
u[157, 178] = 1
u[158, 179] = 1
u[159, 180] = 1
u[160, 181] = 1
u[161, 182] = 1
u[162, 183] = 1
u[163, 184] = 1
u[164, 185] = 1
u[165, 186] = 1
u[166, 187] = 1
u[167, 188] = 1
u[168, 189] = 1
u[169, 190] = 1
u[170, 191] = 1
u[171, 192] = 1
u[172, 193] = 1
u[173, 194] = 1
u[174, 195] = 1
u[175, 196] = 1
u[176, 197] = 1
u[177, 198] = 1
u[178, 199] = 1
u[179, 200] = 1
u[180, 201] = 1
u[181, 202] = 1
u[182, 203] = 1
u[183, 204] = 1
u[184, 205] = 1
u[185, 206] = 1
u[186, 207] = 1
u[187, 208] = 1
u[188, 209] = 1
u[189, 210] = 1
u[190, 211] = 1
u[191, 212] = 1
u[192, 213] = 1
u[193, 214] = 1
u[194, 215] = 1
u[195, 216] = 1
u[196, 217] = 1
u[197, 218] = 1
u[198, 219] = 1
u[199, 220] = 1
u[200, 221] = 1
u[201, 222] = 1
u[202, 223] = 1
u[203, 224] = 1
u[204, 225] = 1
u[205, 226] = 1
u[206, 227] = 1
u[207, 228] = 1
u[208, 229] = 1
u[209, 230] = 1
u[210, 231] = 1
u[211, 232] = 1
u[212, 233] = 1
u[213, 234] = 1
u[214, 235] = 1
u[215, 236] = 1
u[216, 237] = 1
u[217, 238] = 1
u[218, 239] = 1
u[219, 240] = 1
u[220, 241] = 1
u[221, 242] = 1
u[222, 243] = 1
u[223, 244] = 1
u[224, 245] = 1
u[225, 246] = 1
u[226, 247] = 1
u[227, 248] = 1
u[228, 249] = 1
u[229, 250] = 1
u[230, 251] = 1
u[231, 252] = 1
u[232, 253] = 1
u[233, 254] = 1
u[234, 255] = 1
u[235, 256] = 1
u[236, 257] = 1
u[237, 258] = 1
u[238, 259] = 1
u[239, 260] = 1
u[240, 261] = 1
u[241, 262] = 1
u[242, 263] = 1
u[243, 264] = 1
u[244, 265] = 1
u[245, 266] = 1
u[246, 267] = 1
u[247, 268] = 1
u[248, 269] = 1
u[249, 270] = 1
u[250, 271] = 1
u[251, 272] = 1
u[252, 273] = 1
u[253, 274] = 1
u[254, 275] = 1
u[255, 276] = 1
u[256, 277] = 1
u[257, 278] = 1
u[258, 279] = 1
u[259, 280] = 1
u[260, 281] = 1
u[261, 282] = 1
u[262, 283] = 1
u[263, 284] = 1
u[264, 285] = 1
u[265, 286] = 1
u[266, 287] = 1
u[267, 288] = 1
u[268, 289] = 1
u[269, 290] = 1
u[270, 291] = 1
u[271, 292] = 1
u[272, 293] = 1
u[273, 294] = 1
u[274, 295] = 1
u[275, 296] = 1
u[276, 297] = 1
u[277, 298] = 1
u[278, 299] = 1
u[279, 300] = 1
u[280, 301] = 1
u[281, 302] = 1
u[282, 303] = 1
u[283, 304] = 1
u[284, 305] = 1
u[285, 306] = 1
u[286, 307] = 1
u[287, 308] = 1
u[288, 309] = 1
u[289, 310] = 1
u[290, 311] = 1
u[291, 312] = 1
u[292, 313] = 1
u[293, 314] = 1
u[294, 315] = 1
u[295, 316] = 1
u[296, 317] = 1
u[297, 318] = 1
u[298, 319] = 1
u[299, 320] = 1
u[300, 321] = 1
u[301, 322] = 1
u[302, 323] = 1
u[303, 324] = 1
u[304, 325] = 1
u[305, 326] = 1
u[306, 327] = 1
u[307, 328] = 1
u[308, 329] = 1
u[309, 330] = 1
u[310, 331] = 1
u[311, 332] = 1
u[312, 333] = 1
u[313, 334] = 1
u[314, 335] = 1
u[315, 336] = 1
u[316, 337] = 1
u[317, 338] = 1
u[318, 339] = 1
u[319, 340] = 1
u[320, 341] = 1
u[321, 342] = 1
u[322, 343] = 1
u[323, 344] = 1
u[324, 345] = 1
u[325, 346] = 1
u[326, 347] = 1
u[327, 348] = 1
u[328, 349] = 1
u[329, 350] = 1
u[330, 351] = 1
u[331, 352] = 1
u[332, 353] = 1
u[333, 354] = 1
u[334, 355] = 1
u[335, 356] = 1
u[336, 357] = 1
u[337, 358] = 1
u[338, 359] = 1
u[339, 360] = 1
u[340, 361] = 1
u[341, 362] = 1
u[342, 363] = 1
u[343, 364] = 1
u[344, 365] = 1
u[345, 366] = 1
u[346, 367] = 1
u[347, 368] = 1
u[348, 369] = 1
u[349, 370] = 1
u[350, 371] = 1
u[351, 372] = 1
u[352, 373] = 1
u[353, 374] = 1
u[354, 375] = 1
u[355, 376] = 1
u[356, 377] = 1
u[357, 378] = 1
u[358, 379] = 1
u[359, 380] = 1
u[360, 381] = 1
u[361, 382] = 1
u[362, 383] = 1
u[363, 384] = 1
u[364, 385] = 1
u[365, 386] = 1
u[366, 387] = 1
u[367, 388] = 1
u[368, 389] = 1
u[369, 390] = 1
u[370, 391] = 1
u[371, 392] = 1
u[372, 393] = 1
u[373, 394] = 1
u[374, 395] = 1
u[375, 396] = 1
u[376, 397] = 1
u[377, 398] = 1
u[378, 399] = 1
u[379, 400] = 1
u[380, 401] = 1
u[381, 402] = 1
u[382, 403] = 1
u[383, 404] = 1
u[384, 405] = 1
u[385, 406] = 1
u[386, 407] = 1
u[387, 408] = 1
u[388, 409] = 1
u[389, 410] = 1
u[390, 411] = 1
u[391, 412] = 1
u[392, 413] = 1
u[393, 414] = 1
u[394, 415] = 1
u[395, 416] = 1
u[396, 417] = 1
u[397, 418] = 1
u[398, 419] = 1
u[399, 420] = 1
u[400, 421] = 1
u[401, 422] = 1
u[402, 423] = 1
u[403, 424] = 1
u[404, 425] = 1
u[405, 426] = 1
u[406, 427] = 1
u[407, 428] = 1
u[408, 429] = 1
u[409, 430] = 1
u[410, 431] = 1
u[411, 432] = 1
u[412, 433] = 1
u[413, 434] = 1
u[414, 435] = 1
u[415, 436] = 1
u[416, 437] = 1
u[417, 438] = 1
u[418, 439] = 1
u[419, 440] = 1
u[420, 420] = 1
u[421, 421] = 1
u[422, 422] = 1
u[423, 423] = 1
u[424, 424] = 1
u[425, 425] = 1
u[426, 426] = 1
u[427, 427] = 1
u[428, 428] = 1
u[429, 429] = 1
u[430, 430] = 1
u[431, 431] = 1
u[432, 432] = 1
u[433, 433] = 1
u[434, 434] = 1
u[435, 435] = 1
u[436, 436] = 1
u[437, 437] = 1
u[438, 438] = 1
u[439, 439] = 1
u[440, 440] = 1
updateOp = u
updateOp5 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((441, 441))
u[0, 0] = 1
u[1, 1] = 1
u[2, 2] = 1
u[3, 3] = 1
u[4, 4] = 1
u[5, 5] = 1
u[6, 6] = 1
u[7, 7] = 1
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
u[21, 0] = 1
u[22, 1] = 1
u[23, 2] = 1
u[24, 3] = 1
u[25, 4] = 1
u[26, 5] = 1
u[27, 6] = 1
u[28, 7] = 1
u[29, 8] = 1
u[30, 9] = 1
u[31, 10] = 1
u[32, 11] = 1
u[33, 12] = 1
u[34, 13] = 1
u[35, 14] = 1
u[36, 15] = 1
u[37, 16] = 1
u[38, 17] = 1
u[39, 18] = 1
u[40, 19] = 1
u[41, 20] = 1
u[42, 21] = 1
u[43, 22] = 1
u[44, 23] = 1
u[45, 24] = 1
u[46, 25] = 1
u[47, 26] = 1
u[48, 27] = 1
u[49, 28] = 1
u[50, 29] = 1
u[51, 30] = 1
u[52, 31] = 1
u[53, 32] = 1
u[54, 33] = 1
u[55, 34] = 1
u[56, 35] = 1
u[57, 36] = 1
u[58, 37] = 1
u[59, 38] = 1
u[60, 39] = 1
u[61, 40] = 1
u[62, 41] = 1
u[63, 42] = 1
u[64, 43] = 1
u[65, 44] = 1
u[66, 45] = 1
u[67, 46] = 1
u[68, 47] = 1
u[69, 48] = 1
u[70, 49] = 1
u[71, 50] = 1
u[72, 51] = 1
u[73, 52] = 1
u[74, 53] = 1
u[75, 54] = 1
u[76, 55] = 1
u[77, 56] = 1
u[78, 57] = 1
u[79, 58] = 1
u[80, 59] = 1
u[81, 60] = 1
u[82, 61] = 1
u[83, 62] = 1
u[84, 63] = 1
u[85, 64] = 1
u[86, 65] = 1
u[87, 66] = 1
u[88, 67] = 1
u[89, 68] = 1
u[90, 69] = 1
u[91, 70] = 1
u[92, 71] = 1
u[93, 72] = 1
u[94, 73] = 1
u[95, 74] = 1
u[96, 75] = 1
u[97, 76] = 1
u[98, 77] = 1
u[99, 78] = 1
u[100, 79] = 1
u[101, 80] = 1
u[102, 81] = 1
u[103, 82] = 1
u[104, 83] = 1
u[105, 84] = 1
u[106, 85] = 1
u[107, 86] = 1
u[108, 87] = 1
u[109, 88] = 1
u[110, 89] = 1
u[111, 90] = 1
u[112, 91] = 1
u[113, 92] = 1
u[114, 93] = 1
u[115, 94] = 1
u[116, 95] = 1
u[117, 96] = 1
u[118, 97] = 1
u[119, 98] = 1
u[120, 99] = 1
u[121, 100] = 1
u[122, 101] = 1
u[123, 102] = 1
u[124, 103] = 1
u[125, 104] = 1
u[126, 105] = 1
u[127, 106] = 1
u[128, 107] = 1
u[129, 108] = 1
u[130, 109] = 1
u[131, 110] = 1
u[132, 111] = 1
u[133, 112] = 1
u[134, 113] = 1
u[135, 114] = 1
u[136, 115] = 1
u[137, 116] = 1
u[138, 117] = 1
u[139, 118] = 1
u[140, 119] = 1
u[141, 120] = 1
u[142, 121] = 1
u[143, 122] = 1
u[144, 123] = 1
u[145, 124] = 1
u[146, 125] = 1
u[147, 126] = 1
u[148, 127] = 1
u[149, 128] = 1
u[150, 129] = 1
u[151, 130] = 1
u[152, 131] = 1
u[153, 132] = 1
u[154, 133] = 1
u[155, 134] = 1
u[156, 135] = 1
u[157, 136] = 1
u[158, 137] = 1
u[159, 138] = 1
u[160, 139] = 1
u[161, 140] = 1
u[162, 141] = 1
u[163, 142] = 1
u[164, 143] = 1
u[165, 144] = 1
u[166, 145] = 1
u[167, 146] = 1
u[168, 147] = 1
u[169, 148] = 1
u[170, 149] = 1
u[171, 150] = 1
u[172, 151] = 1
u[173, 152] = 1
u[174, 153] = 1
u[175, 154] = 1
u[176, 155] = 1
u[177, 156] = 1
u[178, 157] = 1
u[179, 158] = 1
u[180, 159] = 1
u[181, 160] = 1
u[182, 161] = 1
u[183, 162] = 1
u[184, 163] = 1
u[185, 164] = 1
u[186, 165] = 1
u[187, 166] = 1
u[188, 167] = 1
u[189, 168] = 1
u[190, 169] = 1
u[191, 170] = 1
u[192, 171] = 1
u[193, 172] = 1
u[194, 173] = 1
u[195, 174] = 1
u[196, 175] = 1
u[197, 176] = 1
u[198, 177] = 1
u[199, 178] = 1
u[200, 179] = 1
u[201, 180] = 1
u[202, 181] = 1
u[203, 182] = 1
u[204, 183] = 1
u[205, 184] = 1
u[206, 185] = 1
u[207, 186] = 1
u[208, 187] = 1
u[209, 188] = 1
u[210, 189] = 1
u[211, 190] = 1
u[212, 191] = 1
u[213, 192] = 1
u[214, 193] = 1
u[215, 194] = 1
u[216, 195] = 1
u[217, 196] = 1
u[218, 197] = 1
u[219, 198] = 1
u[220, 199] = 1
u[221, 200] = 1
u[222, 201] = 1
u[223, 202] = 1
u[224, 203] = 1
u[225, 204] = 1
u[226, 205] = 1
u[227, 206] = 1
u[228, 207] = 1
u[229, 208] = 1
u[230, 209] = 1
u[231, 210] = 1
u[232, 211] = 1
u[233, 212] = 1
u[234, 213] = 1
u[235, 214] = 1
u[236, 215] = 1
u[237, 216] = 1
u[238, 217] = 1
u[239, 218] = 1
u[240, 219] = 1
u[241, 220] = 1
u[242, 221] = 1
u[243, 222] = 1
u[244, 223] = 1
u[245, 224] = 1
u[246, 225] = 1
u[247, 226] = 1
u[248, 227] = 1
u[249, 228] = 1
u[250, 229] = 1
u[251, 230] = 1
u[252, 231] = 1
u[253, 232] = 1
u[254, 233] = 1
u[255, 234] = 1
u[256, 235] = 1
u[257, 236] = 1
u[258, 237] = 1
u[259, 238] = 1
u[260, 239] = 1
u[261, 240] = 1
u[262, 241] = 1
u[263, 242] = 1
u[264, 243] = 1
u[265, 244] = 1
u[266, 245] = 1
u[267, 246] = 1
u[268, 247] = 1
u[269, 248] = 1
u[270, 249] = 1
u[271, 250] = 1
u[272, 251] = 1
u[273, 252] = 1
u[274, 253] = 1
u[275, 254] = 1
u[276, 255] = 1
u[277, 256] = 1
u[278, 257] = 1
u[279, 258] = 1
u[280, 259] = 1
u[281, 260] = 1
u[282, 261] = 1
u[283, 262] = 1
u[284, 263] = 1
u[285, 264] = 1
u[286, 265] = 1
u[287, 266] = 1
u[288, 267] = 1
u[289, 268] = 1
u[290, 269] = 1
u[291, 270] = 1
u[292, 271] = 1
u[293, 272] = 1
u[294, 273] = 1
u[295, 274] = 1
u[296, 275] = 1
u[297, 276] = 1
u[298, 277] = 1
u[299, 278] = 1
u[300, 279] = 1
u[301, 280] = 1
u[302, 281] = 1
u[303, 282] = 1
u[304, 283] = 1
u[305, 284] = 1
u[306, 285] = 1
u[307, 286] = 1
u[308, 287] = 1
u[309, 288] = 1
u[310, 289] = 1
u[311, 290] = 1
u[312, 291] = 1
u[313, 292] = 1
u[314, 293] = 1
u[315, 294] = 1
u[316, 295] = 1
u[317, 296] = 1
u[318, 297] = 1
u[319, 298] = 1
u[320, 299] = 1
u[321, 300] = 1
u[322, 301] = 1
u[323, 302] = 1
u[324, 303] = 1
u[325, 304] = 1
u[326, 305] = 1
u[327, 306] = 1
u[328, 307] = 1
u[329, 308] = 1
u[330, 309] = 1
u[331, 310] = 1
u[332, 311] = 1
u[333, 312] = 1
u[334, 313] = 1
u[335, 314] = 1
u[336, 315] = 1
u[337, 316] = 1
u[338, 317] = 1
u[339, 318] = 1
u[340, 319] = 1
u[341, 320] = 1
u[342, 321] = 1
u[343, 322] = 1
u[344, 323] = 1
u[345, 324] = 1
u[346, 325] = 1
u[347, 326] = 1
u[348, 327] = 1
u[349, 328] = 1
u[350, 329] = 1
u[351, 330] = 1
u[352, 331] = 1
u[353, 332] = 1
u[354, 333] = 1
u[355, 334] = 1
u[356, 335] = 1
u[357, 336] = 1
u[358, 337] = 1
u[359, 338] = 1
u[360, 339] = 1
u[361, 340] = 1
u[362, 341] = 1
u[363, 342] = 1
u[364, 343] = 1
u[365, 344] = 1
u[366, 345] = 1
u[367, 346] = 1
u[368, 347] = 1
u[369, 348] = 1
u[370, 349] = 1
u[371, 350] = 1
u[372, 351] = 1
u[373, 352] = 1
u[374, 353] = 1
u[375, 354] = 1
u[376, 355] = 1
u[377, 356] = 1
u[378, 357] = 1
u[379, 358] = 1
u[380, 359] = 1
u[381, 360] = 1
u[382, 361] = 1
u[383, 362] = 1
u[384, 363] = 1
u[385, 364] = 1
u[386, 365] = 1
u[387, 366] = 1
u[388, 367] = 1
u[389, 368] = 1
u[390, 369] = 1
u[391, 370] = 1
u[392, 371] = 1
u[393, 372] = 1
u[394, 373] = 1
u[395, 374] = 1
u[396, 375] = 1
u[397, 376] = 1
u[398, 377] = 1
u[399, 378] = 1
u[400, 379] = 1
u[401, 380] = 1
u[402, 381] = 1
u[403, 382] = 1
u[404, 383] = 1
u[405, 384] = 1
u[406, 385] = 1
u[407, 386] = 1
u[408, 387] = 1
u[409, 388] = 1
u[410, 389] = 1
u[411, 390] = 1
u[412, 391] = 1
u[413, 392] = 1
u[414, 393] = 1
u[415, 394] = 1
u[416, 395] = 1
u[417, 396] = 1
u[418, 397] = 1
u[419, 398] = 1
u[420, 399] = 1
u[421, 400] = 1
u[422, 401] = 1
u[423, 402] = 1
u[424, 403] = 1
u[425, 404] = 1
u[426, 405] = 1
u[427, 406] = 1
u[428, 407] = 1
u[429, 408] = 1
u[430, 409] = 1
u[431, 410] = 1
u[432, 411] = 1
u[433, 412] = 1
u[434, 413] = 1
u[435, 414] = 1
u[436, 415] = 1
u[437, 416] = 1
u[438, 417] = 1
u[439, 418] = 1
u[440, 419] = 1
updateOp = u
updateOp6 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((441, 441))
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
u[41, 41] = 1
u[42, 43] = 1
u[43, 44] = 1
u[44, 45] = 1
u[45, 46] = 1
u[46, 47] = 1
u[47, 48] = 1
u[48, 49] = 1
u[49, 50] = 1
u[50, 51] = 1
u[51, 52] = 1
u[52, 53] = 1
u[53, 54] = 1
u[54, 55] = 1
u[55, 56] = 1
u[56, 57] = 1
u[57, 58] = 1
u[58, 59] = 1
u[59, 60] = 1
u[60, 61] = 1
u[61, 62] = 1
u[62, 62] = 1
u[63, 64] = 1
u[64, 65] = 1
u[65, 66] = 1
u[66, 67] = 1
u[67, 68] = 1
u[68, 69] = 1
u[69, 70] = 1
u[70, 71] = 1
u[71, 72] = 1
u[72, 73] = 1
u[73, 74] = 1
u[74, 75] = 1
u[75, 76] = 1
u[76, 77] = 1
u[77, 78] = 1
u[78, 79] = 1
u[79, 80] = 1
u[80, 81] = 1
u[81, 82] = 1
u[82, 83] = 1
u[83, 83] = 1
u[84, 85] = 1
u[85, 86] = 1
u[86, 87] = 1
u[87, 88] = 1
u[88, 89] = 1
u[89, 90] = 1
u[90, 91] = 1
u[91, 92] = 1
u[92, 93] = 1
u[93, 94] = 1
u[94, 95] = 1
u[95, 96] = 1
u[96, 97] = 1
u[97, 98] = 1
u[98, 99] = 1
u[99, 100] = 1
u[100, 101] = 1
u[101, 102] = 1
u[102, 103] = 1
u[103, 104] = 1
u[104, 104] = 1
u[105, 106] = 1
u[106, 107] = 1
u[107, 108] = 1
u[108, 109] = 1
u[109, 110] = 1
u[110, 111] = 1
u[111, 112] = 1
u[112, 113] = 1
u[113, 114] = 1
u[114, 115] = 1
u[115, 116] = 1
u[116, 117] = 1
u[117, 118] = 1
u[118, 119] = 1
u[119, 120] = 1
u[120, 121] = 1
u[121, 122] = 1
u[122, 123] = 1
u[123, 124] = 1
u[124, 125] = 1
u[125, 125] = 1
u[126, 127] = 1
u[127, 128] = 1
u[128, 129] = 1
u[129, 130] = 1
u[130, 131] = 1
u[131, 132] = 1
u[132, 133] = 1
u[133, 134] = 1
u[134, 135] = 1
u[135, 136] = 1
u[136, 137] = 1
u[137, 138] = 1
u[138, 139] = 1
u[139, 140] = 1
u[140, 141] = 1
u[141, 142] = 1
u[142, 143] = 1
u[143, 144] = 1
u[144, 145] = 1
u[145, 146] = 1
u[146, 146] = 1
u[147, 148] = 1
u[148, 149] = 1
u[149, 150] = 1
u[150, 151] = 1
u[151, 152] = 1
u[152, 153] = 1
u[153, 154] = 1
u[154, 155] = 1
u[155, 156] = 1
u[156, 157] = 1
u[157, 158] = 1
u[158, 159] = 1
u[159, 160] = 1
u[160, 161] = 1
u[161, 162] = 1
u[162, 163] = 1
u[163, 164] = 1
u[164, 165] = 1
u[165, 166] = 1
u[166, 167] = 1
u[167, 167] = 1
u[168, 169] = 1
u[169, 170] = 1
u[170, 171] = 1
u[171, 172] = 1
u[172, 173] = 1
u[173, 174] = 1
u[174, 175] = 1
u[175, 176] = 1
u[176, 177] = 1
u[177, 178] = 1
u[178, 179] = 1
u[179, 180] = 1
u[180, 181] = 1
u[181, 182] = 1
u[182, 183] = 1
u[183, 184] = 1
u[184, 185] = 1
u[185, 186] = 1
u[186, 187] = 1
u[187, 188] = 1
u[188, 188] = 1
u[189, 190] = 1
u[190, 191] = 1
u[191, 192] = 1
u[192, 193] = 1
u[193, 194] = 1
u[194, 195] = 1
u[195, 196] = 1
u[196, 197] = 1
u[197, 198] = 1
u[198, 199] = 1
u[199, 200] = 1
u[200, 201] = 1
u[201, 202] = 1
u[202, 203] = 1
u[203, 204] = 1
u[204, 205] = 1
u[205, 206] = 1
u[206, 207] = 1
u[207, 208] = 1
u[208, 209] = 1
u[209, 209] = 1
u[210, 211] = 1
u[211, 212] = 1
u[212, 213] = 1
u[213, 214] = 1
u[214, 215] = 1
u[215, 216] = 1
u[216, 217] = 1
u[217, 218] = 1
u[218, 219] = 1
u[219, 220] = 1
u[220, 221] = 1
u[221, 222] = 1
u[222, 223] = 1
u[223, 224] = 1
u[224, 225] = 1
u[225, 226] = 1
u[226, 227] = 1
u[227, 228] = 1
u[228, 229] = 1
u[229, 230] = 1
u[230, 230] = 1
u[231, 232] = 1
u[232, 233] = 1
u[233, 234] = 1
u[234, 235] = 1
u[235, 236] = 1
u[236, 237] = 1
u[237, 238] = 1
u[238, 239] = 1
u[239, 240] = 1
u[240, 241] = 1
u[241, 242] = 1
u[242, 243] = 1
u[243, 244] = 1
u[244, 245] = 1
u[245, 246] = 1
u[246, 247] = 1
u[247, 248] = 1
u[248, 249] = 1
u[249, 250] = 1
u[250, 251] = 1
u[251, 251] = 1
u[252, 253] = 1
u[253, 254] = 1
u[254, 255] = 1
u[255, 256] = 1
u[256, 257] = 1
u[257, 258] = 1
u[258, 259] = 1
u[259, 260] = 1
u[260, 261] = 1
u[261, 262] = 1
u[262, 263] = 1
u[263, 264] = 1
u[264, 265] = 1
u[265, 266] = 1
u[266, 267] = 1
u[267, 268] = 1
u[268, 269] = 1
u[269, 270] = 1
u[270, 271] = 1
u[271, 272] = 1
u[272, 272] = 1
u[273, 274] = 1
u[274, 275] = 1
u[275, 276] = 1
u[276, 277] = 1
u[277, 278] = 1
u[278, 279] = 1
u[279, 280] = 1
u[280, 281] = 1
u[281, 282] = 1
u[282, 283] = 1
u[283, 284] = 1
u[284, 285] = 1
u[285, 286] = 1
u[286, 287] = 1
u[287, 288] = 1
u[288, 289] = 1
u[289, 290] = 1
u[290, 291] = 1
u[291, 292] = 1
u[292, 293] = 1
u[293, 293] = 1
u[294, 295] = 1
u[295, 296] = 1
u[296, 297] = 1
u[297, 298] = 1
u[298, 299] = 1
u[299, 300] = 1
u[300, 301] = 1
u[301, 302] = 1
u[302, 303] = 1
u[303, 304] = 1
u[304, 305] = 1
u[305, 306] = 1
u[306, 307] = 1
u[307, 308] = 1
u[308, 309] = 1
u[309, 310] = 1
u[310, 311] = 1
u[311, 312] = 1
u[312, 313] = 1
u[313, 314] = 1
u[314, 314] = 1
u[315, 316] = 1
u[316, 317] = 1
u[317, 318] = 1
u[318, 319] = 1
u[319, 320] = 1
u[320, 321] = 1
u[321, 322] = 1
u[322, 323] = 1
u[323, 324] = 1
u[324, 325] = 1
u[325, 326] = 1
u[326, 327] = 1
u[327, 328] = 1
u[328, 329] = 1
u[329, 330] = 1
u[330, 331] = 1
u[331, 332] = 1
u[332, 333] = 1
u[333, 334] = 1
u[334, 335] = 1
u[335, 335] = 1
u[336, 337] = 1
u[337, 338] = 1
u[338, 339] = 1
u[339, 340] = 1
u[340, 341] = 1
u[341, 342] = 1
u[342, 343] = 1
u[343, 344] = 1
u[344, 345] = 1
u[345, 346] = 1
u[346, 347] = 1
u[347, 348] = 1
u[348, 349] = 1
u[349, 350] = 1
u[350, 351] = 1
u[351, 352] = 1
u[352, 353] = 1
u[353, 354] = 1
u[354, 355] = 1
u[355, 356] = 1
u[356, 356] = 1
u[357, 358] = 1
u[358, 359] = 1
u[359, 360] = 1
u[360, 361] = 1
u[361, 362] = 1
u[362, 363] = 1
u[363, 364] = 1
u[364, 365] = 1
u[365, 366] = 1
u[366, 367] = 1
u[367, 368] = 1
u[368, 369] = 1
u[369, 370] = 1
u[370, 371] = 1
u[371, 372] = 1
u[372, 373] = 1
u[373, 374] = 1
u[374, 375] = 1
u[375, 376] = 1
u[376, 377] = 1
u[377, 377] = 1
u[378, 379] = 1
u[379, 380] = 1
u[380, 381] = 1
u[381, 382] = 1
u[382, 383] = 1
u[383, 384] = 1
u[384, 385] = 1
u[385, 386] = 1
u[386, 387] = 1
u[387, 388] = 1
u[388, 389] = 1
u[389, 390] = 1
u[390, 391] = 1
u[391, 392] = 1
u[392, 393] = 1
u[393, 394] = 1
u[394, 395] = 1
u[395, 396] = 1
u[396, 397] = 1
u[397, 398] = 1
u[398, 398] = 1
u[399, 400] = 1
u[400, 401] = 1
u[401, 402] = 1
u[402, 403] = 1
u[403, 404] = 1
u[404, 405] = 1
u[405, 406] = 1
u[406, 407] = 1
u[407, 408] = 1
u[408, 409] = 1
u[409, 410] = 1
u[410, 411] = 1
u[411, 412] = 1
u[412, 413] = 1
u[413, 414] = 1
u[414, 415] = 1
u[415, 416] = 1
u[416, 417] = 1
u[417, 418] = 1
u[418, 419] = 1
u[419, 419] = 1
u[420, 421] = 1
u[421, 422] = 1
u[422, 423] = 1
u[423, 424] = 1
u[424, 425] = 1
u[425, 426] = 1
u[426, 427] = 1
u[427, 428] = 1
u[428, 429] = 1
u[429, 430] = 1
u[430, 431] = 1
u[431, 432] = 1
u[432, 433] = 1
u[433, 434] = 1
u[434, 435] = 1
u[435, 436] = 1
u[436, 437] = 1
u[437, 438] = 1
u[438, 439] = 1
u[439, 440] = 1
u[440, 440] = 1
updateOp = u
updateOp7 = tf.Variable(updateOp)

# Generate Update Operator
u = np.zeros((441, 441))
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
u[21, 21] = 1
u[22, 21] = 1
u[23, 22] = 1
u[24, 23] = 1
u[25, 24] = 1
u[26, 25] = 1
u[27, 26] = 1
u[28, 27] = 1
u[29, 28] = 1
u[30, 29] = 1
u[31, 30] = 1
u[32, 31] = 1
u[33, 32] = 1
u[34, 33] = 1
u[35, 34] = 1
u[36, 35] = 1
u[37, 36] = 1
u[38, 37] = 1
u[39, 38] = 1
u[40, 39] = 1
u[41, 40] = 1
u[42, 42] = 1
u[43, 42] = 1
u[44, 43] = 1
u[45, 44] = 1
u[46, 45] = 1
u[47, 46] = 1
u[48, 47] = 1
u[49, 48] = 1
u[50, 49] = 1
u[51, 50] = 1
u[52, 51] = 1
u[53, 52] = 1
u[54, 53] = 1
u[55, 54] = 1
u[56, 55] = 1
u[57, 56] = 1
u[58, 57] = 1
u[59, 58] = 1
u[60, 59] = 1
u[61, 60] = 1
u[62, 61] = 1
u[63, 63] = 1
u[64, 63] = 1
u[65, 64] = 1
u[66, 65] = 1
u[67, 66] = 1
u[68, 67] = 1
u[69, 68] = 1
u[70, 69] = 1
u[71, 70] = 1
u[72, 71] = 1
u[73, 72] = 1
u[74, 73] = 1
u[75, 74] = 1
u[76, 75] = 1
u[77, 76] = 1
u[78, 77] = 1
u[79, 78] = 1
u[80, 79] = 1
u[81, 80] = 1
u[82, 81] = 1
u[83, 82] = 1
u[84, 84] = 1
u[85, 84] = 1
u[86, 85] = 1
u[87, 86] = 1
u[88, 87] = 1
u[89, 88] = 1
u[90, 89] = 1
u[91, 90] = 1
u[92, 91] = 1
u[93, 92] = 1
u[94, 93] = 1
u[95, 94] = 1
u[96, 95] = 1
u[97, 96] = 1
u[98, 97] = 1
u[99, 98] = 1
u[100, 99] = 1
u[101, 100] = 1
u[102, 101] = 1
u[103, 102] = 1
u[104, 103] = 1
u[105, 105] = 1
u[106, 105] = 1
u[107, 106] = 1
u[108, 107] = 1
u[109, 108] = 1
u[110, 109] = 1
u[111, 110] = 1
u[112, 111] = 1
u[113, 112] = 1
u[114, 113] = 1
u[115, 114] = 1
u[116, 115] = 1
u[117, 116] = 1
u[118, 117] = 1
u[119, 118] = 1
u[120, 119] = 1
u[121, 120] = 1
u[122, 121] = 1
u[123, 122] = 1
u[124, 123] = 1
u[125, 124] = 1
u[126, 126] = 1
u[127, 126] = 1
u[128, 127] = 1
u[129, 128] = 1
u[130, 129] = 1
u[131, 130] = 1
u[132, 131] = 1
u[133, 132] = 1
u[134, 133] = 1
u[135, 134] = 1
u[136, 135] = 1
u[137, 136] = 1
u[138, 137] = 1
u[139, 138] = 1
u[140, 139] = 1
u[141, 140] = 1
u[142, 141] = 1
u[143, 142] = 1
u[144, 143] = 1
u[145, 144] = 1
u[146, 145] = 1
u[147, 147] = 1
u[148, 147] = 1
u[149, 148] = 1
u[150, 149] = 1
u[151, 150] = 1
u[152, 151] = 1
u[153, 152] = 1
u[154, 153] = 1
u[155, 154] = 1
u[156, 155] = 1
u[157, 156] = 1
u[158, 157] = 1
u[159, 158] = 1
u[160, 159] = 1
u[161, 160] = 1
u[162, 161] = 1
u[163, 162] = 1
u[164, 163] = 1
u[165, 164] = 1
u[166, 165] = 1
u[167, 166] = 1
u[168, 168] = 1
u[169, 168] = 1
u[170, 169] = 1
u[171, 170] = 1
u[172, 171] = 1
u[173, 172] = 1
u[174, 173] = 1
u[175, 174] = 1
u[176, 175] = 1
u[177, 176] = 1
u[178, 177] = 1
u[179, 178] = 1
u[180, 179] = 1
u[181, 180] = 1
u[182, 181] = 1
u[183, 182] = 1
u[184, 183] = 1
u[185, 184] = 1
u[186, 185] = 1
u[187, 186] = 1
u[188, 187] = 1
u[189, 189] = 1
u[190, 189] = 1
u[191, 190] = 1
u[192, 191] = 1
u[193, 192] = 1
u[194, 193] = 1
u[195, 194] = 1
u[196, 195] = 1
u[197, 196] = 1
u[198, 197] = 1
u[199, 198] = 1
u[200, 199] = 1
u[201, 200] = 1
u[202, 201] = 1
u[203, 202] = 1
u[204, 203] = 1
u[205, 204] = 1
u[206, 205] = 1
u[207, 206] = 1
u[208, 207] = 1
u[209, 208] = 1
u[210, 210] = 1
u[211, 210] = 1
u[212, 211] = 1
u[213, 212] = 1
u[214, 213] = 1
u[215, 214] = 1
u[216, 215] = 1
u[217, 216] = 1
u[218, 217] = 1
u[219, 218] = 1
u[220, 219] = 1
u[221, 220] = 1
u[222, 221] = 1
u[223, 222] = 1
u[224, 223] = 1
u[225, 224] = 1
u[226, 225] = 1
u[227, 226] = 1
u[228, 227] = 1
u[229, 228] = 1
u[230, 229] = 1
u[231, 231] = 1
u[232, 231] = 1
u[233, 232] = 1
u[234, 233] = 1
u[235, 234] = 1
u[236, 235] = 1
u[237, 236] = 1
u[238, 237] = 1
u[239, 238] = 1
u[240, 239] = 1
u[241, 240] = 1
u[242, 241] = 1
u[243, 242] = 1
u[244, 243] = 1
u[245, 244] = 1
u[246, 245] = 1
u[247, 246] = 1
u[248, 247] = 1
u[249, 248] = 1
u[250, 249] = 1
u[251, 250] = 1
u[252, 252] = 1
u[253, 252] = 1
u[254, 253] = 1
u[255, 254] = 1
u[256, 255] = 1
u[257, 256] = 1
u[258, 257] = 1
u[259, 258] = 1
u[260, 259] = 1
u[261, 260] = 1
u[262, 261] = 1
u[263, 262] = 1
u[264, 263] = 1
u[265, 264] = 1
u[266, 265] = 1
u[267, 266] = 1
u[268, 267] = 1
u[269, 268] = 1
u[270, 269] = 1
u[271, 270] = 1
u[272, 271] = 1
u[273, 273] = 1
u[274, 273] = 1
u[275, 274] = 1
u[276, 275] = 1
u[277, 276] = 1
u[278, 277] = 1
u[279, 278] = 1
u[280, 279] = 1
u[281, 280] = 1
u[282, 281] = 1
u[283, 282] = 1
u[284, 283] = 1
u[285, 284] = 1
u[286, 285] = 1
u[287, 286] = 1
u[288, 287] = 1
u[289, 288] = 1
u[290, 289] = 1
u[291, 290] = 1
u[292, 291] = 1
u[293, 292] = 1
u[294, 294] = 1
u[295, 294] = 1
u[296, 295] = 1
u[297, 296] = 1
u[298, 297] = 1
u[299, 298] = 1
u[300, 299] = 1
u[301, 300] = 1
u[302, 301] = 1
u[303, 302] = 1
u[304, 303] = 1
u[305, 304] = 1
u[306, 305] = 1
u[307, 306] = 1
u[308, 307] = 1
u[309, 308] = 1
u[310, 309] = 1
u[311, 310] = 1
u[312, 311] = 1
u[313, 312] = 1
u[314, 313] = 1
u[315, 315] = 1
u[316, 315] = 1
u[317, 316] = 1
u[318, 317] = 1
u[319, 318] = 1
u[320, 319] = 1
u[321, 320] = 1
u[322, 321] = 1
u[323, 322] = 1
u[324, 323] = 1
u[325, 324] = 1
u[326, 325] = 1
u[327, 326] = 1
u[328, 327] = 1
u[329, 328] = 1
u[330, 329] = 1
u[331, 330] = 1
u[332, 331] = 1
u[333, 332] = 1
u[334, 333] = 1
u[335, 334] = 1
u[336, 336] = 1
u[337, 336] = 1
u[338, 337] = 1
u[339, 338] = 1
u[340, 339] = 1
u[341, 340] = 1
u[342, 341] = 1
u[343, 342] = 1
u[344, 343] = 1
u[345, 344] = 1
u[346, 345] = 1
u[347, 346] = 1
u[348, 347] = 1
u[349, 348] = 1
u[350, 349] = 1
u[351, 350] = 1
u[352, 351] = 1
u[353, 352] = 1
u[354, 353] = 1
u[355, 354] = 1
u[356, 355] = 1
u[357, 357] = 1
u[358, 357] = 1
u[359, 358] = 1
u[360, 359] = 1
u[361, 360] = 1
u[362, 361] = 1
u[363, 362] = 1
u[364, 363] = 1
u[365, 364] = 1
u[366, 365] = 1
u[367, 366] = 1
u[368, 367] = 1
u[369, 368] = 1
u[370, 369] = 1
u[371, 370] = 1
u[372, 371] = 1
u[373, 372] = 1
u[374, 373] = 1
u[375, 374] = 1
u[376, 375] = 1
u[377, 376] = 1
u[378, 378] = 1
u[379, 378] = 1
u[380, 379] = 1
u[381, 380] = 1
u[382, 381] = 1
u[383, 382] = 1
u[384, 383] = 1
u[385, 384] = 1
u[386, 385] = 1
u[387, 386] = 1
u[388, 387] = 1
u[389, 388] = 1
u[390, 389] = 1
u[391, 390] = 1
u[392, 391] = 1
u[393, 392] = 1
u[394, 393] = 1
u[395, 394] = 1
u[396, 395] = 1
u[397, 396] = 1
u[398, 397] = 1
u[399, 399] = 1
u[400, 399] = 1
u[401, 400] = 1
u[402, 401] = 1
u[403, 402] = 1
u[404, 403] = 1
u[405, 404] = 1
u[406, 405] = 1
u[407, 406] = 1
u[408, 407] = 1
u[409, 408] = 1
u[410, 409] = 1
u[411, 410] = 1
u[412, 411] = 1
u[413, 412] = 1
u[414, 413] = 1
u[415, 414] = 1
u[416, 415] = 1
u[417, 416] = 1
u[418, 417] = 1
u[419, 418] = 1
u[420, 420] = 1
u[421, 420] = 1
u[422, 421] = 1
u[423, 422] = 1
u[424, 423] = 1
u[425, 424] = 1
u[426, 425] = 1
u[427, 426] = 1
u[428, 427] = 1
u[429, 428] = 1
u[430, 429] = 1
u[431, 430] = 1
u[432, 431] = 1
u[433, 432] = 1
u[434, 433] = 1
u[435, 434] = 1
u[436, 435] = 1
u[437, 436] = 1
u[438, 437] = 1
u[439, 438] = 1
u[440, 439] = 1
updateOp = u
updateOp8 = tf.Variable(updateOp)

# Define WHILE Statement
loopCount5 = tf.Variable(0)
def condition5(sigma, loopCount5):
    sigma = tf.matmul(sigma, testOp5)
    return tf.logical_and(tf.logical_not(tf.reduce_all(tf.equal(sigma, tf.zeros([441], dtype=tf.float64)))), tf.less(loopCount5, tf.constant(10000)))
def body5(sigma, loopCount5):
    loopCount5 = tf.add(loopCount5, tf.constant(1))
    outOfLoop = tf.matmul(sigma, testNOp5)
    sigma = tf.matmul(sigma, testOp5)
    sigma6_ogn = sigma
    sigma = tf.matmul(sigma, updateOp5)
    sigma6_choose1 = sigma
    sigma = sigma6_ogn
    sigma = tf.matmul(sigma, updateOp6)
    sigma6_choose2 = sigma
    sigma = sigma6_ogn
    sigma = tf.matmul(sigma, updateOp7)
    sigma6_choose3 = sigma
    sigma = sigma6_ogn
    sigma = tf.matmul(sigma, updateOp8)
    sigma6_choose4 = sigma
    sigma = tf.matmul(sigma6_choose1, tf.constant(0.25*np.identity(441), dtype=tf.float64))
    sigma = tf.add(sigma, tf.matmul(sigma6_choose2, tf.constant(0.25*np.identity(441), dtype=tf.float64)))
    sigma = tf.add(sigma, tf.matmul(sigma6_choose3, tf.constant(0.25*np.identity(441), dtype=tf.float64)))
    sigma = tf.add(sigma, tf.matmul(sigma6_choose4, tf.constant(0.25*np.identity(441), dtype=tf.float64)))
    sigma = tf.add(sigma, outOfLoop)
    return sigma, loopCount5

# Main Program
with tf.Session() as sess:
    sess.run(tf.global_variables_initializer())
    sigma1_ogn = sigma
    sigma = tf.matmul(sigma, updateOp1)
    sigma1_choose1 = sigma
    sigma = sigma1_ogn
    sigma = tf.matmul(sigma, updateOp2)
    sigma1_choose2 = sigma
    sigma = tf.matmul(sigma1_choose1, tf.constant(0.5*np.identity(441), dtype=tf.float64))
    sigma = tf.add(sigma, tf.matmul(sigma1_choose2, tf.constant(0.5*np.identity(441), dtype=tf.float64)))
    sigma2_ogn = sigma
    sigma = tf.matmul(sigma, updateOp3)
    sigma2_choose1 = sigma
    sigma = sigma2_ogn
    sigma = tf.matmul(sigma, updateOp4)
    sigma2_choose2 = sigma
    sigma = tf.matmul(sigma2_choose1, tf.constant(0.5*np.identity(441), dtype=tf.float64))
    sigma = tf.add(sigma, tf.matmul(sigma2_choose2, tf.constant(0.5*np.identity(441), dtype=tf.float64)))
    sigma, loopCount5 = tf.while_loop(condition5, body5, [sigma, loopCount5])
    print sess.run(sigma)

# To Show Graph in Tensorboard
writer=tf.summary.FileWriter("./", sess.graph)
