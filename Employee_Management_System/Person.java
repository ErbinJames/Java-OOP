package Employee_Management_System;

public class Person {
    String name;
    int age;

    //Constructor
    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to prints person's name and age
    void introduce() {
        System.out.println("Introducing Person: ");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println(); // add spacing
    }
}
