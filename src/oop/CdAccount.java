package oop;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class CdAccount extends BankAccount implements iRate{
    String interestRate ;

    void compond() {
        System.out.println("componding interest");
    }

}
