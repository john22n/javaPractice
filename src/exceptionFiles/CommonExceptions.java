package exceptionFiles;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class CommonExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        // identify potential problem area
        // surround with try-catch block
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("cant divide by zero");
            System.out.println(e.toString());

        }
        System.out.println("program closing");

        String[] states = {"ca", "tx", "fl", "ny"};

        for (int i = 0; i <= states.length; i++) {
            try {
                System.out.println(states[i]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("error: index outside of domain");
                System.out.println(e.toString());
            } finally {
                System.out.println("iterating through array");
            }
        }
    }
}
