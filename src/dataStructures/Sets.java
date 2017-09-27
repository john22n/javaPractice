package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JohnNoriega22 on 9/26/17.
 */
public class Sets {
    public static void main(String[] args) {
        //linked is in order
        //hasset is in random order
        //treeset is in alphabetical order or natural order
        Set<String> animals = new TreeSet<>();

        animals.add("dog");
        animals.add("pig");
        animals.add("cow");
        animals.add("snake");

        System.out.println(animals);

        animals.add("kitty");
        animals.add("snake");
        System.out.println(animals.size() + "  " + animals);

        //new set use for comparison
        Set<String> farmAn = new HashSet<String>();

        farmAn.add("chichen");
        farmAn.add("cow");
        farmAn.add("dog");
        farmAn.add("horse");

        // what is the interection between animals and farm animals
        //copy exisitng set into new set
        Set<String> intersection = new HashSet<String>(animals);
        System.out.println(intersection);

        //retain only elements that are also in farman
        intersection.retainAll(farmAn);
        System.out.println("intersectino is" + intersection);

        //what is the union
        Set<String> union = new HashSet<>(farmAn);
        union.addAll(animals);

        System.out.println("union of two sets"+ union);

        //what is the difference
        Set<String> different = new HashSet<>(animals);
        different.removeAll(farmAn);
        System.out.println("difference in sets is " + different);

    }
}
