package org.example.transaction;


import org.example.account.Account;

public class Withdrawal extends Transaction {
    public Withdrawal(double amount) {
        this.amount = amount;
    }

    @Override
    public void execute(Account account) {
        double currentBalance = account.getBalance();
        if (amount <= currentBalance) {
            currentBalance -= amount;
            account.setBalance(currentBalance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

}
