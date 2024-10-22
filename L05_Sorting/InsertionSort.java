package L05_Sorting;

import java.util.Arrays;

public class InsertionSort {
    public void sort( int[] array ) {
        for ( int i = 1; i < array.length; i++ ) {
            int current = array[ i ];

            int j = i - 1;

            // finds it correct place on the left
            while ( j >= 0 && array[ j ] > current ) {
                // shift element to the right
                array[ j + 1 ] = array[ j ];
                j--;
            }

            array[ j + 1 ] = current;
        }
    }
}

class InsertionSortTest {
    public static void main( String[] args ) {
        // int[] numbers = { };
        // int[] numbers = { 7 };
        // int[] numbers = { 7, 3 };
        int[] numbers = { 7, 3, 5, 2, 3, 1, 5, 8 };
        var sorter = new InsertionSort( );
        sorter.sort( numbers );
        System.out.println( Arrays.toString( numbers ) );
    }
}
