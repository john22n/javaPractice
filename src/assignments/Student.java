package assignments;

/**
 * Created by JohnNoriega22 on 9/24/17.
 */
public class Student implements IMethods{

    private String name;
    private String ssn;
    private static String id = "10";
    private String emailId;
    private String userId;

    private String phone;
    private String city;
    private String state;


    Student(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;

    }

    public void showEmailId() {
        emailId = name + "@gmail.com";
        System.out.println(emailId);
    }


    public void setUserId() {

        int random = (int) (Math.random() * 10000);

        userId =  id + random + ssn.substring(ssn.length() -4 , ssn.length());
        System.out.println(userId);

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Override
    public void enroll() {

    }
    @Override
    public void checkBalance() {

    }
    @Override
    public void pay() {
        System.out.println("made payment");
    }
    @Override
    public void showCourses() {
        System.out.println("courses shown");
    }
    @Override
    public String toString() {
      return name + "\n phone " + phone + " \n emailid: " + emailId;
    }
}
