package demo.arrays;

import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

public class MaxSlidingWindowTests {

    @Test
    public void whenOrdered() {
        MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayDeque orderedArray = maxSlidingWindow.findMaxSlidingWindow(array, 3);

        assertArrayEquals(orderedArray.toArray(), new Integer[]{3,4,5,6,7,8,9,10});
    }

    @Test
    public void whenRandom(){
        MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();

        int[] array2 = {10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8};
        ArrayDeque randomArray = maxSlidingWindow.findMaxSlidingWindow(array2, 3);

        assertArrayEquals(randomArray.toArray(), new Integer[]{10,9,23,23,34,56,67,67,67,-1});
    }

}
