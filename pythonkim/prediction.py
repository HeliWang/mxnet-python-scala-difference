import numpy as np
import mxnet as mx
from collections import namedtuple
import sys
import os
import random
import numpy as np
from numpy import array

random_input = np.ones((1000, 47, 300)) #np.random.rand(1000, 47, 300)

mod = mx.module.Module.load("kim", 100, data_names=["input_0"], label_names=None)
mod.bind(for_training=False, data_shapes=[('input_0', random_input.shape)], label_shapes=None)

print("MxNet (Python) Output:")
Batch = namedtuple('Batch', ['data'])
mod.forward(Batch([mx.nd.array(random_input)]))
output = mod.get_outputs()[0]
print("Shape of output:")
print(output.shape)
print("First three rows of data:")
print(output[0])
print(output[1])
print(output[2])
