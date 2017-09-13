import numpy as np
import random
import matplotlib.pyplot as plt

result = np.zeros(16)
result[11] += 1
result[13] += 1
result[14] += 1
result[15] += 1
result[10] += 1
result[10] += 1
result[14] += 1
result[8] += 1
result[9] += 1
result[14] += 1
result[10] += 1
result[11] += 1
result[10] += 1
result[13] += 1
result[12] += 1
result[10] += 1

print result
fig,ax = plt.subplots()
xs = np.arange(16)
ax.bar(xs, result)
plt.show()
