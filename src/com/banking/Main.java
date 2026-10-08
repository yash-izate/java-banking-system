package com.banking;

import com.banking.model.Account;
import com.banking.model.CurrentAccount;
import com.banking.model.Customer;
import com.banking.model.SavingsAccount;
import com.banking.service.Bank;

public class Main {

    public static void main(String[] args) {

        // ========================================
        // 1. CREATE CUSTOMERS
        // ========================================

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


        // ========================================
        // 2. CREATE SAVINGS ACCOUNT
        // ========================================

        SavingsAccount savingsAccount = new SavingsAccount(
                c1,
                "S1001",
                10000,
                5
        );


        // ========================================
        // 3. CREATE CURRENT ACCOUNT
        // ========================================

        CurrentAccount currentAccount = new CurrentAccount(
                c2,
                "C1001",
                5000,
                20000
        );


        // ========================================
        // 4. SAVINGS ACCOUNT TEST
        // ========================================

        System.out.println("\n========== SAVINGS ACCOUNT ==========");

        savingsAccount.displayAccountDetails();

        System.out.println("\n--- Deposit ₹2,000 ---");
        savingsAccount.deposit(2000);

        savingsAccount.checkBalance();

        System.out.println("\n--- Withdraw ₹3,000 ---");
        savingsAccount.withdraw(3000);

        savingsAccount.checkBalance();

        System.out.println("\n--- Calculate Interest ---");
        savingsAccount.calculateInterest();

        System.out.println("\n--- Try Invalid Withdrawal ---");
        savingsAccount.withdraw(9000);


        // ========================================
        // 5. CURRENT ACCOUNT TEST
        // ========================================

        System.out.println("\n========== CURRENT ACCOUNT ==========");

        currentAccount.displayAccountDetails();

        System.out.println("\n--- Deposit ₹5,000 ---");
        currentAccount.deposit(5000);

        currentAccount.checkBalance();

        System.out.println("\n--- Withdraw ₹7,000 ---");
        currentAccount.withdraw(7000);

        currentAccount.checkBalance();

        System.out.println("\n--- Withdraw Using Overdraft ---");
        currentAccount.withdraw(10000);

        currentAccount.checkBalance();

        System.out.println("\n--- Exceed Overdraft Limit ---");
        currentAccount.withdraw(10000);

        currentAccount.checkBalance();


        // ========================================
        // 6. POLYMORPHISM TEST
        // ========================================

        System.out.println("\n========== POLYMORPHISM TEST ==========");

        Account account1 = savingsAccount;
        Account account2 = currentAccount;

        System.out.println("\n--- Account 1 ---");
        account1.displayAccountDetails();

        System.out.println("\n--- Account 2 ---");
        account2.displayAccountDetails();


        // ========================================
        // 7. BANK
        // ========================================

        Bank bank = new Bank();

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);


        // ========================================
        // 8. DISPLAY ALL CUSTOMERS
        // ========================================

        System.out.println("\n========== BANK CUSTOMERS ==========");

        bank.displayAllCustomers();


        // ========================================
        // 9. DISPLAY ALL ACCOUNTS
        // ========================================

        System.out.println("\n========== BANK ACCOUNTS ==========");

        bank.displayAllAccounts();


        // ========================================
        // 10. FIND CUSTOMER
        // ========================================

        System.out.println("\n========== CUSTOMER SEARCH ==========");

        Customer foundCustomer = bank.findCustomer("C001");

        if (foundCustomer != null) {
            System.out.println("Customer Found:");
            foundCustomer.displayCustomerDetails();
        } else {
            System.out.println("Customer not found!");
        }


        // ========================================
        // 11. FIND ACCOUNT
        // ========================================

        System.out.println("\n========== ACCOUNT SEARCH ==========");

        Account foundAccount = bank.findAccount("S1001");

        if (foundAccount != null) {
            System.out.println("Account Found:");
            foundAccount.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }


        // ========================================
        // 12. SEARCH FOR NON-EXISTING CUSTOMER
        // ========================================

        System.out.println("\n========== INVALID CUSTOMER SEARCH ==========");

        Customer notFoundCustomer = bank.findCustomer("C999");

        if (notFoundCustomer != null) {
            notFoundCustomer.displayCustomerDetails();
        } else {
            System.out.println("Customer C999 not found!");
        }


        // ========================================
        // 13. SEARCH FOR NON-EXISTING ACCOUNT
        // ========================================

        System.out.println("\n========== INVALID ACCOUNT SEARCH ==========");

        Account notFoundAccount = bank.findAccount("A999");

        if (notFoundAccount != null) {
            notFoundAccount.displayAccountDetails();
        } else {
            System.out.println("Account A999 not found!");
        }
    }
}