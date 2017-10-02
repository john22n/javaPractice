package algorithms;

/**
 * Created by JohnNoriega22 on 10/1/17.
 */
public class Misc {

    public void print(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ",  " + product);
    } // runtime = O (n)

    public void printPairs(int[] array) {
        for (int i  = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }// runtime O (N^2)
    }

    public static void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; i++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }// runtime = O (n ^2)
    }

    //two diff arrays

    public static void printUnorderedPairs(int[] arrA, int[] arrB) {
        for (int i =0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] < arrB[j]) {
                    System.out.println(arrA[i] + ", " +  arrB[j]);
                }
            }// runtime = O (a*b)
        }
    }




}
