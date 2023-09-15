package org.example.account;

import java.sql.SQLOutput;

public abstract class Account {
    protected double initialBalance;
    String accountNumber;
    double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    protected Account() {
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
    }

    public void transfer(double amount, Account toAccount) {
        if (amount <= balance) {
            withdraw(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public void printStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: PHP " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

}

//














// List <String> bankTransactions