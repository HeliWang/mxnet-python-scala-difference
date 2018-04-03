## Description
Inconsistent output from mxnet-python and mxnet-scala.

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

Compiler (gcc/clang/mingw/visual studio):

MXNet commit hash:
(Paste the output of `git rev-parse HEAD` here.)

Build config:
(Paste the content of config.mk, or the build command.)

## Error Message:
(Paste the complete error message, including stack trace.)

## Minimum reproducible example
(If you are using your own code, please provide a short script that reproduces the error. Otherwise, please provide link to the existing example.)

## Steps to reproduce
(Paste the commands you ran that produced the error.)

1.
2.

## What have you tried to solve it?

1.
2.
