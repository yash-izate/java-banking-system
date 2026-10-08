package com.banking;

import com.banking.model.Account;
import com.banking.model.CurrentAccount;
import com.banking.model.Customer;
import com.banking.model.SavingsAccount;
import com.banking.service.Bank;

public class Main {

    public static void main(String[] args) {

        // ============================
        // CUSTOMERS
        // ============================

        Customer c1 = new Customer(
                "C001",
                "Yash",
                "yash@example.com",
                "9000000001",
                "Nagpur"
        );

        Customer c2 = new Customer(
                "C002",
                "Kaushal",
                "kaushal@example.com",
                "9000000002",
                "Amravati"
        );


        // ============================
        // ACCOUNTS
        // ============================

        SavingsAccount savingsAccount =
                new SavingsAccount(
                        c1,
                        "S1001",
                        10000,
                        5
                );

        CurrentAccount currentAccount =
                new CurrentAccount(
                        c2,
                        "C1001",
                        5000,
                        20000
                );


        // ============================
        // SAVINGS ACCOUNT TEST
        // ============================

        System.out.println("\n===== SAVINGS ACCOUNT =====");

        savingsAccount.displayAccountDetails();

        savingsAccount.deposit(2000);

        savingsAccount.withdraw(3000);

        savingsAccount.checkBalance();

        savingsAccount.calculateInterest();


        // ============================
        // CURRENT ACCOUNT TEST
        // ============================

        System.out.println("\n===== CURRENT ACCOUNT =====");

        currentAccount.displayAccountDetails();

        currentAccount.deposit(5000);

        currentAccount.checkBalance();


        // ============================
        // POLYMORPHISM TEST
        // ============================

        System.out.println("\n===== POLYMORPHISM TEST =====");

        Account account1 = savingsAccount;
        Account account2 = currentAccount;

        account1.displayAccountDetails();
        account2.displayAccountDetails();


        // ============================
        // BANK TEST
        // ============================

        Bank bank = new Bank();

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        bank.displayAllCustomers();
        bank.displayAllAccounts();
    }
}