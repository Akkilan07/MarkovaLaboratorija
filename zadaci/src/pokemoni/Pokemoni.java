package pokemoni;

public class Pokemoni {

	private static int brojPokemona;
	private String imePokemona;
	private String tipPokemona;
	private int redniBrojPokemona = 1;
	private static final char generacija = 'X';
	
	public Pokemoni() {
		
	}
	
	public Pokemoni (String imePokemona, String tipPokemona) {
		
		this.imePokemona = imePokemona;
		
		if(tipPokemona == "Elektricni" || tipPokemona == "Vatreni"|| tipPokemona =="Vodeni" || tipPokemona == "Zemljani") {
			this.tipPokemona = tipPokemona;
		}else {
			this.tipPokemona = "Nepoznati pokemon.";
		}
		Pokemoni.brojPokemona += 1;
		this.redniBrojPokemona= brojPokemona;
		
	}

//	toString – Treba da ispisuje sledeću poruku: „<Ime pokemona> je pokemon <generacija>
//	generacije, on je <tip> tip i u ovom programu kreiran je kao <redniBroj pokemona>. od
//	trenutno postojećih <brojPokemona> Pokemona.

	
	@Override
	public String toString() {
		return imePokemona +" je pokemon "+ generacija +" generacije, on je "+ tipPokemona +" tip i u ovom programu kreiran je kao "+ redniBrojPokemona +" od trenutno postojecih "+ brojPokemona +" pokemona.";
		
	}
	
//	equals - Pokemoni će biti jednaki ukoliko imaju isto ime i tip. Ukoliko pokemoni imaju i isti
//	redni broj onda na konzolu ispisati „Poredjenje sa samim sobom“. Ukoliko Pokemoni imaju
//	samo isti tip na konzoli ispisati „Srodni Pokemoni“.
	
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Pokemoni) {
			Pokemoni temp = (Pokemoni)obj;
			
			if(temp.imePokemona == this.imePokemona && temp.tipPokemona == this.tipPokemona && temp.redniBrojPokemona == this.redniBrojPokemona) {
				System.out.println("Poredjenje sa samim sobom.");
			}else if (temp.imePokemona == this.imePokemona && temp.tipPokemona == this.tipPokemona) {
				System.out.println("Pokemoni su isti.");
			}else if (temp.tipPokemona == this.tipPokemona) {
				System.out.println("Srodni pokemoni.");
			}else {
				System.out.println("Pokemoni su razliciti.");
			}
		}return false;
	}
	
	
	
	
	
	public static int getBrojPokemona() {
		return brojPokemona;
	}

	public static void setBrojPokemona(int brojPokemona) {
		Pokemoni.brojPokemona = brojPokemona;
	}

	public String getImePokemona() {
		return imePokemona;
	}

	public void setImePokemona(String imePokemona) {
		this.imePokemona = imePokemona;
	}

	public String getTipPokemona() {
		return tipPokemona;
	}

	public void setTipPokemona(String tipPokemona) {
		this.tipPokemona = tipPokemona;
	}

	public int getRedniBrojPokemona() {
		return redniBrojPokemona;
	}

	public void setRedniBrojPokemona(int redniBrojPokemona) {
		this.redniBrojPokemona = redniBrojPokemona;
	}
	
	
	
}
