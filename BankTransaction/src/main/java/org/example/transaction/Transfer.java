package org.example.transaction;

import org.example.account.Account;

public class Transfer extends Transaction {
    private Account toAccount;
    double amount;
    public Transfer(double amount, Account toAccount) {
        this.amount = amount;
        this.toAccount = toAccount;
    }
    @Override
    public void execute(Account account) {
        account.transfer(amount, toAccount);
    }

}
