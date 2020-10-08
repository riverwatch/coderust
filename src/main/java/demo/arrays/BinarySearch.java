package demo.arrays;

public class BinarySearch {

    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        int[] values = {10, 20, 30, 40, 50, 60, 70, 80};
        int existsAt = binarySearch.findByKey(values, 30);

        System.out.println("exists at "+ existsAt);
    }

    /**
     * Assuming we have an ordered int [] return the array index for the given key otherwise return -1.
     *
     * @param values the array to search
     * @param key the key value in the array we are searching for
     * @return the index in the array that corresponds to the key
     */
    public int findByKey(int[] values, int key){

        int index = -1;
        int high = values.length - 1;
        int low = 0;

        while( low <= high){

            int middleIndex = (high - low) / 2;
            int current = values[middleIndex];

            if(current == key){
                return middleIndex;
            } else if(current < middleIndex){
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }
        }

        return index;
    }
}
