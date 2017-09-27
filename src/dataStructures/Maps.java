package dataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by JohnNoriega22 on 9/26/17.
 */
public class Maps {
    public static void main(String[] args) {
        //implement map interfaces
        //hasmap random order
        //treemap organized by key
        Map<Integer, String> hMap = new HashMap<Integer, String>();
        mapUtil(hMap);



    }
    public static void mapUtil(Map<Integer, String> map) {
        map.put(101, "steve");
        map.put(502, "roger");
        map.put(22, "Jennifer");
        map.put(212, "mica");
        map.put(750, "john");

        //access elements

        System.out.println("see all keys " + map.keySet());
        System.out.println("see all " + map);

        //iterate through map
        for (int key : map.keySet()) {
            System.out.println("key " + key+  " + " + map.get(key));
        }
    }
}
