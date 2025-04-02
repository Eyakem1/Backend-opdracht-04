public abstract class Pokemon {
    private final String name;
    private final String type;
    private int healthPoints;

    public Pokemon(String name, String type, int healthPoints) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public abstract void attack(Pokemon opponent);
}