class Student {
    private String name;
    private int age;

    // constructor
    public Student() {
        
    }

    //getter method for name
    public String getName() {
        return name;
    }
    //setter method for name
    public void setName(String name) {
        this.name = name;
    }

    //getter method for age
    public int getAge() {
        return age;
    }

    //setter method for age 
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

public class StudentDetails {
    public static void main (String[] args) {
        Student student = new Student();

        //setting attributes using setters
        student.setName("John Doe");
        student.setAge(20);

        //display the object
        student.displayInfo();
    }
    
}
