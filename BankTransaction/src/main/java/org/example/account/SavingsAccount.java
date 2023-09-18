package org.example.account;


public class SavingsAccount extends Account {

    private final double interestRate;

    public SavingsAccount(String accountName, String accountNumber, double initialBalance, double interestRate) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

}
