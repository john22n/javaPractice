package Basics;

/**
 * Created by JohnNoriega22 on 9/23/17.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        //create variable to define carer
        // declare variable
        String career;
        System.out.println("program starting");
        career = "Software Dev";
        System.out.println("my career as a " + career);
        //declare and define
        int hourPerWeek = 40;
        int weekPerYear = 50;
        double rate = 42.50;
        career = "web dev";
        double salary = hourPerWeek * weekPerYear * rate;
        System.out.println("Salary " + salary + " as a " + career);
        //compute salary rate * hrs per week weks per year
    }
}
