package oop;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class LoanAccount implements iRate{

    @Override
    public void setRate() {
        System.out.println("Rate");
    }

    @Override
    public void increaseRate() {
        System.out.println("increase it");
    }

    public void setTerm(int term) {
        System.out.println("setting term to " + term + " years");
    }

    public void setAmmortSchedule() {
        System.out.println("set scheudle");
    }

}
