package CodingChallenge4;

public class Rectangle extends Shape {
    double length, width;

    //constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    //method 
    void area() {
        double area = length * width;
        
        //print without decimals if it's a whole number
        if (area == (int) area ) {
            System.out.println("Area of Rectangle: " + (int) area);
        } else {
            System.out.println("Area of Rectangle: " + area); //prints decimal if neede
        }
    }
}
