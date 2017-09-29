package algorithms;

/**
 * Created by JohnNoriega22 on 9/27/17.
 */
public class Search {

    public static int linearSearch(int[] set, int find) {
        //iterate through set, find target
        for (int i = 0; i < set.length; i++) {
            if (set[i] == find) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] set, int target, int start, int end) {
        //binary search assumes array is sorted therefore continually spliting search domain in half
        int middle = (int) Math.floor((start + end)/2);
        int value = set[middle];


        if (target > value) {
            return binarySearch(set, target, middle + 1, end);
        } else if (target < value) {
            return binarySearch(set, target, start , middle -1);
        }
        return value;
    }
}
