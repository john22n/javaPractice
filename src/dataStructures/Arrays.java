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

    }
}
