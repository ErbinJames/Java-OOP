package CodingChallenge5;

public class Rectangle implements Shape {
    double length, width;

    //constructor
    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    //overriding the method
    @Override
    public void area() {
        double area = length * width;

        if (area == (int)area) {
            System.out.println("Area of Rectangle: " + (int) area);
        } else {
            System.out.println("Area of Rectangle: " + area);
        }
    }
    
}
