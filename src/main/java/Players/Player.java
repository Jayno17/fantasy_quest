package Players;

public abstract class Player {

    private String name;
    private int healthScore;

    public Player(String name, int healthScore){
        this.name = name;
        this.healthScore = healthScore;
    }

    public String getName() {
        return name;
    }

    public int getHealthScore() {
        return healthScore;
    }

}
