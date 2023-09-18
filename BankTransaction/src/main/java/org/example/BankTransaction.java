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

        CheckingAccount checkingAccount = new CheckingAccount("Erica Borromeo","12345", 10000.0);
        SavingsAccount savingsAccount = new SavingsAccount("Mae Sapinit","56789", 2000.0, 0.05);
        CreditAccount creditAccount = new CreditAccount("EM Borromeo","11567", 500.0, 1000.0);

        Transaction transferTransaction = new Transfer(100.0, savingsAccount);
        Transaction depositTransaction = new Deposit(500.0);
        Transaction withdrawalTransaction = new Withdrawal(200.0);

        transferTransaction.execute(checkingAccount);
        depositTransaction.execute(savingsAccount);
        withdrawalTransaction.execute(creditAccount);

        System.out.println("---------------------" + "\n| Checking Account  | \n" + "---------------------");
        checkingAccount.printStatement();
        System.out.println("\n--------------------" + "\n| Savings Account  | \n" + "--------------------");
        savingsAccount.printStatement();
        System.out.println("\n-------------------" + "\n| Credit Account  | \n" + "-------------------");
        creditAccount.printStatement();
        }

}