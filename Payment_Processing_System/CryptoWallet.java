package Payment_Processing_System;

public class CryptoWallet implements PaymentMethod{
    //overriding method
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing cryptocurrency payment of $%.2f%n", amount);
    }
    
}

