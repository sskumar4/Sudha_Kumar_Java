package com.cognizant;

import java.util.Objects;

public class Address {
    private String clientName;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;

    public Address(String clientName, String street1, String street2, String city, String state, String zip) {
        this.clientName = clientName;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address() {
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getClientName(), address.getClientName()) && Objects.equals(getStreet1(), address.getStreet1()) && Objects.equals(getStreet2(), address.getStreet2()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState()) && Objects.equals(getZip(), address.getZip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClientName(), getStreet1(), getStreet2(), getCity(), getState(), getZip());
    }

    @Override
    public String toString() {
        return "Address{" +
                "clientName='" + clientName + '\'' +
                ", street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
