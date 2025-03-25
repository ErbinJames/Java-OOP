import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    String name;
    int employeeID;
    double salary;
    String department;

    //default constructor using this to refer to instance variables
    Employee() {
        this.name = "Unknown";
        this.employeeID = 0;
        this.salary = 0;
        this.department = "None";
    }

    //parameterized constructor
    Employee(String name, int employeeID, double salary, String department) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.department = department;
    }

    //method for display employee info (instance method)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Department: " + department);
        System.out.println(""); //inserts new line
    }

    //method to calculate annual salary (12 months)
    public double calculateAnnualSalary() {
        return (salary * 12);
    }

    // method to calculate salary raise
    public void raiseSalary(double percentage) {
        salary += (salary * (percentage/100));
    }
}

public class EmployeeManagementSystem {
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    //main method to run menu using switch case
    public static void main (String[] args) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    calculateAnnualSalary();
                    break;
                case 4:
                    giveSalaryRaise();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("your choice is invalid, try again!\n");
            }
        } while (choice !=5);

        scanner.close();
    }

    //method to display menu options
    public static void displayMenu() {
        System.out.println("Welcome to Employee Payroll Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Calculate Annual Salary");
        System.out.println("4. Give Salary Raise");
        System.out.println("5. Exit\n");
        System.out.print("Enter your Choice: ");
    }
    
    // method to add an Employee
    public static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeID = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        //Creating Employee object
        Employee newEmployee = new Employee(name, employeeID, salary, department);
        employees.add(newEmployee);

        System.out.println("Employee added Successfully!\n");
    }

    //method to view all employees
    public static void viewEmployees() {
        if(employees.isEmpty()) {
            System.out.println("No employees found.\n");
            return;
        }

        System.out.println("\n--- Employee Records ---");

        int count = 1;
        for (Employee emp: employees) {
            System.out.println("\nEmployee " + count + ":");
            emp.displayInfo();
            count++;
        }
    }

    //method to calculate annual salary for an employee
    public static void calculateAnnualSalary() {
        System.out.print("Enter employee ID to calculate salary: ");
        int id = scanner.nextInt();

        for (Employee emp: employees) {
            if(emp.employeeID == id) {
                double annualSalary = emp.calculateAnnualSalary();
                System.out.println("Annual Salary of " + emp.name + ": $" + String.format("%.2f", annualSalary));
                System.out.println(""); //insert new line
                return;
            }
        }
        System.out.println("Employee not found!\n");
    }

    //method to give a salary Raise
    public static void giveSalaryRaise() {
        System.out.print("Enter employee ID to raise salary: ");
        int id = scanner.nextInt();

        for (Employee emp: employees) {
            if (emp.employeeID == id) {
                System.out.print("Enter percentage increase: ");
                double percentage = scanner.nextDouble();

                emp.raiseSalary(percentage);
                System.out.println("Salary updated successfully! New Salary: $" + String.format("%.2f", emp.salary));
                System.out.println(""); //insert new line
                return;
            }
        }
        System.out.println("Employee not found!\n");
    }
}
