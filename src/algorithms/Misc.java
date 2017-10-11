package algorithms;

import javax.xml.soap.Node;

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

    public void printUnorderedPairsWithK(int[] arrA, int[] arrB) {
        for (int i =0; i < arrA.length; i++) {
            for (int j =0; j < arrB.length; i++) {
                for (int k = 0; k < 100000; k++) {
                    System.out.println(arrA[i] + ", " + arrB[j]);
                }// nothgin has really changed here. 1000000 units of work is still constant, so the runtime 0 (ab)
            }
        }

    }

    //reverse an array
//    public void (int[] array) {
//        for (int i = 0; i < array.length/2; i++) {
//            int other = array.length - i - 1;
//            int temp = array[i];
//            array[i] = array[other];
//            array[other] = temp;
//        }//runtime is O(n), the fact that it only goes through half of the array does not impact big O time;
//    }

//    int sum(Node node) {
//        if (node == null) {
//            return 0;
//        }
//        return sum(node.left) + node.value + sum(node.right);
//    }
    //checks if number is print by checking for divisibility on numbers less than it. it only needs to go up to the square
    // root of n cuz if n is divisible by a number greater than its square root then its divisible by something smaller than it

    boolean isPrime(int n) {
        for (int x = 2; x <= Math.sqrt(n); x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }// runtime O (sqrt(n));

    //computes n!

    int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n -1);
        }
    } //runtime O(n);

    //counts all permutations of a string
    void permutation(String str) {
        permutation(str, "");
    }
    void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0,1) + str.substring(i +1);
                permutation(rem, prefix + str.charAt(i));
            }// runtime O (n^2 + n!)
        }
    }

    //coputes Nth Fibonacci number
//    int fib(int n) {
//        if (n <= 0) return 0;
//        else if (n == 1) return 1;
//        return fib(n -1) + fib(n -2);
//    }// runtime O(2^n) closer to O(1.6^2)

    //computes fib from 0 to N
//    void allFib(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(i + ":" + fib(i));
//        }
//    }
    int fib(int n) {
        if (n <= 0) return 0;
        else if (n ==1) return 1;
        return fib(n -1) + fib(n -2);
    } // runtime O(2^N)


    //prints fib number from 0 to n, this time stores (caches) prevously computed values in an integer array
    void allFib(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i, memo));
        }
    }
    int fib(int n, int[] memo) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (memo[n] > 0) return memo[n];
        memo[n] = fib(n -1, memo) + fib(n -2, memo);
        return memo[n];
    }// runtime O(N) this technique is called memoization, very common to optimize exponential time recursive algorithms

    //prints the pwers of 2 from 1 through n (inclusive).
    int powerOf2(int n) {
        if (n < 1) {
            return 0;
        }
        else if (n ==1) {
            System.out.println(n);
            return 1;
        } else {
            int prev = powerOf2(n/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }// runtime O (log N)
//+++++++++++++++++++++++++++++++++++++++++EXERCISE STARTS
    //computes product of a and b
    int product ( int a, int b ) {
        int sum = 0;
        for (int i =0; i < b; i++) {
            sum += a;

        }
        return sum; // assumed runtime 0(n)
    }// actual O(b)

    //computes a^b
    int power (int a, int b) {
        if ( b < 0) {
            return 0; //error
        }
        else if ( b == 0) {
            return 1;
        }
        else {
            return a * power(a, b -1);
        }// assumed O(N)
    }//actual O(b)

    //computes a % b
    int mod ( int a, int b) {
        if (b <= 0 ) {
            return 1;
        }
        int div = a/b;
        return a - div * b;

    }// assumed runtime log n
    //actual o(1)

    //perfoms integer division

    int div (int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;
    } // assumed runttime o(n)
    //o a/b

    //computes integer square root of a number.

    int sqrt(int n) {
        return sqrt_helper(n,1,n);
    }

    int sqrt_helper(int n, int min, int max) {
        if (max < min) return -1;
        int guess = ( min + max) /2;
        if (guess * guess ==n) {
            return guess;
        }
        else if (guess * guess < n) {
            return sqrt_helper(n, guess + 1,max);
        } else {
            return sqrt_helper(n, min, guess -1);
        }// guess2^n
    }//acutal: O log n

    //computes square root, by increasingly large number until it finds the right value (or too high)
    int sqrtByIncrease(int n) {
        for (int guess = 1; guess * guess <=n; guess++) {
            if (guess * guess == n) {
                return guess;
            }
        }
        return -1;
    }//guess O N
    //actual O sqrt(n)


    //binary search tree worst case n log n
    //acutal O N

    //guess O N
    // actual ON

    //appends a vlue to an arrya by creating a new, longer array and returning this longer array
    int[] copyArray(int[] array) {
        int[] copy = new int[0];
        for (int value: array) {
            copy = appendToNew(copy, value);
        }
        return copy;
    }
    int[] appendToNew(int[] array, int value) {
        //cpy all elements over to new array
        int[] bigger = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }
        //add new element
        bigger[bigger.length - 1] = value;
        return bigger;
    }
    //guess 0 N

    // actual: O N^2

    //sums digits in a number
    int sumdigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n %10;
            n /= 10;
        }
        return sum;
    } // guess 0 N
    //actual: O log N

    //prints all string of length k where the characters are in sorted order
    // does this by generating all string of length k and then checking if each is sorted

    int numchars = 26;
    void printSortedString(int remaining) {
        printSortedStrings(remaining, "");
    }
    void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            } else {
                for (int i = 0; i < numchars; i++) {
                    char c = ithLetter(i);
                    printSortedStrings(remaining -1 , prefix  + c);
                }
            }
        }
    }

    boolean isInOrder(String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i -1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }
    char ithLetter(int i) {
        return (char) (((int) 'a') + i);
    }// guess O N

    // actual: O kc^k

    //computes intersection (number of elements in common) of two arrays
    //checks by sorting on array then iterating through array binary search

//    int intersection(int[] a, int[] b) {
//        mergesort(b);
//        int intersect = 0;
//
//        for (int x: a) {
//            if (binarySearch(b, x) >= 0) {
//                intersect++;
//            }
//        }
//        return intersect;
   // }// guess O N log N
    //actual O b log b + a log b

}
