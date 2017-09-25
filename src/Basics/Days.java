package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class Days {
    public static void main(String[] args) {
        //execute diff blocks of code using switch
        String dayOfWeek = "your day";

        switch (dayOfWeek) {
            case "Monday" :
                System.out.println("today is monday");
                break;
            case "Tuesday" :
                System.out.println("today is tuesday");
                break;
            case "Wednesday" :
                System.out.println("today is wednesday");
                break;
            case "Thursday" :
                System.out.println("today is thursday");
                break;
            case "Frinday" :
                System.out.println("today is friday");
                break;
            case "Saturday" :
                System.out.println("today is saturday");
                break;
            case "Sunday" :
                System.out.println("today is sunday");
                default:
                    System.out.println("yo mama");
        }
    }
}
