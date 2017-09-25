package assignments.readFilePasswordAssignment;
import com.sun.javafx.tools.packager.PackagerException;

import java.io.*;

/**
 * Created by JohnNoriega22 on 9/25/17.
 */
public class Main {

    public static void main(String[] args) {
        String fileName = "/Users/JohnNoriega22/Documents/myProjects/playground/readFilePasswords.txt";
        File file = new File(fileName);

        String password;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while( (password = br.readLine()) != null) {
                if (!password.matches(".*\\d+.*") && !password.matches("%[a-zA-Z]%") && !password.matches("!|@|#")) {
                    throw new PasswordMatchException(password);
                }
            }

            br.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PasswordMatchException e) {
            e.toString();
        }
    }
}
