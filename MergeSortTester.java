/*======================================
  class MergeSortTester

  ALGORITHM:
  1. if the array length is less than or equal to 1, return the array. (base case for recursion; an array of length one is already sorted). 
  2. If the length is greater than one, split the array into two, then sort each half(using the same method, so this method is recursive).
  3. MergeSort.merge your two halves together, which will take your two halves, which are both sorted, and combine them to make a sorted whole. 

  BIG-OH CLASSIFICATION OF ALGORITHM:
               O(nlogn)

  Mean execution times for dataset of size n: 
  Batch size: 10
  n=1       time: ~354 nanoseconds
  n=10      time: ~30,676 nanoseconds
  n=100     time: ~102,611 nanoseconds
  n=1000    time: ~530,674 nanoseconds
  n=10000   time: ~3,097,320 nanoseconds
  n=100000  time: ~34,265,158 nanoseconds
  n=1000000 time: ~238,633,637 nanoseconds
  n=10000000time: ~

  ANALYSIS:For some reason the execution time for an array of size one was much larger than that of an array of size 10 or 100. 
  This seems off because an array of size 1 is already sorted so it just has to be returned.
  However, as expected for each other test case the execution time increased with the array size. however it is not exactly nlogn.
  ======================================*/

import java.util.Arrays;
public class MergeSortTester 
{
    public static int[] pop(int[] arr){
	for(int i=0; i<arr.length; i++){
	    arr[i]= (int) (Math.random()*100);
	}
	return arr;
    }
    public static long[] getVals(int[] arrpop){
	long[] data= new long[1000];
	int ctr= 1;
	while(ctr<=1000){
	    long startTime=System.nanoTime();
	    MergeSort.sort(pop(arrpop));
	    long endTime=System.nanoTime();
	    long duration= (endTime-startTime);
	    data[ctr-1]=duration;
	    ctr+=1;
	}
	return data;
    }
    public static double getSum(long[] dataSet){
	double sum=0;
	int ctr=0;
	while (ctr<1000){
	    sum+= dataSet[ctr];
	    ctr+=1;
	}
	return sum;
    }
    public static double getAvg(double sum){
	return sum/1000;
    }
	
	
    

    /******************************
     * execution time analysis 
     * We defined the start time and then subtracted that from the start time. 
     * to get the execution time we subtracted the start time from the end time. 
     *In order to get the time we used the built in nanoTime. 
     ******************************/
    public static void main( String[] args ) 
    {

	int[] arr1=new int[1];
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
	System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
		System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
		System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
		System.out.println("average for n=1)");
	System.out.println(getAvg(getSum(getVals(pop(arr1)))));
        

	int[] arr10=new int[10];
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));
	System.out.println("average for n=10)");	
	System.out.println(getAvg(getSum(getVals(pop(arr10)))));


	int[] arr100=new int[100];
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));
	System.out.println("average for n=100)");
	System.out.println(getAvg(getSum(getVals(pop(arr100)))));



	int[] arr1000=new int[1000];
	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));

	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));
	
	System.out.println("average for n=1,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000)))));
	
	int[] arr10000=new int[10000];
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));

	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	System.out.println("average for n=10,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr10000)))));
	
	int[] arr100000=new int[100000];
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	System.out.println("average for n=100,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr100000)))));
	
	int[] arr1000000=new int[1000000];
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	System.out.println("average for n=1,000,000)");
	System.out.println(getAvg(getSum(getVals(pop(arr1000000)))));
        
	

	/*
	//	System.out.println(Arrays.toString(arr1));
	
	long startTime = System.nanoTime();
	MergeSort.sort(arr1);
	long endTime = System.nanoTime();
	MergeSort.sort(arr1);
	//System.out.println(Arrays.toString(arr1));
	long duration = (endTime - startTime);  
	System.out.println("duration for n=1");
	System.out.println(duration);
	
	int[] arr10=new int[10];
	pop(arr10);
	//System.out.println(Arrays.toString(arr10));
	
	long sTime = System.nanoTime();
	MergeSort.sort(arr10);
	long eTime = System.nanoTime();
	MergeSort.sort(arr10);
	long d = (eTime - sTime);
	System.out.println("duration for n=10");
	System.out.println(d);
	
	int[] arr100=new int[100];
	pop(arr100);
	
	//System.out.println(Arrays.toString(arr100));
	
	long s = System.nanoTime();
	MergeSort.sort(arr100);
	long e = System.nanoTime();
	MergeSort.sort(arr100);
	long dur = (e - s);
	System.out.println("duration for n=100");
	System.out.println(dur);


	int[] big=new int[10000000];
	pop(big);
	//	System.out.println(Arrays.toString(big));
	
	long sBig = System.nanoTime();
	MergeSort.sort(big);
	long eBig = System.nanoTime();
	//	System.out.println(Arrays.toString(MergeSort.sort(big)));
	long durBig = (eBig - sBig);
	System.out.println("duration for n=10,000,000");
	System.out.println(durBig);
	*/


    }//end main

}//end class
