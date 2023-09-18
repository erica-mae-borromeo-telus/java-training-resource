package org.example.account;


public class CheckingAccount extends Account {
    public CheckingAccount(String accountName, String accountNumber, double initialBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
