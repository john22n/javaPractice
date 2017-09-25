package files;
import java.io.*;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class Read {

    public static void main(String[] args) {
        //define file path
        String filePath = "/Users/JohnNoriega22/Documents/myProjects/playground/fileToRead.txt";
        String txt = null;
        //create file in Java
        File file = new File(filePath);
        //open file



        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            txt = br.readLine();

            //close resource

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("error: file not found " + filePath);
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("couldnt read file data" + filePath);
        } finally {
            System.out.println("finished reading");
        }

        //read file
        System.out.println(txt);
    }
}
