package Payment_Processing_System;

public class CreditCard implements PaymentMethod {
    //overriding method
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);        
    }
}
