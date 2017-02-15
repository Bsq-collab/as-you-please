# as-you-please

For length=1, the runtime was about 750000 nanoseconds

For length=10, the runtime was about 30000 nanoseconds (average was 30676) 

For length=100, the runtime was about 102611 nanoseconds (average was 124574)

To make up for our weird results for length=1, we did length=50 and the runtime was about 60000 nanoseconds (average was 58429)

We aren't sure why the length=1 runtime is much longer than the other runtimes for larger lengths. Our code has a conditional
statement specifically for length=1, which just returns the array itself. We expected a short runtime because this process would
only be one key operation.
