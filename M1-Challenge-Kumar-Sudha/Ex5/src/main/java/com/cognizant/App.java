package com.cognizant;

public class App {
    public static void main(String[] args) {
        Address shippingAddress = new Address("123 4thStreet","",
                "abc city","ab", "22222"
                );
        Address billingAddress = shippingAddress;
        Customer  customerA = new Customer("First","Last", "first@email.com", "111-222-3333",
                shippingAddress,
                billingAddress,
                true);
    //    Customer customerB = new Customer();

        System.out.println(customerA);
    //    System.out.println(CustomerB);
    }

}
