import java.util.Scanner;

class Student {
    String name;
    int[] grades;

    // Constructor
    Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Instance method to calculate average for any number of grades
    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade; 
        }
        return (double) sum / grades.length;
    }

    // Overloaded method: Calculate average for 4 grades
    public double calculateAverage(int fourthGrade) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        sum += fourthGrade;
        return (double) sum / 4; 
    }

    // Static method for classification
    public static String classifyGrade(double avg) {
        if (avg >= 90) {
            return "Excellent";
        } else if (avg >= 80) {
            return "Good";
        } else if (avg >= 70) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get student name
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        // Get number of grades
        System.out.print("Enter number of grades (3 or 4): ");
        int numGrades = scanner.nextInt();

        // Read grades
        int[] grades = new int[numGrades];
        System.out.print("Enter " + numGrades + " grades: ");
        for (int i = 0; i < numGrades; i++) {
            grades[i] = scanner.nextInt();
        }
        // Create student object 
        Student student = new Student(name, grades);
        // Determine the correct average
        double avg = (numGrades == 4) ? student.calculateAverage(grades[3]) : student.calculateAverage();
        // Display results
        System.out.println("\nStudent: " + student.name);

        // Print grades manually 
        System.out.print("Grades: ");
        for (int i = 0; i < numGrades; i++) {
            System.out.print(grades[i]);
            if (i < numGrades - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println(); // New line after printing grades

        // Print formatted output:
        if (numGrades == 3) {
            System.out.printf("Average: %.2f\n", avg); // Two decimal places for 3 grades
        } else {
            System.out.printf("Average: %.1f\n", avg); // One decimal place for 4 grades
        }

        System.out.println("Classification: " + Student.classifyGrade(avg));

        scanner.close();
    }
}
