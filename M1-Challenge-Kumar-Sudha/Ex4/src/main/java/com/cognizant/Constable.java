package com.cognizant;

import java.util.Objects;

public class Constable extends Person {
    /*
       - strength (initial value = 60)
    - health (initial value = 100)
    - stamina (initial value = 60)
    - speed (initial value = 20)
    - attackPower (initial value = 5)
     */
    private static int initialAttackPower = 5;
    private static int initialSpeed = 20;
    private static int initialStamina = 60;
    private static int initialHealth = 100;
    private static int initialStrength = 60;

    private String jurisdiction;

    public void arrest(Person criminal) {
        System.out.println("Arresting the criminal  " + criminal);
    }
    public Constable(String name, String jurisdiction) {
        super(name, initialStrength, initialHealth, initialStamina, initialSpeed, initialAttackPower);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constable)) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction +", " + super.toString() + '\'' +
                '}';
    }
}
