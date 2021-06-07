package com.cognizant;

import java.util.Objects;

/*
- Design a Customer class that keeps track of:

        - First name

        - Last name

        - Email

        - Phone number

        - Shipping address:
        - Street 1
        - Street 2
        - City
        - State
        - Zip

        - Billing address:
        - Street 1
        - Street 2
        - City
        - State
        - Zip

        - If the customer is a Rewards Member or not.
*/
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean rewardsMember;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email,
                    String phoneNumber, Address shippingAddress,
                    Address billingAddress, boolean rewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardsMember = rewardsMember;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return rewardsMember == customer.rewardsMember && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(shippingAddress, customer.shippingAddress) && Objects.equals(billingAddress, customer.billingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, shippingAddress, billingAddress, rewardsMember);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", rewardsMember=" + rewardsMember +
                '}';
    }
}
