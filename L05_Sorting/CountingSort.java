package L05_Sorting;

import java.util.Arrays;

public class CountingSort {
    public void sort( int[] array, int max ) {
        int[] counts = new int[ max + 1 ];
        for ( var item : array ) {
            counts[ item ]++;
        }
        var k = 0;
        for ( var i = 0; i < counts.length; i++ ) {
            for ( var j = 0; j < counts[ i ]; j++ ) {
                array[ k++ ] = i;
            }
        }
    }
}

class CountingSortTest {
    public static void main( String[] args ) {
        // int[] numbers = { };
        // int[] numbers = { 7 };
        // int[] numbers = { 7, 3 };
        int[] numbers = { 7, 3, 5, 2, 3, 1, 5, 8 };
        var sorter = new CountingSort( );
        sorter.sort( numbers, 8 );
        System.out.println( Arrays.toString( numbers ) );
    }
}
