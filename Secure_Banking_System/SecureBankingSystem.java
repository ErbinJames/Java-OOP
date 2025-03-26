import java.util.Scanner;

public class SecureBankingSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount bankAccount = null;

    public static void main (String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

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
        System.out.println("Enter your choice: ");
    }

    //method to create Account
    public static void createAccount() {
        System.out.println("Enter Account Number (10 digits): ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.println("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        
        bankAccount = new BankAccount(accountNumber, accountHolder, balance);
        System.out.println("Account Successfully created\n");
    }

    //view account details method
    public static void viewAccountDetails() {
        if (bankAccount == null) {
            System.out.println("No account found. Please create an account first.");
            return;
        }
        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: $" + bankAccount.getBalance());
    }

    // Deposit Money method
    public static void depositMoney() {
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first");
            return;
        }
        System.out.println("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);
    }

    // withdraw money method
    public static void withdrawMoney() {
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first");
            return;
        }
        System.out.println("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawAmount);
    }

    // apply interest method
    public static void applyInterest(){
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first");
            return;
        }
        bankAccount.applyInterest();
    }

    // view transaction history method
    public static void viewTransactionHistory() {
        if (bankAccount == null) {
            System.out.println("No Account found. Please create an account first");
            return;
        }
        bankAccount.printTransactionHistory();
    }
}
