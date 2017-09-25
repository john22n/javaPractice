package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class Weather {
    public static void main(String[] args) {
        //give us suggestins on what to wear based on climate or temp
        int temp = 45;
        String sunCondition = "Overcast";

        if (temp > 80) {
            System.out.println("its nice wear tshirt ");
        } else if (temp > 60 && sunCondition == "Sunny") {
            System.out.println("its cool wear long sleeve");
            System.out.println("wear hat cuz sun");
        } else if (temp > 50 || sunCondition == "Overcast") {
            System.out.println("ist cool wear warm closes");
        }
        else {
            System.out.println("bring sweater");
        }
    }
}
