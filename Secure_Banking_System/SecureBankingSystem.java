package Secure_Banking_System;

import java.util.Scanner;

public class SecureBankingSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount bankAccount = null;

    public static void main (String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccountDetails();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    applyInterest();
                    break;
                case 6:
                    viewTransactionHistory();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    //method to display Menu
    public static void displayMenu() {
        System.out.println("Welcome to the Secure Banking System\n");
        System.out.println("1. Create Account");
        System.out.println("2. View Account Details");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Apply Interest");
        System.out.println("6. View Transaction History");
        System.out.println("7. Exit\n");
        System.out.print("Enter your choice: ");
    }

    //method to create Account
    public static void createAccount() {
        System.out.print("Enter Account Number (10 digits): ");
        String accountNumber = scanner.nextLine(); 
    
        //condition for validation
        if (!accountNumber.matches("\\d{10}")) {
            System.out.println("Error! Account number must be exactly 10 digits.");
            return;
        }
    
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine(); // Read name correctly
    
        System.out.print("Enter Initial Deposit: ");
        
        //Ensure valid double input
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Invalid balance amount.");
            scanner.next(); // Clear invalid input
            return;
        }
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline 
    
        // Create a new bank account after validation
        bankAccount = new BankAccount(accountNumber, accountHolder, balance);
        System.out.println("Account created successfully!\n");
    }

    //view account details method
    public static void viewAccountDetails() {
        System.out.println("--- Account Details ---");
        if (bankAccount == null) {
            System.out.println("No account found. Please create an account first.");
            return;
        }
        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.printf("Balance: $%.0f%n", bankAccount.getBalance());
        System.out.println();
    }

    // Deposit Money method
    public static void depositMoney() {
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first.");
            return;
        }
    
        System.out.print("Enter deposit amount: ");
        
        if (!scanner.hasNextDouble()) { // Check if input is a valid number
            System.out.println("Invalid input! Please enter a valid amount.");
            scanner.next(); // Consume invalid input
            return;
        }
    
        double depositAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume leftover newline
    
        if (depositAmount <= 0) { // Prevent negative or zero deposits
            System.out.println("Error: Deposit amount must be greater than zero.");
            return;
        }
    
        bankAccount.deposit(depositAmount);
        System.out.printf("Deposit successful. New Balance: $%.0f%n", bankAccount.getBalance());
        System.out.printf("Transaction recorded: Deposit $%.0f%n", depositAmount);
        System.out.println();// newline
    }
    

    // withdraw money method
    public static void withdrawMoney() {
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first.");
            return;
        }
    
        System.out.print("Enter withdrawal amount: ");
    
        // Validate input
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid amount.");
            scanner.next(); // Consume invalid input
            return;
        }
    
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
    
        // Ensure the withdrawal amount is positive
        if (withdrawAmount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return;
        }
    
        // Check if the balance is sufficient
        if (withdrawAmount > bankAccount.getBalance()) {
            System.out.println("Error: Insufficient balance.");
            return;
        }
    
        // Perform withdrawal
        bankAccount.withdraw(withdrawAmount);
    
        // Display confirmation messages
        System.out.printf("Withdrawal successful. New Balance: $%.0f%n", bankAccount.getBalance());
        System.out.printf("Transaction recorded: Withdrawal $%.0f%n", withdrawAmount);
        System.out.println();// newline
    }
    
    // apply interest method
    public static void applyInterest(){
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first");
            return;
        }
        bankAccount.applyInterest();
        System.out.println();// newline
    }

    // view transaction history method
    public static void viewTransactionHistory() {
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first");
            return;
        }
        bankAccount.printTransactionHistory();
        System.out.println();// newline
    }
}
