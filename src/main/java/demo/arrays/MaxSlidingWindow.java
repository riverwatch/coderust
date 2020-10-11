package demo.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow{

    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> results = new ArrayDeque<>();
        Deque<Integer> list = new LinkedList<>();

        for(int i = 0; i < windowSize; i++){
            while (!list.isEmpty() && arr[list.peekLast()] <= arr[i]){
                list.removeLast();
            }

            list.addLast(i);
        }

        for(int i = windowSize; i < arr.length; i++){
            results.addLast(arr[list.getFirst()]);

            //remove items not in this window.
            while (!list.isEmpty() && list.peek() <= i-windowSize){
                list.removeFirst();
            }

            while (!list.isEmpty() && arr[list.peekLast()] <= arr[i]){
                list.removeLast();
            }

            list.addLast(i);
        }

        results.addLast(arr[list.getFirst()]);

        return results;
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Max = " + findMaxSlidingWindow(array, 3));

        int[] array2 = {10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67};
        System.out.println("Array = " + Arrays.toString(array2));
        System.out.println("Max = " + findMaxSlidingWindow(array2, 3));
    }
}
