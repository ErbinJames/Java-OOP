package CodingChallenge5;

public class MainShape {
    public static void main (String[] args) {
        //used shape reference for polymorphism
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(10, 5);

        //calling area method
        circle.area();
        rectangle.area();
    }
}
