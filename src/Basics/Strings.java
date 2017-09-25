package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class Strings {
    public static void main(String[] args) {
        String bookTitle = "The Lord of the rings";

        if(bookTitle.contains("rings")){
            System.out.println("has rings in it");
        }
        String broswer  = "Chrome";
        if (broswer.equalsIgnoreCase("chrome")){
            System.out.println("browser is chrome");
        }
        String firstName = "john";
        String lastName = "doe";
        String ssn = "123122325";

        //print the initials puls last4 digits of ssn

        System.out.print(firstName.substring(0,1));
        System.out.print(lastName.substring(0,1));
        System.out.print(ssn.substring(5));
    }

}
