package assignments.creditCardStatementReader;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JohnNoriega22 on 9/26/17.
 */
public class Main {
    public static void main(String[] args) {

        String fileName = "/Users/JohnNoriega22/Documents/myProjects/playground/creditCardFile.csv";
        String dataRow;
        List<String[]> list = new ArrayList<String[]>();
        double balance;

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

//        for (String[] stuff: list) {
//            balance = 0;
//
//
////            System.out.println(stuff[1] + " " +  Double.parseDouble(stuff[3].substring(0, 6)) );
//            System.out.println(stuff);
//
//
//            if (stuff[1].equals("CREDIT")) {
//                balance += Double.parseDouble(stuff[3].substring(0,5));
//            }
//             else if (stuff[1].equals("DEBIT")) {
//                balance -= Double.parseDouble(stuff[3]);
//            }
//           System.out.println(balance);
//        }

        for (String[] listed : list) {

            for (String field : listed) {
                System.out.print(field + "\n");

            }

        }
    }
}
