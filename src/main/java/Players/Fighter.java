package Players;

import Enemies.Enemy;
import Interfaces.IWeapon;

public abstract class Fighter extends Player {

    IWeapon weapon;

    public Fighter(String name, int healthScore) {
        super(name, healthScore);
    }
    public IWeapon getWeapon(){
        return weapon;
    }
}
