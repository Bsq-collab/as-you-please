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

	int[] l = new int[a.length + b.length];

	int i = 0, j = 0;

	while ( i + j < l.length) {

	    if ( i == a.length ) {

		l[i+j] = b[j];

		j++;

	    } else if ( j == b.length ) {

		l[i+j] = a[i];

		i++;

	    } else if (a[i] > b[j]){

		l[i+j] = b[j];

		j++;

	    } else {

		l[i+j] = a[i];

		i++;

	    }

	}

	return l;

    }//end merge()
    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) {

	if (arr.length == 1) {
	    
		return arr;

	}

	int[] a = new int[arr.length / 2];

	int[] b = new int[arr.length - arr.length / 2];

	for (int i = 0; i < arr.length; i++) {

	    if ( i < arr.length/2 )

		a[i] = arr[i];

	    else

		b[i - arr.length/2] = arr[i];

	}

	return merge(sort(a), sort(b));

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
