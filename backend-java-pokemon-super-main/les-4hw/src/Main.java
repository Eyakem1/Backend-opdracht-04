public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new FirePokemon("Charmander", 100);
        Pokemon squirtle = new WaterPokemon("Squirtle", 100);

        PokemonGym gym = new PokemonGym();
        gym.battle(charmander, squirtle);
    }
}
