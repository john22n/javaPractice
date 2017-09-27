package dataStructures;

import java.util.ArrayList;

/**
 * Created by JohnNoriega22 on 9/26/17.
 */
public class Lists {
    public static void main(String[] args) {
        ArrayList<String> citites = new ArrayList();

        //add elements
        citites.add("Cleveland");
        citites.add("toronto");
        citites.add("Miami");

        // iterate the collection
        for (String city : citites) {
            System.out.println(city);
        }

        int size = citites.size();
        System.out.println(size);

        //retrieve specific elements
        System.out.println(citites.get(2));

        //remove
        citites.remove(0);
        size = citites.size();
        System.out.println(size);
    }
}
