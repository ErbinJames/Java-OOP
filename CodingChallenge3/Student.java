package CodingChallenge3;

public class Student extends Person {
    int grade;

    //constructor 
    Student(String name, int age, int grade){
        super(name, age); //inherits and calls the Person(superclass/parent class)
        this.grade = grade;
    }

    //method to display grade
    void displayGrade() {
        System.out.println("Grade: " + convertToLetter());
    }

    //grades will be converted to letters or remarks
    private char convertToLetter() {
        if(grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
