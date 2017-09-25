package oop;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class BankAccount implements iRate {
    //define variables
    String accountNumber;

    //static >> belongs to class and not the object instance
    //final >> defines a constant
    private static final String rountingNumber = "12345";

    // instance variable
    private String name;
    private String ssn;
    double balance = 0;

    //constructor definition: unique methods
        // usded to define, setup, initialize properties of an object
        //implicitly called appon instaniation
        //same name as class itself
        //have no return type
    BankAccount() {
        System.out.println("new account created");
    }
    //overloading: call same method name with different arguments
    BankAccount(String accountType) {
        System.out.println("new account created" + accountType);
    }
    BankAccount(String accountType, double initialDeposit) {
        System.out.println(" arguments " + accountType + " " +  initialDeposit);
        String errMsg = null;
        if (initialDeposit < 1000) {
            errMsg = "Error minium deposit must be at leasst $1,000";
        } else {
            errMsg = ("thanks for that inital deposit");
        }
        System.out.println(errMsg);
        balance = initialDeposit;
    }


    //define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("activity deposit");
    }
    void withdraw(double amount) {
        balance = balance - amount;
        showActivity("withdraw");
    }
    private void showActivity(String activity) {
        System.out.println("recent transaction" + activity);
        System.out.println("new balance is "  + balance);
    }
    void checkBalance() {
        System.out.println("balance is " + balance);
    }
    void getStatus() {

    }
    @Override
    public String toString() {
        return "[ " + name + ", accountNumber" + accountNumber + "routting number" + rountingNumber +  ", Balance: $ "  + balance + "]";
    }
    // setters and getters
    // allow user to define name

    public void setName(String name) {
        this.name = "mr" +  name;
    }
    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void setRate() {
        System.out.println("setting rate");
    }
    public void increaseRate() {
        System.out.println("increasing rate");
    }
}
