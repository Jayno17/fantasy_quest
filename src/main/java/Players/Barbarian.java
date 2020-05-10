package Players;

import Interfaces.IWeapon;

public class Barbarian extends Fighter implements IWeapon {

    public Barbarian(String name, int healthScore) {
        super(name, healthScore);
    }
    @Override
    public IWeapon getWeapon() {
        return weapon;
    }

    public void attack(int damage) {

    }
}
