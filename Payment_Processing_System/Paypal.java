package Payment_Processing_System;

public class Paypal implements PaymentMethod{
    //overriding method
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing PayPal payment of $%.2f%n", amount);
    }
    
}
