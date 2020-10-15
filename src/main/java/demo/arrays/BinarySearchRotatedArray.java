package demo.arrays;

public class BinarySearchRotatedArray {

    public static void main(String []args){

        BinarySearchRotatedArray rotatedArray = new BinarySearchRotatedArray();

        int[] v1 = {6, 7, 1, 2, 3, 4, 5};
        System.out.println("Key(3) found at: " + rotatedArray.binarySearchRotated(v1, 3));
        System.out.println("Key(6) found at: " + rotatedArray.binarySearchRotated(v1, 6));

        int[] v2 = {4, 5, 6, 1, 2, 3};
        System.out.println("Key(3) found at: " + rotatedArray.binarySearchRotated(v2, 3));
        System.out.println("Key(6) found at: " + rotatedArray.binarySearchRotated(v2, 6));

        int[] v3 = {3, 4, 5, 6, 1, 2};
        System.out.println("Key(2) found at: " + rotatedArray.binarySearchRotated(v3, 2));
        System.out.println("Key(5) found at: " + rotatedArray.binarySearchRotated(v3, 5));
    }

    public int binarySearchRotated(int[] arr, int key){

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end){

            mid = start + (end - start) / 2;

            if (arr[mid] == key)
                return mid;

            if(arr[mid] <= arr[end] && key >= arr[mid] && key <= arr[end])
                start = mid + 1;
            else if (arr[start] <= arr[mid] && key <= arr[mid] && key >= arr[start])
                end = mid - 1;
            else if (arr[end] <= arr[mid])
                start = mid + 1;
            else if (arr[start] >= arr[mid])
                end = mid - 1;

            else
                return -1;

        }


        return -1;
    }
}
