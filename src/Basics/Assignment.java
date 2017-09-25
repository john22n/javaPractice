package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class Assignment {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("question 2");
        System.out.println(fac(4));
        System.out.println("question 3");
    }

    static int sum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    };

    static int fac(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findAvg(int[] arr) {
        int sum =0;
        for (int i =0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }




}
