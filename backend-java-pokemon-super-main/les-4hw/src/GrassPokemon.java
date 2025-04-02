public class GrassPokemon extends Pokemon implements GrassAttack {
    public GrassPokemon(String name, int healthPoints) {
        super(name, "Grass", healthPoints);
    }

    @Override
    public void attack(Pokemon opponent) {
        leafStorm(opponent);
    }

    @Override
    public void leafStorm(Pokemon opponent) {
        System.out.println(getName() + " uses Leaf Storm on " + opponent.getName());
    }
}
