public class PokemonGym {
    public void battle(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("Battle between " + pokemon1.getName() + " and " + pokemon2.getName());
        pokemon1.attack(pokemon2);
        if (pokemon2.getHealthPoints() > 0) {
            pokemon2.attack(pokemon1);
        }
        // Bepaal en toon de winnaar
        if (pokemon1.getHealthPoints() > pokemon2.getHealthPoints()) {
            System.out.println(pokemon1.getName() + " wins!");
        } else if (pokemon2.getHealthPoints() > pokemon1.getHealthPoints()) {
            System.out.println(pokemon2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
