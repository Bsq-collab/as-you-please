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
  n=1       time: ~650000 nanoseconds (n=1 seems off)
  n=10      time: ~30,000 nanoseconds
  n=100     time: ~125,000 nanoseconds
  ...
  n=99999  time: ~30,000,000 nanoseconds

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

    /******************************
     * execution time analysis 
     * We defined the start time and then subtracted that from the start time. 
     * to get the execution time we subtracted the start time from the end time. 
     *In order to get the time we used the built in nanoTime. 
     ******************************/
    public static void main( String[] args ) 
    {
	int[] arr1=new int[1];
	pop(arr1);

	System.out.println(Arrays.toString(arr1));
	
	long startTime = System.nanoTime();
	MergeSort.sort(arr1);
	long endTime = System.nanoTime();
	System.out.println(Arrays.toString(arr1));
	long duration = (endTime - startTime);  
	System.out.println("duration for n=1");
	System.out.println(duration);
	
	int[] arr10=new int[10];
	pop(arr10);
	System.out.println(Arrays.toString(arr10));
	
	long sTime = System.nanoTime();
	MergeSort.sort(arr10);
	long eTime = System.nanoTime();
	System.out.println(Arrays.toString(MergeSort.sort(arr10)));
	long d = (eTime - sTime);
	System.out.println("duration for n=10");
	System.out.println(d);
	
	int[] arr100=new int[100];
	pop(arr100);
	
	System.out.println(Arrays.toString(arr100));
	
	long s = System.nanoTime();
	MergeSort.sort(arr100);
	long e = System.nanoTime();
	System.out.println(Arrays.toString(MergeSort.sort(arr100)));
	long dur = (e - s);
	System.out.println("duration for n=100");
	System.out.println(dur);

	int[] big=new int[99999];
	pop(big);
	//	System.out.println(Arrays.toString(big));
	
	long sBig = System.nanoTime();
	MergeSort.sort(big);
	long eBig = System.nanoTime();
	//	System.out.println(Arrays.toString(MergeSort.sort(big)));
	long durBig = (eBig - sBig);
	System.out.println("duration for n=99999");
	System.out.println(durBig);
	


    }//end main

}//end class
