package algorithms;

/**
 * Created by JohnNoriega22 on 9/27/17.
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = { 10, 2342, 23 , 543 , 125, 2345234, 5562345 };
        int[] sortedNums = {1,2,3,4,5,6,7,8,9,20};

        int pos = Search.linearSearch(nums, 23);
        System.out.println("found target at: " + pos);

        int index = Search.binarySearch(sortedNums, 9, 0, sortedNums.length -1);
        System.out.println("Bs position found at: " + index);

        //CALLED BUBBLE sort
        Sort.bubbleSort(nums);

    }
}
