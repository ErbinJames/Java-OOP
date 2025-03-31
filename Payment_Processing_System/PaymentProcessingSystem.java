package Payment_Processing_System;

import java.util.Scanner;

public class PaymentProcessingSystem {
    public static void main (String[] args) {
        //creating scanner object
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        //prompt the user to choose payment method
        // Loop until user selects a valid option
        while (choice < 1 || choice > 3) {
            // Prompt the user to choose a payment method
            System.out.print("Choose payment method (1: Credit Card, 2: PayPal, 3: CryptoWallet): ");
            
            // Check if input is a valid integer
            if (!scanner.hasNextInt()) {
                // If it's not an integer, print error and consume the invalid input
                System.out.println("Invalid input. Please select a valid number.");
                scanner.next(); // Consume invalid input
                continue; // Skip to the next iteration of the loop
            }

            choice = scanner.nextInt(); // Read user choice

            // Check if the choice is within the valid range (1 to 3)
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        
        // Declare PaymentMethod variable
        PaymentMethod payment;
        // switch case to assign appropriate object
        switch (choice) {
            case 1:
                payment = new CreditCard();
                payment.processPayment(100.0);
                break;
            case 2:
                payment = new Paypal();
                payment.processPayment(250.50);
                break;
            case 3:
                payment = new CryptoWallet();
                payment.processPayment(320.25);
                break;
        }

        // close the scanner
        scanner.close();
    } 
}