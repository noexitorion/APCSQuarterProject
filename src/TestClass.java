import java.io.FileNotFoundException;

public class TestClass {
	
	public static void main(String[] args) throws FileNotFoundException {
		//PokemonCenter pc = PokemonCenter...
	}
	
public void intro(){
		System.out.println("#############################################################################################################");
		System.out.println("");
		System.out.println("Welcome to the Pok�Center! ");
		System.out.println("May we have your Pok�mon? ");
		System.out.println("Please bear with us while we nurse your Pok�mon back to full health. ");
		System.out.println("Your Pok�mon have been healed. ");
		System.out.println("You will also now return here if all your Pok�mon faint at once! ");
		System.out.println("We hope to see you again soon. ");
		System.out.println("");
		
		pokemonCenter.getListOfPokemon().get(0).setBoardingDate("2005/8/25");
		
		System.out.println("**************************");
		System.out.println("POKEMON: " + "pokemontype");
		System.out.println(getPokemonName() + " owned by " + getOwnerName());
		System.out.println("owner's email: " + getEmail());
		System.out.println("**************************");
}
}
