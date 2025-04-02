public class FirePokemon extends Pokemon implements FireAttack {
    public FirePokemon(String name, int healthPoints) {
        super(name, "Fire", healthPoints);
    }

    @Override
    public void attack(Pokemon opponent) {
        flameThrower(opponent);
    }

    @Override
    public void flameThrower(Pokemon opponent) {
        System.out.println(getName() + " uses Flame Thrower on " + opponent.getName());
    }
}
