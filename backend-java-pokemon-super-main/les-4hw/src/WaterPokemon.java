public class WaterPokemon extends Pokemon implements WaterAttack {
    public WaterPokemon(String name, int healthPoints) {
        super(name, "Water", healthPoints);
    }

    @Override
    public void attack(Pokemon opponent) {
        waterGun(opponent);
    }

    @Override
    public void waterGun(Pokemon opponent) {
        System.out.println(getName() + " uses Water Gun on " + opponent.getName());
    }
}
