public class ElectricPokemon extends Pokemon implements ElectricAttack {
    public ElectricPokemon(String name, int healthPoints) {
        super(name, "Electric", healthPoints);
    }

    @Override
    public void attack(Pokemon opponent) {
        thunderShock(opponent);
    }

    @Override
    public void thunderShock(Pokemon opponent) {
        System.out.println(getName() + " uses Thunder Shock on " + opponent.getName());
    }
}
