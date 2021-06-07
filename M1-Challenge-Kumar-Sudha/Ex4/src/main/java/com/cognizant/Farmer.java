package com.cognizant;

public class Farmer extends Person{
  /*    - strength (initial value = 75)
    - health (initial value = 100)
    - stamina (initial value = 75)
    - speed (initial value = 10)
    - attackPower (initial value = 1) */
    private static int initialAttackPower = 1;
    private static int initialSpeed = 10;
    private static int initialStamina = 75;
    private static int initialHealth = 100;
    private static int initialStrength = 75;
    public void plow() {
        if (getHealth() >0 && getStamina() > 0) {
            System.out.println("Off to plowing");
            setStamina(getStamina() -1 );
        }
    }
    public void harvest() {
        if (getHealth() >0 && getStamina() > 0) {
            System.out.println("Happily harvesting");
            setStamina(getStamina() -1 );
        }
    }
    public Farmer() {
    }

    public Farmer(String name) {
        super(name, initialStrength, initialHealth, initialStamina, initialSpeed, initialAttackPower);
    }


    @Override
    public String toString() {
        return "Farmer{" + super.toString() + "}";
    }
}
