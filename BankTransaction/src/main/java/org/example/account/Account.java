package org.example.account;

import java.sql.SQLOutput;

public abstract class Account {
    double initialBalance;
    String accountNumber;
    double balance;
    String accountName;

    public Account(String accountName, String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountName = accountName;

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
        System.out.println("Account Name: " + accountName);
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

