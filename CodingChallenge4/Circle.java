package CodingChallenge4;

public class Circle extends Shape {
    double radius;
    
    //constructor 
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    // method
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + String.format("%.5f", area));
    }
}
