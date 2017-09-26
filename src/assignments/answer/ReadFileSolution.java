package assignments.answer;
import java.io.*;

/**
 * Created by JohnNoriega22 on 9/25/17.
 */
public class ReadFileSolution {
    public static void main(String[] args) {
        //read file of passwords
        //test against criteria
        String filename = "/Users/JohnNoriega22/Documents/myProjects/playground/readFilePasswords.txt";
        String[] passwords = new String[13];

        File file = new File(filename);
        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
         for (int i = 0; i < passwords.length; i++) {
            passwords[i] = br.readLine();
         }
        } catch (FileNotFoundException e) {
            System.out.println("couldnt open file");
        } catch (IOException e) {
            System.out.println("couldnt read file");
        }

        for(String password: passwords) {
            System.out.println(password);

            boolean hasNum = false;
            boolean hasChar = false;
            boolean hasSpecialChar = false;
            boolean hasInvalidChar = false;
            //contains number
            for (int n =0; n < password.length(); n++) {
                if ("0123456789".contains(password.substring(n, n + 1).toLowerCase())) {

                    hasNum = true;
                } else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n+1).toLowerCase())) {

                    hasChar = true;
                } else if ("!@#=*%$".contains(password.substring(n, n+1).toLowerCase())) {

                    hasSpecialChar = true;
                } else {
                    try {
                        throw new InvalidCharException(password.substring(n, n + 1));
                    } catch (InvalidCharException e) {
                        e.toString();
                    }
                    hasInvalidChar = true;
                    System.out.println("string contains invalid char");

                }
            }

            if (hasInvalidChar) {
                try {
                    throw new InvalidCharException(password);
                }catch (InvalidCharException e) {
                    e.toString();
                }

            } else if (!hasNum || !hasChar || !hasSpecialChar) {

            } else {
                System.out.println("valid password");
            }
            //contains letter
            //contains special character
        }
    }
}

class InvalidCharException extends Exception{
        String ch;
        public InvalidCharException(String ch){
                this.ch = ch;
             }
    @Override
        public String toString() {
            return "invalid char excpetion " + ch;
            }
        }