package CodingChallenge4;

public class MainShape {
    public static void main (String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10, 5);

        //calling display method (area())
        circle.area();
        rectangle.area();
    }
    
}
