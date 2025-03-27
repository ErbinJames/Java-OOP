package Employee_Management_System;

public class Executive extends Manager {
    String companyCar;
    //constuctor
    Executive(String name, int age, String jobTitle, String department, String companyCar) {
        super(name, age, jobTitle, department); //calling super to inherit the values of the super class and other sub classes
        this.companyCar = companyCar;
    }
    //overriding method
    @Override
    void introduce() {
        System.out.println("Introducing Executive:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: " + department + ", Company Car: " + companyCar);
        System.out.println(); // add spacing
    }
    
}
