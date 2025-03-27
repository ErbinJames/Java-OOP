package Employee_Management_System;

public class Manager extends Employee{
    String department;

    //constructor
    Manager(String name, int age, String jobTitle, String department) {
        super(name, age, jobTitle); //calling super to inherit the values of the super class and other sub class
        this.department = department;
    }
    //overriding method
    @Override
    void introduce() {
        System.out.println("Introducing Manager:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: " + department);
        System.out.println(); // add spacing
    }
}
