package org.example.transaction;

import org.example.account.Account;

public class Deposit extends Transaction {
    double amount;
    public Deposit(double amount) {

        this.amount =  amount;

    }

    @Override
    public void execute(Account account) {
        account.deposit(amount);

    }

}

