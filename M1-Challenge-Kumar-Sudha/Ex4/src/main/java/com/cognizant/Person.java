package com.cognizant;

import java.util.Objects;

/*
In this exercise, you will design an inheritance hierarchy for characters in a video game. Your design must include a common base class for the following three character types:

- Farmer

- Constable

- Warrior

### Instructions

Create your solution in an IntelliJ project called (`RPGInheritance`).

- Farmer

  - Properties:
    - name
    - strength (initial value = 75)
    - health (initial value = 100)
    - stamina (initial value = 75)
    - speed (initial value = 10)
    - attackPower (initial value = 1)

  - Abilities:
    - run
    - plow
    - harvest
    - attack
    - heal
    - decreaseHealth
    - increaseStamina
    - decreaseStamina

- Constable

  - Properties
    - name
    - strength (initial value = 60)
    - health (initial value = 100)
    - stamina (initial value = 60)
    - speed (initial value = 20)
    - attackPower (initial value = 5)
    - jurisdiction

  - Abilities:
    - run
    - arrest
    - attack
    - heal
    - decreaseHealth
    - increaseStamina
    - decreaseStamina

- Warrior

  - Properties
    - name
    - strength (initial value = 75)
    - health (initial value = 100)
    - stamina (initial value = 100)
    - speed (initial value = 50)
    - attackPower (initial value = 10)
    - shieldStrength (initial value = 100)

  - Abilities:
    - run
    - attack
    - heal
    - decreaseHealth
    - increaseStamina
    - decreaseStamina
    - decreaseShieldStrength

 */
public class Person {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    // common methods
    protected void run() {
        if (stamina > 0) {
            System.out.println("Ran Successfully");
            stamina--;
        }
        else {
            System.out.println("I am tired. Can't run");
        }

    }
    protected void attack() {
        if (attackPower > 0) {
            System.out.println("Attacked Successfully");
            attackPower--;
            stamina--;
        } else {
            System.out.println("Could not attack. Attack Power = " + attackPower);
        }
    }
    protected void heal() {
        attackPower++;
        stamina++;
        health++;
        System.out.println("Thank God, Healing from my wounds");
    }
    protected void decreaseHealth() {
        health--;
        stamina--;
        attackPower--;
        System.out.println("Declining Health");
    }
    protected void increaseStamina() {
        stamina++;
        System.out.println("I am refreshed and have more stamina now");
    }
    protected void decreaseStamina() {
        stamina--;
        System.out.println("Tired, losing my stamina");
    }
    public Person() {
    }

    public Person(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return strength == person.strength && health == person.health && stamina == person.stamina && speed == person.speed && attackPower == person.attackPower && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
