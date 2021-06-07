package com.cognizant;

import java.util.Objects;

public class Warrior extends Person{
    /*
      - strength (initial value = 75)
    - health (initial value = 100)
    - stamina (initial value = 100)
    - speed (initial value = 50)
    - attackPower (initial value = 10)
    - shieldStrength (initial value = 100)
     */
    private static int initialAttackPower = 10;
    private static int initialSpeed = 50;
    private static int initialStamina = 100;
    private static int initialHealth = 100;
    private static int initialStrength = 75;
    private static int initialShieldStrength = 100;
    private int shieldStrength;

    public void decreaseShieldStrength() {
        shieldStrength--;
        System.out.println("My shielding strength reduced");
    }
    public Warrior(String name) {
        super(name,initialStrength, initialHealth, initialStamina, initialSpeed, initialAttackPower);
        this.shieldStrength = initialShieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior)) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +", " + super.toString() +
                '}';
    }
}
