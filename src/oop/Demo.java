package oop;

class Person {
    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking");

    }
    void eat() {
        System.out.println(email);
    }
    void sleep() {
        System.out.println(phone);
    }

}

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class Demo {

    public static void main(String[] args) {
        // instantiating an object
        Person person1 = new Person();
        // define props
        person1.name = "john";
        person1.email = "jon@gmail.com";
        person1.phone = "234234";
        // abstraction
        person1.eat();
        person1.walk();
        person1.eat();

        Person person2 = new Person();
        person2.name = "Jane";
        person2.sleep();
//        String name = "jon";
//        String email = "john@gmai.com";
//        String phone= "2342342";
//
//        //actions
//        System.out.println(name + " is walking");
//        walking(name);
//        // what i fwe wanted to do this for other person
//        String name2 = "Jane";
//        walking(name2);
//        System.out.println(name + " hello");
//
//        // what about binding attributes and properties together
//
//    }
//
//    static void walking(String name) {
//        System.out.println(name + " is walking");
    }

}
