package com.banking.model;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(Customer accountHolder,
                          String accountNumber,
                          double balance,
                          double overdraftLimit) {

        super(accountHolder, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Please enter a valid amount to withdraw!");

        } else if (amount > getBalance() + overdraftLimit) {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");

        } else {
            reduceBalance(amount);
            System.out.println("Amount Withdrawn Successfully!");
        }
    }

    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();

        System.out.println("Account Type: Current Account");
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("=============================");
    }
}