package exceptionFiles;
import java.util.Scanner;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class PaymentsApp {

    public static void main(String[] args) {
        double payment = 0;
        boolean  positivePayment = true;

        // ask user for input


        //get amount test value
        do {
            System.out.print("enter payment amount: ");

            Scanner in = new Scanner(System.in);
            try {
                payment = in.nextDouble();
                if (payment < 0) {
                    //throw error
                    throw new NegativePaymentException(payment);
                } else {
                    positivePayment = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println("error" + e.toString());
                positivePayment = false;
            }
        } while(!positivePayment);

        //print confirmation

        System.out.println("thanks for payment of " + payment);

    }
}
