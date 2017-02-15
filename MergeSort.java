/*
  Nicolas Naing
  APCS2 pd4
  HW6 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
  2017-02-11
*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm: 
  1. If arr.length <=1, return arr (already sorted) (base case for recursion)
  2. If arr.length >1, split arr into two, then sort each half (using same 
  method, so this method is recursive)
  3. MergeSort.merge your two halves together, which will take your two halves,
  which are both sorted, and combine them to make a sorted whole
  
  Example for arr=[3,2,0,1]
  = sort[3,2] + sort[0,1]
  = (sort[3] + sort[2]) + (sort[0] + sort[1])
  = (merge( [3], [2])) + merge([0], [1])
  = merge ([2,3], [0,1])
  = [0,1,2,3]
  ======================================*/

public class MergeSort {

    /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    
    private static int[] merge( int[] a, int[] b ) {
	if (a.length==0) {
	    return b;}
	if (b.length==0) {
	    return a;}
	else {
	    int counter1=0;
	    int counter2=0;
	    int finalCounter=0;
	    int[] result = new int[a.length+b.length];
	    while (counter1<a.length && counter2<b.length) {
		if (a[counter1]<= b[counter2]) {
		    result[finalCounter]=a[counter1];
		    finalCounter++;
		    counter1++;
		}
		else {
		    result[finalCounter] = b[counter2];
		    finalCounter++;
		    counter2++;
		}
	    }
	    if (finalCounter < a.length+b.length && counter1< a.length) {
		while (finalCounter<a.length+b.length) {
		    result[finalCounter]=a[counter1];
		    finalCounter++;
		    counter1++;
		}
	    }
	    else {
		while (finalCounter<a.length+b.length) {
		    result[finalCounter]=b[counter2];
		    finalCounter++;
		    counter2++;
		}
	    }
	    return result;
	}
    }//end merge()
    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) {
	int[] result = new int[arr.length];
	if (arr.length<=1) {
	    result=arr;
	    return result;
	}
	else {
	    int[] first = new int[arr.length / 2];
	    int[] second = new int[arr.length - first.length];
	    for (int i=0; i<first.length; i++) {
		first[i]=arr[i];
	    }
	    for (int j=0; j<second.length; j++) {
		second[j]=arr[first.length+j];
	    }
	    first=sort(first);
	    second=sort(second);
	    result=merge(first, second);
	    return result;
	}
    }//end sort()

    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------

    //main method for testing
    public static void main( String [] args ) {

	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};
	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );
	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );
	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );
	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
    }//end main()

}//end class MergeSort
