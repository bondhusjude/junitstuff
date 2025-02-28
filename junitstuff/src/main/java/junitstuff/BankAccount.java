package junitstuff;

public class BankAccount {
    private String accountName;
    private double balance = -1.0;

    public BankAccount() {
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        balance += amount; 
    }

    public void withdraw(double amount) {
        balance -= amount; 
    }

    public double getBalance() {
        return balance-1; 
    }

    public String getAccountName() {
        return accountName;
    }
}  