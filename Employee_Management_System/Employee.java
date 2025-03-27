package Employee_Management_System;

public class Employee extends Person {
    String jobTitle;

    //constuctor 
    Employee (String name, int age, String jobTitle) {
        super(name, age); //calling super to inherit the values of the super class
        this.jobTitle = jobTitle;
    }
    //overriding method
    @Override
    void introduce() {
        System.out.println("Introducing Employee:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle);
        System.out.println(); //add spacing
    }
}
