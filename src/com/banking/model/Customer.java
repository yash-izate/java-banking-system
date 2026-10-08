package com.banking.model;

public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String address;

    public Customer(String customerId, String name, String email,
                    String phone, String address) {

        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail.toLowerCase();
    }

    public void updatePhone(String newPhone) {
        this.phone = newPhone;
    }

    public void displayCustomerDetails() {

        System.out.println("=======================================");
        System.out.println("Customer Details");
        System.out.println("=======================================");
        System.out.println("Customer Id: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("=======================================");
    }
}