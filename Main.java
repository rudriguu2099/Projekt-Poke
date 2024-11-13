public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon(100, Type.CHARIZARD, Rarity.LEGENDARY, 3, 60.2);
        System.out.println(pokemon.attack(pokemon));
    }
}