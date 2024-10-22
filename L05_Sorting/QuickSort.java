package L05_Sorting;

import java.util.Arrays;

public class QuickSort {
    public void sort( int[] array ) {
        sort( array, 0, array.length - 1 );
    }
    private void sort( int[] array, int start, int end ) {

        // base condition
        if ( start >= end )
            return;

        // Partition
        var boundary = partition( array, start, end );

        // Sort left
        sort( array, start, boundary - 1 );

        // Sort right
        sort( array, boundary + 1, end );
    }

    private int partition( int[] array, int start, int end ) {
        int pivot = array[ end ];
        var boundary = start - 1;
        for ( int i = start; i <= end; i++ ) {
            if ( array[ i ] <= pivot ) {
                boundary++;

                // swap two elements
                int temp = array[ i ];
                array[ i ] = array[ boundary ];
                array[ boundary ] = temp;

            }
        }
        return boundary;
    }
}

class QuickSortTest {
    public static void main( String[] args ) {
        // int[] numbers = { };
        // int[] numbers = { 7 };
        // int[] numbers = { 7, 3 };
        int[] numbers = { 7, 3, 5, 2, 3, 1, 5, 8 };

        var sorter = new QuickSort( );
        sorter.sort( numbers );
        System.out.println( Arrays.toString( numbers ) );
    }
}