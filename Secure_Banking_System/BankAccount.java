import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;
    private double interestRate;

    //constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        
        if (balance < 0) {
            System.out.println("Error: Initial deposit cannot be negative. Setting balance to $0.");
            this.balance = 0;
        } else {
            setBalance(balance);
            recordTransaction("Account created with initial deposit: $" + balance);
        }

        this.interestRate = 5.0; //5% interest
        this.transactionHistory = new ArrayList<>();
    }

    // setter and getter method for account number (must be 10 digits)
    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number must be exactly 10 digits.");
            this.accountNumber = "invalid";
        }
    }
    //getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    //setter and getter method for account holder (with validation - cannot be null/empty)
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Account holder name cannot be empty");
        }
    }
    //getter method for account holder 
    public String getAccountHolder() {
        return accountHolder;
    }

    //Setter and Getter for balance (with validation - must be non-negative)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
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
        transactionHistory.add(transaction);
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
            recordTransaction("Deposit: $" + amount);
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
    }

    //Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recordTransaction("Withdraw: $" + amount);
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Error: Insufficient funds or invalid amount.");
        }
    }

    //Apply interest method 
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        recordTransaction(String.format("Interest Applied: $%.2f", interest));
        System.out.println(String.format("Interest Applied. New balance: $%.2f", balance));
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
