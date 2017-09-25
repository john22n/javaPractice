package exceptionFiles;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class NegativePaymentException extends Exception {
    //define varibles;

    double payment;

    //constructor that takes the value that would throw the exception
    // assign value of local variable to class variable
    public NegativePaymentException(double payment) {
        this.payment = payment;
        System.out.println("ERROR: negative payment");
    }

    //overide tostring to include specfic info about exception
    @Override
    public String toString() {
        return "error: cant take negative payment" + payment;
    }
}

