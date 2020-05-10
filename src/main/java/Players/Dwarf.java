package Players;

import Interfaces.IWeapon;

public class Dwarf extends Fighter implements IWeapon {

    private IWeapon weapon;

    public Dwarf(String name, int healthScore, IWeapon weapon) {
        super(name, healthScore);
        this.weapon = weapon;
    }

    @Override
    public IWeapon getWeapon() {
        return weapon;
    }

    public void attack(int damage) {

    }
}
