package assignments.creditCardStatementReader;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by JohnNoriega22 on 9/26/17.
 */
public class Main {
    public static void main(String[] args) {



        String fileName = "/Users/JohnNoriega22/Documents/myProjects/playground/creditCardFile.csv";
        String dataRow;
        List<String[]> list = new ArrayList<String[]>();
        double balance = 0;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();




        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((dataRow = br.readLine()) != null) {

                String[] line = dataRow.substring(1, dataRow.length() -1).split(",");
                list.add(line);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] stuff: list) {


            if (stuff[1].equalsIgnoreCase("CREDIT")) {
                balance += Double.parseDouble(stuff[3].substring(0,5));
            }
             else if (stuff[1].equalsIgnoreCase("DEBIT")) {
                balance -= Double.parseDouble(stuff[3]);
            }


        }

        if (balance > 0 ) {
            double tax = balance * .10;
            balance += tax;
            String moneyString = formatter.format(balance);

            System.out.println("you have been charged a 10% fee: " + moneyString);

        } else if (balance == 0) {
            System.out.println("thank you for your payment");
        } else {
            String moneyString = formatter.format(balance);
            System.out.println("thank you for your payment: " + moneyString);
        }
    }
}
