package PraticeQuestions;

/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class Practice {

    // What is a singleton used for in java
    // answer: singetons are classes which can have no more than one object theyre most usful for storing global state across a system
    // examples: a system wide 'global value', that many parts of a system may need to access like the software licence number
    // ex: logging

    /// initializaiton on demand way
    public final class InstallationDetails {
        private long licenseNumber;

        public long getLicenseNumber() {
            return licenseNumber;
        }
        //by making the consstructor private we prevent installation
        private InstallationDetails() {
            this.licenseNumber = getLicenseNumber();
        }
//        private static class InstallationDetailHolder {
//            private static final InsatallationDetails INSTANCE = new InstallationDetails();
//        }

//        public static InstallationDetails getInstance() {
//            return InstallationDetailHolder.INSTANCE;
//        }


      //// test that our class is a singleton
//        public void testInstallationSingleton {
//            InstallationDetails obj = InstallationDetails.getInstance();
//            InstallationDetails obj2 = InstallationDetails.getInstance();
//            assert(obj == obj2);
//            assert(obj.getLicenseNumber() == obj2.getLicenseNumber());
//            System.out.println("it is a singleton");
//            System.out.println("number is " + obj.getLicenseNumber());
//        }
   //}

    // how do i decide whether to use a string literal or a string object
    //string liter
    String username = "john";
    //string object
    String usernameObj = new String("john");

    // whats the difference
            // String liters: string is INTERENED means stored in the string pool so stored no more than once
    String mes = "hi";
    String mes2 = "hi" ;
//    mes === mes2; // true same object
//    mes.equals(mes2)// true same content

    // if strings were instantiated as objects they would not be interned
    // you should almost always use string literals
        // saves time o (1)
        // saves space
    // store sensitive string as char arrays
            // they can be zeroed out and removed from memory
            // if printed address in memory will be printed

    // whats the difference between an int and long
    // answer: 32 bits

    // whats the differnce between a java arraylist, vector and linkedlist how do i pick which one to choose

    // linked list vs dynamic array
    public class LinkedListNode {
        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    LinkedListNode a = new LinkedListNode(4);
    LinkedListNode b = new LinkedListNode(5);
//    a.next = b;

    // advantages: constant time inserttion and deletion, they can expand
    // disadvantages: to access or edit O N

    // doubly linked list
    public class LinkedListNodeD {
        public int value;
        public LinkedListNodeD next;
        public LinkedListNodeD previous;

        public LinkedListNodeD(int value) {
            this.value = value;
        }
    }

    LinkedListNodeD d = new LinkedListNodeD(1);
    LinkedListNodeD e = new LinkedListNodeD(2);
    LinkedListNodeD f = new LinkedListNodeD(5);

//    a.next = b;
//    b.previous = a;

    //Dynamic arrays allow you to append to it but take an amortized time of o(1) worst case o(n)

    //advantages of dynamic array getting the item at a specific get() is faster o(1), linked list is o (n)
    // they take up less space than linked list
    // more cache friendly

    // LinkedList advantage
            // remove is faster constant, DR linear
            // add is faster

    // arraylist vs vector
    //almost always use arraylist
    // vector is threadsafe but synchronizes on each operations


}}
