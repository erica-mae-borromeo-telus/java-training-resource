package org.example.account;


public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(String accountName, String accountNumber, double initialBalance, double creditLimit) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance + creditLimit)) {
            balance -= amount;
        } else {
            System.out.println("Credit limit exceeded.");
        }
    }
}
