package automobil;

public class Test {

	public static void main(String[] args) {
		System.out.println("Redni broj auta: " + Automobil.getRedniBrojAutomobila());
		Automobil a1 = new Automobil("Audi", 3, true);
		System.out.println("Redni broj auta: " + Automobil.getRedniBrojAutomobila());
		
		System.out.println("Automobil ima " + a1.getBrzina() + " brzina.");
		a1.getBrzinaIspis();
		
		a1.promeniBrzinu(5);
		a1.setBrzina(2);
		a1.onOff();
		
		System.out.println(Automobil.boja);
//		Automobil.boja = "plava";
		
//		a1.setPowerOn(true);
		a1.onOff();
		
		Automobil a2 = new Automobil("BMW", 3, true);
		System.out.println("Redni broj auta: " + Automobil.getRedniBrojAutomobila());
		
	}

}
