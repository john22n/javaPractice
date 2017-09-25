package labs;
import java.io.*;

/**
 * Created by JohnNoriega22 on 9/25/17.
 */
public class PhoneNumberApp {

    public static void main(String[] args) {
        //will read text file and will retieve phone number
        //valid phone number: 10 digit longs
        //there is 911
        //area code cannot start in 0 or 9
        //there cannot be 911 in the phone number

        String filename = "/Users/JohnNoriega22/Documents/myProjects/playground/phoneNumber.txt";
        File file = new File(filename);
        String[] phoneNums = new String[4];
        String phoneNum = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

        for (int i =0; i < phoneNums.length; i++) {


            phoneNum = br.readLine();

        }
            br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("couldnt read file");
            }




            try {
                if (phoneNum.length() != 10) {
                    throw new TenDigitException(phoneNum);
                }
                if (phoneNum.substring(0,1).equals("0") || phoneNum.substring(0,1).equals("9")) {
                    throw new AreaCodeException(phoneNum);
                }
                for (int i =0; i < phoneNum.length() -2; i++) {
                    if (phoneNum.substring(i, i + 1).equals("9")) {
                        if (phoneNum.substring(i, i +2).equals("11")){
                            throw new EmergencyException(phoneNum);
                        }

                    }
                }
                System.out.println(phoneNum);
            } catch (TenDigitException e){
                System.out.println("no");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println(e.toString());
            }
    }
}

class TenDigitException extends Exception{
    String num;
    TenDigitException(String num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "TenDigitsException " + num;
    }
}

class AreaCodeException extends Exception{
    String num;
    AreaCodeException(String num) {
        this.num = num;
    }
    @Override
    public String toString() {
        return "area code exception" + num;
    }

}

class EmergencyException extends Exception{
    String num;
    EmergencyException(String num) {
        this.num = num;

    }
    @Override
    public String toString() {
        return "has 911 in it " + num;
    }

}