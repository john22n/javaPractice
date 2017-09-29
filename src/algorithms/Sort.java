package algorithms;

/**
 * Created by JohnNoriega22 on 9/28/17.
 */
public class Sort {

    public static void bubbleSort(int[] set) {
        boolean swapped = false;
        System.out.println("orginal array");
        printArr(set);

        do {
            for (int i = 0; i < set.length - 1; i++) {
                if (set[i] > set[i + 1]) {
                    int temp = set[i];
                    set[i] = set[i + 1];
                    set[i + 1] = temp;
                    printArr(set);
                    swapped = true;
                }
            }
        }while(swapped);
    }
    private static void printArr(int[] arr ) {
        for (int i: arr) {


            System.out.println(i + " " );
        }
        System.out.println();
    }
}
