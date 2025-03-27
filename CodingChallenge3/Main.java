package CodingChallenge3;

public class Main {
    public static void main (String[] args) {
        //creating object and declaring values inside the parameter
        Student student = new Student("Alice", 20, 90);

        // calling display methods
        student.displayInfo();
        student.displayGrade();
    }
}
