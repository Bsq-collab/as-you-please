# as-you-please

For length=1, the runtime was about 354 nanoseconds

For length=10, the runtime was about 30000 nanoseconds (average was 30676) 

For length=100, the runtime was about 102,611 nanoseconds (average was 124,574)

For length=1000, the runtime was about 530,674 nanoseconds

For length=10000, the runtime was about 3,097,320 nanoseconds

For length=100000, the runtime was about 34,265,158 nanoseconds

For length=1000000, the runtime was about 238,633,637 nanoseconds

To make up for our weird results for length=1, we did length=50 and the runtime was about 60000 nanoseconds (average was 58429)

At first the length=1 runtime was much longer than the other runtimes for larger lengths because we did not let the machine "warm up" first. After running other sizes before, we got a much smaller runtime, which makes more sense.

Even though our runtime is not exactly nlogn, it somewhat resembles an nlogn curve with the base of the logarithm being about 1.02.
