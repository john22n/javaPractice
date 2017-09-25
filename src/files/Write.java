package files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by JohnNoriega22 on 9/25/17.
 */
public class Write {

    public static void main(String[] args) {
        // define path
        String fileName = "/Users/JohnNoriega22/Documents/myProjects/playground/fileToWrite.txt";
        String message = "I'm writing data placed in a file";
        //create file in java
        File file = new File(fileName);

        // open file

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(message);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("closing file writer");
        }

        //write to the file
        //close resource
    }
}
