package assignments.readFilePasswordAssignment;

/**
 * Created by JohnNoriega22 on 9/25/17.
 */
public class PasswordMatchException extends Exception{
    String password;
    PasswordMatchException(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "doesnt match password requirements " + password;
    }
}
