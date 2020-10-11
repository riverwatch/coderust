package demo.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTests {


    @Test
    public void findByKey(){
        BinarySearch binarySearch = new BinarySearch();
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80};
        int existsAt = binarySearch.findByKey(values, 30);

        assertEquals(existsAt, 2);
    }
}
