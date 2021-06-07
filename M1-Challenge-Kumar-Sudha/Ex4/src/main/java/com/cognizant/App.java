package com.cognizant;

public class App {
    public static void main(String[] args) {
       Farmer farmer = new Farmer("Joe Smith");
        Constable constable = new Constable("John Bouchard", "Wake County, NC");
        Warrior warrior = new Warrior("Mark Fogwell");
        System.out.println("farmer: " + farmer);
        System.out.println("constable: " + constable);
        System.out.println("warrior: " + warrior);

        System.out.println("farmer.getName() = " + farmer.getName() );
        farmer.setName("Joe's Nickname");
        System.out.println("farmer.getName() = " + farmer.getName() );


    }
}
