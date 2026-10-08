package com.banking.service;

import com.banking.model.Account;
import com.banking.model.Customer;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    public Bank() {
        customers = new ArrayList<>();
        accounts = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Customer findCustomer(String customerId) {

        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }

        return null;
    }

    public Account findAccount(String accountNumber) {

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        return null;
    }

    public void displayAllCustomers() {

        System.out.println("\n========== ALL CUSTOMERS ==========");

        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
    }

    public void displayAllAccounts() {

        System.out.println("\n========== ALL ACCOUNTS ==========");

        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}