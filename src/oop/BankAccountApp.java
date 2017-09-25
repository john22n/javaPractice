package oop;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class BankAccountApp {
    public static void main(String[] args) {
        // creat new bank account >> think of instantiate an object
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "12344";
        // encapsulation to define vaiables
        acc1.setName("roger rabbit");
        System.out.println("ride around and get it " + acc1.getName());
        acc1.balance = 100000;

        acc1.deposit(234234);
        acc1.withdraw(234);

        acc1.setRate();
        acc1.increaseRate();

        acc1.setSsn("23423423424234");
        System.out.println(acc1.getSsn());
        //polymorphism through overridding
        System.out.println(acc1.toString());

        //polymorphism through overloading
        BankAccount acc2 = new BankAccount("checking");
        acc1.accountNumber = "123a12";
        BankAccount acc3 = new BankAccount("checking", 1212.32);
        acc3.accountNumber = "1312312";
//
//        acc3.checkBalance();
//
//        //demo for inheritance
//
//        CdAccount cd1 = new CdAccount();
//        cd1.balance = 3000;
//        cd1.name = "juan";
//        System.out.println(cd1.toString());
//        cd1.compond();




    }
}
