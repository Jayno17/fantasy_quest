package Enemies;

public abstract class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints) {
        this.healthPoints = 100;
    }
    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(){
        this.healthPoints -= 0;
    }
}
