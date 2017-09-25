package assignments;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("123345670", "john");
        stud1.showEmailId();
        stud1.setCity("dallas");
        stud1.setPhone("2340982341");
        stud1.setState("Tx");
        System.out.println(stud1.toString());
        stud1.setUserId();
    }
}
