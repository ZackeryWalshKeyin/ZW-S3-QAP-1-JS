public class Account {
    private int accountNumber;
    private double balance;

    // Parameterized constructor
    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account #" + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw $" + amount + " From account #" + accountNumber);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds");  
        }
    }

    // Method to transfer money into another account
    public void transfer(Account recipipent, double amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            recipipent.deposit(amount);
            System.out.println("Transfered $" + amount + " from account #" + accountNumber + " to account #" + recipipent.accountNumber);
        } else {
            System.out.println("Invalid transfer amount or insuffient funds");
        }    
    }
}