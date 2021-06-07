package com.cognizant;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        IceCreamFactory iceF = new IceCreamFactory(5000,"chocolate",
                new Date(), new Address("abc company","123 abc street",
                "","abc town","ab","22222"),
                 new Address("abc company","123 abc street",
                "","abc town","ab","22222"));

        iceF.processOrder();
        iceF.ship();
        iceF.generateInvoice();

        IceCreamPOS iceCream = new IceCreamPOS("vanilla", "sprinkles", 1);
        iceCream.calculatePrice();
        iceCream.addScoop();
        iceCream.printReceipt();
        iceCream.acceptPayment("visa","4568");
        iceCream.deliverOrder();
        System.out.println("Final details on iceCream order: " + iceCream);

    }
}
