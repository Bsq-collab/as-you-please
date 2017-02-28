# as-you-please
Bayan Berri, Theodore Peters, Nicolas Naing-- Team As you please

APCS2 pd4

Lab#00-- What Does the Data Say

2017-02-28

### Averages
For length=1, the runtime was about 107 nanoseconds

For length=10, the runtime was about 1,796 nanoseconds 

For length=100, the runtime was about 14,800 nanoseconds

For length=1000, the runtime was about 138,477 nanoseconds

For length=10,000, the runtime was about 1,439,076 nanoseconds

For length=100,000, the runtime was about 16,682,320. nanoseconds

For length=1,000,000, the runtime was about 176,653,200 nanoseconds

### Changes and Lessons
At first the length=1 runtime was much longer than the other runtimes for larger lengths because we did not let the machine "warm up" first. After running other sizes before, we got a much smaller runtime, which makes more sense. Also, After consulting the QAF we decided to incorporate loops in order to get a larger batch size of 1,000. Averaging a larger batch size makes the outliers less significant. Eventually it balanced out to about 100 nanoseconds.

### Method
Originally, all our calculations were done in the main method by declaring a start time, then sorting, then finding the difference which is the runtime. However, that ended up being disorganized and hard to keep track of. Instead we created methods that would gather 1000 run times using a while loop and put them in an array. Next, we summed up all the values in this array of runtimes and divided by 1000 to get the average runtime. 

We also found the average of each array size multiple times so that we can make a scattergraph. 

### Graph

##### Conclusion
Even though our runtime is not exactly nlogn, it somewhat resembles an nlogn curve with the base of the logarithm being about 1.02.
