import java.util.Scanner;
import java.util.ArrayList;

class Student {
    String name;
    int id;
    double grade;

    //Constructor
    Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    //instance method to update grade
    public void updateGrade(double newGrade) {
        this.grade = newGrade; 
    }

}
public class StudManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("Welcome to the Student Management System\n");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student Grade");
        System.out.println("4. Exit\n");
        System.out.print("Enter your choice: ");
    }

    //method to add a student
    public static void addStudent() {
        //student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        //student id
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        Student student = new Student(name, id, grade);
        students.add(student);
        System.out.println("Student added successfully\n");
    }

    //Method to view all students
    public static void viewAllStudents() {
        if(students.isEmpty()) {
            System.out.println("No students records found.");
            return;
        }
        System.out.println("=== Students Records ===");
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("ID: " + student.id);
            System.out.println("Grade: " + student.grade);
            System.out.println();
        }
    }
    
    //Method to update a student's grade
    public static void updateStudentGrade() {
        // if there is no student on the list
        if (students.isEmpty()) {
            System.out.println("No students available to update.");
            return;
        }

        System.out.print("Enter student ID to update: ");
        int idUpdate = scanner.nextInt();

        for (Student student : students) {
            if (student.id == idUpdate) {
                System.out.print("Enter new grade: ");
                double newGrade = scanner.nextDouble();
                student.updateGrade(newGrade);
                System.out.println("Grade updated successfully!\n");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void main (String[] args) {

        //Main method, where it handles menu loop using switch case
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentGrade();
                    break;
                case 4:
                    System.out.println("Exiting program ...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Your choice is invalid. Try Again.");
            }
        }
    }   
   
}
