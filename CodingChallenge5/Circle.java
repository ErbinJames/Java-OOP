package CodingChallenge5;

public class Circle implements Shape{
    double radius;

    //constructor
    Circle(double radius) {
        this.radius = radius;
    }
    
    //implementing method
    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + String.format("%.5f", area));
    }
}
