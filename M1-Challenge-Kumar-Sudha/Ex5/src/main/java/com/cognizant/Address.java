package com.cognizant;

import java.util.Objects;

public class Address {
    /*        - Street 1
        - Street 2
        - City
        - State
        - Zip */
    private String street1;
    private String street2;
    private String state;
    private String city;
    private String zip;

    public Address() {
    }

    public Address(String street1, String street2, String state, String city, String zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.state = state;
        this.city = city;
        this.zip = zip;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getStreet1(), address.getStreet1()) && Objects.equals(getStreet2(), address.getStreet2()) && Objects.equals(getState(), address.getState()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getZip(), address.getZip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreet1(), getStreet2(), getState(), getCity(), getZip());
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
