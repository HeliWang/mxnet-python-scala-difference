## Description
Inconsistent output from mxnet-python and mxnet-scala when importing the same mxnet saved model (kim-0100.params, kim-symbol.json) and have the same input (np.ones((1000, 47, 300))).

MxNet (Python) Output:
```
Shape of output:
(1000,6)
First three rows of data:
-38.8981  -3.1511 -13.0952  17.5691 -20.4780  19.5707
-38.8981  -3.1511 -13.0952  17.5691 -20.4780  19.5707
-38.8981  -3.1511 -13.0952  17.5691 -20.4780  19.5707
```

MxNet (Scala) Output:
```
Shape of output:
(1000,6)
First three rows of data:
-35.025154 -5.7320843 -13.143161 17.261858 -19.199905 22.68964
-40.023407 0.13218212 -8.405195  16.911377 -23.552662 14.029578
-39.91144  -8.177831  -6.575444  12.67445  -11.054529 15.726346
```

## Environment info (Required)

```
----------Python Info----------
('Version      :', '2.7.12')
('Compiler     :', 'GCC 5.4.0 20160609')
('Build        :', ('default', 'Dec  4 2017 14:50:18'))
('Arch         :', ('64bit', 'ELF'))
------------Pip Info-----------
('Version      :', '9.0.3')
('Directory    :', '/home/h379wang/.local/lib/python2.7/site-packages/pip')
----------MXNet Info-----------
('Version      :', '1.2.0')
('Directory    :', '/home/h379wang/incubator-mxnet/python/mxnet')
Hashtag not found. Not installed from pre-built package.
----------System Info----------
('Platform     :', 'Linux-4.13.0-1011-gcp-x86_64-with-Ubuntu-16.04-xenial')
('system       :', 'Linux')
('node         :', 'instance-1')
('release      :', '4.13.0-1011-gcp')
('version      :', '#15-Ubuntu SMP Mon Feb 12 16:29:04 UTC 2018')
----------Hardware Info----------
('machine      :', 'x86_64')
('processor    :', 'x86_64')
Architecture:          x86_64
CPU op-mode(s):        32-bit, 64-bit
Byte Order:            Little Endian
CPU(s):                2
On-line CPU(s) list:   0,1
Thread(s) per core:    2
Core(s) per socket:    1
Socket(s):             1
NUMA node(s):          1
Vendor ID:             GenuineIntel
CPU family:            6
Model:                 63
Model name:            Intel(R) Xeon(R) CPU @ 2.30GHz
Stepping:              0
CPU MHz:               2300.000
BogoMIPS:              4600.00
Hypervisor vendor:     KVM
Virtualization type:   full
L1d cache:             32K
L1i cache:             32K
L2 cache:              256K
L3 cache:              46080K
NUMA node0 CPU(s):     0,1
Flags:                 fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ss ht syscall nx pdpe1gb rdtscp lm constant_tsc rep_good nopl xtopology nonstop_tsc cpuid pni pclmulqdq ssse3 fma cx16 pcid sse4_1 sse4_2 x2apic movbe popcnt aes xsave avx f16c rdrand hypervisor lahf_lm abm invpcid_single pti retpoline fsgsbase tsc_adjust bmi1 avx2 smep bmi2 erms invpcid xsaveopt
----------Network Test----------
Setting timeout: 10
Timing for MXNet: https://github.com/apache/incubator-mxnet, DNS: 0.0073 sec, LOAD: 0.4301 sec.
Timing for PYPI: https://pypi.python.org/pypi/pip, DNS: 0.0016 sec, LOAD: 0.0566 sec.
Timing for FashionMNIST: https://apache-mxnet.s3-accelerate.dualstack.amazonaws.com/gluon/dataset/fashion-mnist/train-labels-idx1-ubyte.gz, DNS: 0.0743 sec, LOAD: 0.6235 sec.
Timing for Conda: https://repo.continuum.io/pkgs/free/, DNS: 0.0209 sec, LOAD: 0.0855 sec.
Timing for Gluon Tutorial(en): http://gluon.mxnet.io, DNS: 0.0777 sec, LOAD: 0.4415 sec.
Timing for Gluon Tutorial(cn): https://zh.gluon.ai, DNS: 0.1679 sec, LOAD: 0.9276 sec.
```

Package used (Python/R/Scala/Julia): Scala and Python

For Scala user, please provide:
1. Java version: (`java -version`)
```
java version "1.8.0_161"
Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)
```
2. Maven version: (`mvn -version`)
```
Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-24T14:49:05-05:00)
Maven home: /opt/apache-maven-3.5.3
Java version: 1.8.0_161, vendor: Oracle Corporation
Java home: /usr/lib/jvm/java-8-oracle/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "4.13.0-1011-gcp", arch: "amd64", family: "unix"
```
3. Scala runtime if applicable: (`scala -version`)
```
Scala code runner version 2.11.6 -- Copyright 2002-2013, LAMP/EPFL
```

## Build info (Required if built from source)

Compiler (gcc/clang/mingw/visual studio): gcc

MXNet commit hash: 22908431b23538a8f0145817016460b3dd2300f1
(Paste the output of `git rev-parse HEAD` here.)

