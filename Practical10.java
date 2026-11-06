class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder,
                String accountNumber,
                double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException(
                "Opening balance cannot be negative"
            );
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance += amount;

            System.out.println(
                "Deposited: " + amount
            );
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid Withdrawal Amount");

        } else if (amount > balance) {

            System.out.println("Insufficient Balance");

        } else {

            balance -= amount;

            System.out.println(
                "Withdrawn: " + amount
            );
        }
    }

    // Display Account Details
    public void displayDetails() {

        System.out.println("Account Holder: " +
                           accountHolder);

        System.out.println("Account Number: " +
                           accountNumber);

        System.out.println("Balance: " + balance);
    }
}

public class Practical10 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            "Rahul Sharma",
            "1234567890",
            5000
        );

        System.out.println("Account Details");

        account.displayDetails();

        System.out.println("\nTransactions");

        account.deposit(1500);

        account.deposit(-500);

        account.withdraw(1000);

        account.withdraw(0);

        account.withdraw(-200);

        account.withdraw(10000);

        System.out.println("\nFinal Account Details");

        account.displayDetails();
    }
}