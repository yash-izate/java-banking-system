package com.banking;

import com.banking.model.Account;
import com.banking.model.Customer;
import com.banking.service.Bank;

public class Main {
    public static void main(String[] args) {
        Bank sbi = new Bank();

        Customer c1 = new Customer("C001", "Yash", "yash@example.com","9000000001","Nagpur");
        Customer c2 = new Customer("C002", "Kaushal", "Kaushal@example.com","9000000002","Amravati");

        Account a1 = new Account(c1, "1001",10000.88);
        Account a2 = new Account(c2, "1002",5000.34);

        // change email of c1
        c1.updateEmail("yash2003@gmail.com");
        // change phone of c2
        c2.updatePhone("9800000002");
        // deposit 500 in c1
        a1.deposit(500);
        // withdraw 500 from c2
        a2.withdraw(500);
        // check balance
        a1.checkBalance();
        a2.checkBalance();

        // display c1
        c1.displayCustomerDetails();
        a1.displayAccountDetails();

        // display c2
        c2.displayCustomerDetails();
        a2.displayAccountDetails();

        // add customer
        sbi.addCustomer(c1);
        sbi.addCustomer(c2);

        // add accounts
        sbi.addAccount(a1);
        sbi.addAccount(a2);

        // display all
        sbi.displayAllAccounts();
        sbi.displayAllCustomers();
    }
}