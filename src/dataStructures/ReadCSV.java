package dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by JohnNoriega22 on 9/26/17.
 */
public class ReadCSV {
    public static void main(String[] args) {
        //this method will read data from a csv file

        List<String[]> data = new ArrayList<String[]>();

        String fileName = "/Users/JohnNoriega22/Documents/myProjects/playground/ReadCSVFile.csv";
        String testRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            //read data
            while ((testRow = br.readLine()) != null) {
                //parse data by commas
                String[] line = testRow.split(",");
                System.out.println(line);
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] account: data) {

            for (String field: account) {
                System.out.println(field);
            }
        }

    }
}
