package Weapons;

import Interfaces.IWeapon;

public class Sword implements IWeapon {
    private int damage;

    public Sword(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(int damage) {

    }
}

