package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class NumbersCalc {
    public static void main(String[] args) {
        System.out.println("program starting");
        printName();
        int a = 10;
        int b = 20;
        addNumbers(a, b);
        System.out.println("returning product " + multiplyNumbers(a,b));
    }


    static void printName(){
        System.out.println("my name is tim");
    }
    static void addNumbers(int a , int b){
        int sum =  a + b;
        System.out.println("sum of numbers " + sum);
        //will add two numbersR
    }
    static int multiplyNumbers(int a, int b){
        addNumbers(a,b);
        int product =  a * b;
        return product;
    }
}
