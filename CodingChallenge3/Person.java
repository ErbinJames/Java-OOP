package CodingChallenge3;

public class Person {
    String name;
    int age;

    //constructor 
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to display info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
