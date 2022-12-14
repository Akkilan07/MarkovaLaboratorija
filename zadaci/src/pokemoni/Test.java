package pokemoni;

public class Test {

	public static void main(String[] args) {

		Pokemoni p1 = new Pokemoni("Charizard", "Vatreni");
		Pokemoni p2 = new Pokemoni("Gyrados", "Vodeni");
		Pokemoni p3 = new Pokemoni("Pikachu", "Elektricni");
		Pokemoni p4 = new Pokemoni("Bulbasaur", "Zemljani");
		Pokemoni p5= new Pokemoni("Sonic", "Vazdusni");
		
		
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p5);
		
		p2.equals(p3);
		p3.equals(p3);
		
		System.out.println(p5);
		
		
	}

}
