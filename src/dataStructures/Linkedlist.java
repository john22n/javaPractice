package dataStructures;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by JohnNoriega22 on 9/30/17.
 */
public class Linkedlist {


    public static void main(String[] args) {
        //object of class linkedlist

        List<String> list = new LinkedList<>();

        list.add("string");
        list.add("other");
        list.remove("other");

        System.out.println(list.contains("string"));
        System.out.println(list.get(0));



        for (String str: list) {
            System.out.println(str);
        }




    }
}
