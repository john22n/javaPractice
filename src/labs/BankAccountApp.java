package labs;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123343456", 1000);
        BankAccount acc2 = new BankAccount("324123412", 2300);
        BankAccount acc3 = new BankAccount("234523452", 2323);

        acc1.setName("john");
        System.out.println(acc1.getName());
        acc1.makeDeposit(32342);
        acc1.makeDeposit(400);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());

    }
}
///seperate class-----------------------------------------------
class BankAccount implements IInterest {
    private static int id = 1000;               //internal id
    private String accountNumber; //combination of id + random 2d number + first 2 of ssn number
    private static final String routingNumber = "004540057";
    private String name;
    private String ssn;
    private double balance;

    //constructors
    public BankAccount(String ssn, double intitalDep) {
        balance = intitalDep;
        System.out.println("new account created");
        id++;
        this.ssn = ssn;
        System.out.println(id);
        setAccountNumber();
    }

    public void setAccountNumber() {
        int random = (int) (Math.random() * 100);
        accountNumber = id + random + ssn.substring(0,2);
        System.out.println("your account number " + accountNumber);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void payBill(double amount) {
        balance = balance - amount;
        showBalance();
    }
    public void makeDeposit(double amount) {
        balance = balance + amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println("balance: " + balance);
    }

    public void accrueInterest() {

    }
    @Override
    public void accrue() {
        balance = balance * (1 + rate/100);
        showBalance();
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n account number: " + accountNumber + "\n routing number " + routingNumber + " \n balance " + balance;
    }

}