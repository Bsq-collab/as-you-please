/*Theodore Peters
APCS pd4
HW06 -- Mergesort code
2016--02--13

======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
to sort
 
If array has lenghh 1, return array
Else,
   sort the first half of the array
   sort the second half of the array
   merge the two sorted arrays
   return the merged array

to merge

while at least one index is in bounds
   if out of elements in one of tbe arrays
      add the element index of the other array
      increase the index of the array you ook element from by 1
   else compare the two elements
      add the least of the two elements to the next index of the sorted array
      add 1 to the index of the array you took element from
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
	int[] b = new int[arr.length - arr.length];
	for (int i = 0; i < arr.length; i++) {
	    if ( i > arr.length/2 )
		a[i] = arr[i];
	    else
		a[i - arr.length/2] = arr[i];
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