Build config:
(Paste the content of config.mk, or the build command.)
```
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.

#-------------------------------------------------------------------------------
#  Template configuration for compiling mxnet
#
#  If you want to change the configuration, please use the following
#  steps. Assume you are on the root directory of mxnet. First copy the this
#  file so that any local changes will be ignored by git
#
#  $ cp make/config.mk .
#
#  Next modify the according entries, and then compile by
#
#  $ make
#
#  or build in parallel with 8 threads
#
#  $ make -j8
#-------------------------------------------------------------------------------

#---------------------
# choice of compiler
#--------------------

export CC = gcc
export CXX = g++
export NVCC = nvcc

# whether compile with options for MXNet developer
DEV = 0

# whether compile with debug
DEBUG = 0

# whether compile with profiler
USE_PROFILER =

# whether to turn on segfault signal handler to log the stack trace
USE_SIGNAL_HANDLER =

# the additional link flags you want to add
ADD_LDFLAGS =

# the additional compile flags you want to add
ADD_CFLAGS =

#---------------------------------------------
# matrix computation libraries for CPU/GPU
#---------------------------------------------

# whether use CUDA during compile
USE_CUDA = 0

# add the path to CUDA library to link and compile flag
# if you have already add them to environment variable, leave it as NONE
# USE_CUDA_PATH = /usr/local/cuda
USE_CUDA_PATH = NONE

# whether to enable CUDA runtime compilation
ENABLE_CUDA_RTC = 1

# whether use CuDNN R3 library
USE_CUDNN = 0

#whether to use NCCL library
USE_NCCL = 0
#add the path to NCCL library
USE_NCCL_PATH = NONE

# whether use opencv during compilation
# you can disable it, however, you will not able to use
# imbin iterator
USE_OPENCV = 1

#whether use libjpeg-turbo for image decode without OpenCV wrapper
USE_LIBJPEG_TURBO = 0
#add the path to libjpeg-turbo library
USE_LIBJPEG_TURBO_PATH = NONE

# use openmp for parallelization
USE_OPENMP = 1

# whether use MKL-DNN library
USE_MKLDNN = 0

# whether use NNPACK library
USE_NNPACK = 0

# choose the version of blas you want to use
# can be: mkl, blas, atlas, openblas
# in default use atlas for linux while apple for osx
UNAME_S := $(shell uname -s)
ifeq ($(UNAME_S), Darwin)
USE_BLAS = apple
else
USE_BLAS = atlas
endif

# whether use lapack during compilation
# only effective when compiled with blas versions openblas/apple/atlas/mkl
USE_LAPACK = 1

# path to lapack library in case of a non-standard installation
USE_LAPACK_PATH =

# add path to intel library, you may need it for MKL, if you did not add the path
# to environment variable
USE_INTEL_PATH = NONE

# If use MKL only for BLAS, choose static link automatically to allow python wrapper
ifeq ($(USE_BLAS), mkl)
USE_STATIC_MKL = 1
else
USE_STATIC_MKL = NONE
endif

#----------------------------
# Settings for power and arm arch
#----------------------------
ARCH := $(shell uname -a)
ifneq (,$(filter $(ARCH), armv6l armv7l powerpc64le ppc64le aarch64))
	USE_SSE=0
else
	USE_SSE=1
endif

#----------------------------
# distributed computing
#----------------------------

# whether or not to enable multi-machine supporting
USE_DIST_KVSTORE = 0

# whether or not allow to read and write HDFS directly. If yes, then hadoop is
# required
USE_HDFS = 0

# path to libjvm.so. required if USE_HDFS=1
LIBJVM=$(JAVA_HOME)/jre/lib/amd64/server

# whether or not allow to read and write AWS S3 directly. If yes, then
# libcurl4-openssl-dev is required, it can be installed on Ubuntu by
# sudo apt-get install -y libcurl4-openssl-dev
USE_S3 = 0

#----------------------------
# performance settings
#----------------------------
# Use operator tuning
USE_OPERATOR_TUNING = 1

# Use gperftools if found
USE_GPERFTOOLS = 1

# Use JEMalloc if found, and not using gperftools
USE_JEMALLOC = 1

#----------------------------
# additional operators
#----------------------------

# path to folders containing projects specific operators that you don't want to put in src/operators
EXTRA_OPERATORS =

#----------------------------
# other features
#----------------------------

# Create C++ interface package
USE_CPP_PACKAGE = 0

#----------------------------
# plugins
#----------------------------

# whether to use caffe integration. This requires installing caffe.
# You also need to add CAFFE_PATH/build/lib to your LD_LIBRARY_PATH
# CAFFE_PATH = $(HOME)/caffe
# MXNET_PLUGINS += plugin/caffe/caffe.mk

# WARPCTC_PATH = $(HOME)/warp-ctc
# MXNET_PLUGINS += plugin/warpctc/warpctc.mk

# whether to use sframe integration. This requires build sframe
# git@github.com:dato-code/SFrame.git
# SFRAME_PATH = $(HOME)/SFrame
# MXNET_PLUGINS += plugin/sframe/plugin.mk
```

## Error Message:
No error.

## Minimum reproducible example
### 
* Model Prediction by MxNet in Scala
  
  Run prediction.sh in scalakim folder:
![scalamxnet](https://user-images.githubusercontent.com/12112939/38222914-d5395ca0-36b5-11e8-8bf0-fc1e3374cfbe.png)

* Model Prediction by MxNet in Python

  Run python prediction.py in pythonkim folder:
![python-mxnet](https://user-images.githubusercontent.com/12112939/38222848-78b555b0-36b5-11e8-8568-67712b191a4b.png)

## Steps to reproduce
(Paste the commands you ran that produced the error.)

1.
2.

## What have you tried to solve it?

1.
2.
