/*======================================
  class MergeSortTester

  ALGORITHM:
  1. if the array length is less than or equal to 1, return the array. (base case for recursion; an array of length one is already sorted). 
  2. If the length is greater than one, split the array into two, then sort each half(using the same method, so this method is recursive).
  3. MergeSort.merge your two halves together, which will take your two halves, which are both sorted, and combine them to make a sorted whole. 

  BIG-OH CLASSIFICATION OF ALGORITHM:
               O(nlogn)

  Mean execution times for dataset of size n: 
  Batch size: <# of times each dataset size was run>
  n=1       time: ~750000 nanoseconds
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
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
	System.out.println(duration);
	
	int[] arr10=new int[10];
	pop(arr10);
	System.out.println(Arrays.toString(arr10));
	
	long sTime = System.nanoTime();
	MergeSort.sort(arr10);
	long eTime = System.nanoTime();
	System.out.println(Arrays.toString(MergeSort.sort(arr10)));
	long d = (eTime - sTime);
	System.out.println(d);
	
	int[] arr100=new int[100];
	pop(arr100);
	
	System.out.println(Arrays.toString(arr100));
	
	long s = System.nanoTime();
	MergeSort.sort(arr100);
	long e = System.nanoTime();
	System.out.println(Arrays.toString(arr100));
	long dur = (e - s);
	System.out.println(dur);


    }//end main

}//end class
