import java.io.FileNotFoundException;


public class TestClass {
	private static Charizard p1;
	
	public static void main(String[] args) throws FileNotFoundException {
		//PokemonCenter pc = PokemonCenter...
		intro();
		
		try {
			p1 = new Charizard("Char", "Mike", "mrgiggles@yahoo.com", "77986", 67, 6);
		} catch (IllegalEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("**************************");
		System.out.println("POKEMON: " + "Charizard");
		System.out.println(p1.getName() + " owned by " + p1.getOwnerName());
		System.out.println("owner's email: " + p1.getOwnerEmail());
		System.out.println(p1.getHp() + "/" + p1.getMaxHp() + " HP");
		System.out.println("**************************");
	}
	
public static void intro(){
		System.out.println("#############################################################################################################");
		System.out.println("");
		System.out.println("Welcome to the Pok�Center! ");
		System.out.println("May we have your Pok�mon? ");
		System.out.println("Please bear with us while we nurse your Pok�mon back to full health. ");
		System.out.println("Your Pok�mon have been healed. ");
		System.out.println("You will also now return here if all your Pok�mon faint at once! ");
		System.out.println("We hope to see you again soon. ");
		System.out.println("");
		
		//pokemonCenter.getListOfPokemon().get(0).setBoardingDate("2005/8/25");
		
		
}
}
