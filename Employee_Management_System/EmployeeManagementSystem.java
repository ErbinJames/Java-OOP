package Employee_Management_System;

public class EmployeeManagementSystem {

    public static void main (String[] args) {
        //creating object and declaring values
        Person person = new Person ("Alice",30);
        Employee employee = new Employee("Bob", 35, "Software Engineer");
        Manager manager = new Manager("Charlie", 40, "Project Manager", "IT");
        Executive executive = new Executive("Dave", 45, "Senior Executive", "Finance", "BMW X5");
        
        //calling display method
        person.introduce(); 
        employee.introduce();
        manager.introduce();
        executive.introduce();

    }
}
