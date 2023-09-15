package org.example;


import org.example.account.CheckingAccount;
import org.example.account.CreditAccount;
import org.example.account.SavingsAccount;
import org.example.transaction.Deposit;
import org.example.transaction.Transaction;
import org.example.transaction.Transfer;
import org.example.transaction.Withdrawal;

public class BankTransaction {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount("12345", 10000.0);
        SavingsAccount savingsAccount = new SavingsAccount("56789", 2000.0, 0.05);
        CreditAccount creditAccount = new CreditAccount("11567", 500.0, 1000.0);

        Transaction depositTransaction = new Deposit(500.0);
        Transaction withdrawalTransaction = new Withdrawal(200.0);
        Transaction transferTransaction = new Transfer(100.0, savingsAccount);

        depositTransaction.execute(savingsAccount);
        withdrawalTransaction.execute(creditAccount);
        transferTransaction.execute(checkingAccount);

        checkingAccount.printStatement();
        savingsAccount.printStatement();
        creditAccount.printStatement();
        }

}