/**package oop_assignment;

import java.util.*;


public class modify {
	
	 private Random random = new Random();
	
	public static boolean catchPokemon(String pokeball) {
        switch (pokeball) {
            case "Poke Ball":
                return Math.random() < 0.5;
            case "Great Ball":
                return Math.random() < 0.75;
            case "Ultra Ball":
                return Math.random() < 0.9;
            case "Master Ball":
                return true;
            default:
                return false;
        }
    }
	
	public static boolean catchPokemonG1(String pokeball) {
		switch (pokeball) {
        case "Poke Ball":
            return Math.random() < 0.5;
        case "Great Ball":
            return Math.random() < 0.7;
        case "Ultra Ball":
            return Math.random() < 0.8;
        case "Master Ball":
            return true;
        default:
            return false;
		}
	}
	
	public static boolean catchPokemonG2(String pokeball) {
		switch (pokeball) {
        case "Poke Ball":
            return Math.random() < 0.4;
        case "Great Ball":
            return Math.random() < 0.6;
        case "Ultra Ball":
            return Math.random() < 0.7;
        case "Master Ball":
            return true;
        default:
            return false;
		}
	}
	
	public static boolean catchPokemonG3(String pokeball) {
		switch (pokeball) {
        case "Poke Ball":
            return Math.random() < 0.3;
        case "Great Ball":
            return Math.random() < 0.5;
        case "Ultra Ball":
            return Math.random() < 0.6;
        case "Master Ball":
            return true;
        default:
            return false;
		}
	}
	
	private Pokemon generateRandomWildPokemon() {
        String[] pokemonNames = {"Charmander", "Squirtle", "Bulbasaur", "Pikachu", "Eevee", "Psyduck", "Machop", "Charizard", "Zubat", "Pidgeot"};
        String[] defenderTypes = {"Fire", "Water", "Grass", "Electric", "Normal", "Water", "Fighting", "Fire", "Flying", "Flying"};
        String[] move = {"Flamethrower", "Water Gun", "Vine Whip", "Thunder Shock", "Quick Attack", "Zen Headbutt", "Low Sweep", "Air Slash", "Supersonic", "Wing Attack"};
        String[] moveTypes = {"Fire", "Water", "Grass", "Electric", "Normal", "Psychic", "Fighting", "Flying", "Normal", "Flying"};
        int[] grade = {1, 1, 1, 1, 1, 2, 2, 3, 2, 1}; 
        
        int index = random.nextInt(pokemonNames.length);
        int hp = random.nextInt(21) + 30; // HP between 30 and 50
        int attack = random.nextInt(11) + 10; // Attack between 10 and 20
        return new Pokemon(pokemonNames[index], defenderTypes[index], hp, attack, move[index], hp); // Set max HP
    } //need to set moveTypes[index] and grade in the constructor
	
	private Pokemon generateRandomWildExtraPokemon() {
		String[] pokemonNames = {"Mewtwo", "Mew", "Dragonite", "Articuno", "Zapdos", "Moltres", "Snorlax", "Lapras"};
        String[] defenderTypes = {"Psychic","Psychic", "Flying", "Ice", "Electric", "Fire", "Normal", "Water"};
        String[] move = {"Psystrike", "Aura Sphere", "Wing Attack", "Blizzard", "Zap Cannon", "Sky Attack", "Giga Impact", "Ice Beam" };
        String[] moveTypes = {"Psychic", "Fighting", "Flying", "Ice", "Electric", "Flying", "Normal", "Ice"};
        
        int index = random.nextInt(pokemonNames.length);
        int hp = random.nextInt(21) + 50; // HP between 50 and 70
        int attack = random.nextInt(11) + 15; // Attack between 15 and 25
        return new Pokemon(pokemonNames[index], defenderTypes[index], hp, attack, move[index], hp); // Set max HP
	} //need to set moveTypes[index] in the constructor //basically will just set all these pokemon to grade 3

	 static {
	        Map<String, Double> fire = new HashMap<>();
	        fire.put("Grass", 2.0);
	        fire.put("Water", 0.5);
	        fire.put("Fire", 0.5);
	        fire.put("Electric", 1.0);
	        fire.put("Normal", 1.0);
	        fire.put("Psychic", 1.0);
	        fire.put("Fighting", 1.0);
	        fire.put("Flying", 1.0);
	        fire.put("Ice", 2.0);

	        Map<String, Double> water = new HashMap<>();
	        water.put("Fire", 2.0);
	        water.put("Grass", 0.5);
	        water.put("Water", 0.5);
	        water.put("Electric", 1.0);
	        water.put("Normal", 1.0);
	        water.put("Psychic", 1.0);
	        water.put("Fighting", 1.0);
	        water.put("Flying", 1.0);
	        water.put("Ice", 1.0);

	        Map<String, Double> grass = new HashMap<>();
	        grass.put("Water", 2.0);
	        grass.put("Fire", 0.5);
	        grass.put("Grass", 0.5);
	        grass.put("Electric", 1.0);
	        grass.put("Normal", 1.0);
	        grass.put("Psychic", 1.0);
	        grass.put("Fighting", 1.0);
	        grass.put("Flying", 0.5);
	        grass.put("Ice", 1.0);

	        Map<String, Double> electric = new HashMap<>();
	        electric.put("Water", 2.0);
	        electric.put("Grass", 0.5);
	        electric.put("Fire", 1.0);
	        electric.put("Electric", 0.5);
	        electric.put("Normal", 1.0);
	        electric.put("Psychic", 1.0);
	        electric.put("Fighting", 1.0);
	        electric.put("Flying", 2.0);
	        electric.put("Ice", 1.0);
	        
	        Map<String, Double> normal = new HashMap<>();
	        normal.put("Fire", 1.0);
	        normal.put("Water", 1.0);
	        normal.put("Grass", 1.0);
	        normal.put("Electric", 1.0);
	        normal.put("Normal", 1.0);
	        normal.put("Psychic", 1.0);
	        normal.put("Fighting", 1.0);
	        normal.put("Flying", 1.0);
	        normal.put("Ice", 1.0);
	        
	        Map<String, Double> psychic = new HashMap<>();
	        psychic.put("Fire", 1.0);
	        psychic.put("Water", 1.0);
	        psychic.put("Grass", 1.0);
	        psychic.put("Electric", 1.0);
	        psychic.put("Normal", 1.0);
	        psychic.put("Psychic", 0.5);
	        psychic.put("Fighting", 2.0);
	        psychic.put("Flying", 1.0);
	        psychic.put("Ice", 1.0);

	        Map<String, Double> fighting = new HashMap<>();
	        fighting.put("Fire", 1.0);
	        fighting.put("Water", 1.0);
	        fighting.put("Grass", 1.0);
	        fighting.put("Electric", 1.0);
	        fighting.put("Normal", 2.0);
	        fighting.put("Psychic", 0.5);
	        fighting.put("Fighting", 1.0);
	        fighting.put("Flying", 0.5);
	        fighting.put("Ice", 2.0);
	        
	        Map<String, Double> flying = new HashMap<>();
	        flying.put("Fire", 1.0);
	        flying.put("Water", 1.0);
	        flying.put("Grass", 2.0);
	        flying.put("Electric", 0.5);
	        flying.put("Normal", 1.0);
	        flying.put("Psychic", 1.0);
	        flying.put("Fighting", 2.0);
	        flying.put("Flying", 1.0);
	        flying.put("Ice", 1.0);
	        
	        Map<String, Double> ice = new HashMap<>();
	        ice.put("Fire", 0.5);
	        ice.put("Water", 0.5);
	        ice.put("Grass", 2.0);
	        ice.put("Electric", 1.0);
	        ice.put("Normal", 1.0);
	        ice.put("Psychic", 1.0);
	        ice.put("Fighting", 1.0);
	        ice.put("Flying", 2.0);
	        ice.put("Ice", 0.5);

	        effectivenessChart.put("Fire", fire);
	        effectivenessChart.put("Water", water);
	        effectivenessChart.put("Grass", grass);
	        effectivenessChart.put("Electric", electric);
	        effectivenessChart.put("Normal", normal);
	        effectivenessChart.put("Psychic", psychic);
	        effectivenessChart.put("Fighting", fighting);
	        effectivenessChart.put("Flying", flying);
	        effectivenessChart.put("Ice", ice);
	    }

}
**/

