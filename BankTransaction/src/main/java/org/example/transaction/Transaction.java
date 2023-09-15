package org.example.transaction;

import org.example.account.Account;

public abstract class Transaction {
    double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }



    public abstract void execute(Account account);

    public double getAmount() {
        return amount;
    }
    protected Transaction() {
    }
}
