package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class Cities {
    public static void main(String[] args) {
        String[] cities = {"New York", "San Fran", "Dallas", "Miami"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        //declare array


        String[] countries;
        //define array
        countries = new String[2];
        countries[0] = "usa";
        countries[1] = "canada";


        System.out.println("---------------------------------------");

        String[] states = new String[5];
        states[0] = "Cali";
        states[1] = "texas";
        states[2] = "Utah";
        states[3] = "New York";
        states[4] = "Ohio";
        int j = 0;
        // do entrs loop then test condidtion
        do {
            //System.out.println("state " + states[i]);
            j = j + 1;
        } while (j < 5);

        int n = 0;
        boolean stateFound = false;
        while (!stateFound) {
            String state = states[n];
            System.out.println(state);
            if (state == "Utah") {
                stateFound = true;
            }
            n++;
        }
        //for loop
        System.out.println("for loop print");
        for (int i = 0; i < states.length; i++) {
            System.out.println(states[i]);
        }
    }
}
