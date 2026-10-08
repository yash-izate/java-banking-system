package com.banking.model;

public class Account {
    private Customer accountHolder;
    private String accountNumber;
    private double balance;

    public Account(Customer accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter vaild amount to deposit!");
        } else {
            balance += amount;
            System.out.println("Amount Deposited!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter valid amount to withdraw!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }

    public void displayAccountDetails() {
        System.out.println();
        System.out.println("======================================");
        System.out.println("Account Details");
        System.out.println("======================================");
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Account Holder: %s \n",accountHolder.getName());
        System.out.println("Balance: " + balance);
        System.out.println("=======================================");
    }

}