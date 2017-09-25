package oop;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class AccountApp {

    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        la.increaseRate();
        la.setRate();
        la.setAmmortSchedule();
        la.setTerm(20);

        //polymorphism : changes where wer are pointing
        iRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate();
    }
}
