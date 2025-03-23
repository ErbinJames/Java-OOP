//define a car class
class Car { 
//attributes of the car class
 String brand; 
 int year;

    //method to display car details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
//main class
public class CarDetails { //class name 
    public static void main (String[] args) {
        //create an object of the car class
        Car myCar = new Car();
        //assign values to the object
        myCar.brand = "Toyota";
        myCar.year = 2020;
        
        // call the displayInfo() method to display details
        myCar.displayInfo();
    }
}