package assignments.answer;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class Student {
    private static int id = 1000;
    private String userId;
   private String name;
    private String ssn;
    private String email;
    private String courses;
    private static final int costofCourse = 5000;
    private int balance;

   public Student(String name, String ssn) {
        id++;
        this.name = name;
        this.ssn = ssn;
        setEmail();
        setUserId();

    }

    private void setEmail() {
       email = name.toLowerCase()+ "." + id + "@gmail.com";
        System.out.println(email);

    }

    private void setUserId() {
       int max = 9000;
       int min = 1000;
       int random = (int) (Math.random() * 100000) * (max - min);
       random = random + min;
       userId = id + random + ssn.substring(5);
    }

    public void enroll(String course) {
       this.courses = this.courses + course;
        System.out.println(courses);
        balance += costofCourse;


    }

    public void checkBalance() {
        System.out.println(balance);
    }

    public void pay(int amount) {
       balance -= amount;
    }

    @Override
    public String toString() {
       return name + courses + balance;
    }


}
