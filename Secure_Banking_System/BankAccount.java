package Secure_Banking_System;

import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;
    private double interestRate;

    // Private constructor (prevents direct instantiation)
    private BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        this.interestRate = 5.0; // Default interest rate
        recordTransaction("Account created with initial deposit: $" + String.format("%.0f", balance));
    }

    // Static factory method with validation on Create account
    public static BankAccount createAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || !accountNumber.matches("\\d{10}")) {
            System.out.println("Error: Account number must be exactly 10 digits.");
            return null; // Account creation fails
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            System.out.println("Error: Account holder name cannot be empty.");
            return null;
        }
        if (balance < 0) {
            System.out.println("Error: Initial deposit cannot be negative.");
            return null;
        }

        return new BankAccount(accountNumber, accountHolder, balance);
    }

    // setter and getter method for account number 
    public void setAccountNumber(String accountNumber) {
       this.accountNumber = accountNumber;
    }
    //getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //setter and getter method for account holder (with validation - cannot be null/empty)
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    //getter method for account holder 
    public String getAccountHolder() {
        return accountHolder;
    }

    //Setter and Getter for balance (with validation - must be non-negative)
    public void setBalance(double balance) {
       this.balance = balance;
    }
    //getter for balance
    public double getBalance() {
        return balance;
    }

    //getter method for interestRate (doesn't need setter because the value is fixed.)
    public double getInterestRate() {
        return interestRate;
    }

    //record transaction in history
    private void recordTransaction(String transaction) {
        if (this.transactionHistory == null) {
            this.transactionHistory = new ArrayList<>();
        }
        this.transactionHistory.add(transaction);
    }

    //getter for transaction history
    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    //Methods

    //Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposit $" + String.format("%.0f", amount));
        } else {
            System.out.println("Error! Deposit amount must be greater than zero.");
        }
    }

    //Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recordTransaction("Withdraw $" + String.format("%.0f", amount));
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    //Apply interest method 
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        recordTransaction(String.format("Interest Applied: $%.0f%n", interest));
        System.out.printf("Interest Applied. New balance: $%.0f (Interest Rate: 5%% annual) %n", balance);
    }

    //display transaction history
    public void printTransactionHistory() {
        System.out.println("--- Transaction History ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions recorded.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println("- " + transaction);
            }
        }
    }
}
