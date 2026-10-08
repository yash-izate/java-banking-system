package com.banking.model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(Customer accountHolder,
                          String accountNumber,
                          double balance,
                          double interestRate) {

        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {

        double interest = getBalance() * interestRate / 100;

        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + interest);
    }

    @Override
    public void withdraw(double amount) {

        double minimumBalance = 1000;

        if (amount <= 0) {
            System.out.println("Please enter a valid amount to withdraw!");

        } else if (getBalance() - amount < minimumBalance) {
            System.out.println(
                    "Withdrawal failed! Minimum balance of ₹"
                            + minimumBalance
                            + " must be maintained."
            );

        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();

        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}