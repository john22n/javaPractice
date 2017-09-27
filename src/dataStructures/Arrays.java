package dataStructures;

/**
 * Created by JohnNoriega22 on 9/25/17.
 */
public class Arrays {
    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e","f","g"};
        int size = alphabet.length;
        for (int i = 0; i < size; i++) {
            System.out.println(alphabet[i]);
        }

        System.out.println("\n\n using foreach");
        for (String letter: alphabet) {
            System.out.println(letter);
        }
        String[][] users = { {"john", "Noriega", "john@gmail"},
                                    {"jane", "doe","jan@gmail"},
                                    {"ray", "jones", "ray@gmail.com"}};
        int numOfUsers = users.length;
        int numOfFields = users[0].length;

        System.out.println(numOfFields + "   : " + numOfUsers);
        for (int i =0; i < numOfUsers; i++) {
            String firstName = users[i][0];
            String lastName = users[i][1];
            System.out.println(firstName + " : " + lastName);
        }

        for (String[] user: users) {
            System.out.print(" [");
            for (String field: user) {
                System.out.print(field + " ");
            }
            System.out.print(" ]");
        }


    }
}
