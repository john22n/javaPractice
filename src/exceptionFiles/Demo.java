package exceptionFiles;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class Demo {
    public static void main(String[] args) {
       doMath(12,0);
    }

    public static void doMath(int a, int b) {
        answer(a,b);
    }
    public static double answer(int x, int y) {
        return x/y;
    }
}
