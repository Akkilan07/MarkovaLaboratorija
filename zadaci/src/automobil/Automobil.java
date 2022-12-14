package automobil;

public class Automobil {

	private String marka;
	private int brzina;
	private boolean powerOn;
	
	private static int redniBrojAutomobila = 0;
	
	public static final String boja = "crveno";
	
	public Automobil() {
		
	}
	
	public Automobil (String marka, int brzina, boolean powerOn) {
		this.marka = marka;
		this.brzina = brzina;
//		if (brzina > 6 || brzina < 0) {
//			System.out.println("Brzina ne moze biti van raspona 1-6. Dodeljena je brzina 1");
//			this.brzina = 1;
//		} else {
//			this.brzina = brzina;			
//		}
		this.powerOn = powerOn;
		redniBrojAutomobila += 1;
	}
	
	public boolean onOff () {
		if (this.powerOn == true) {
			this.powerOn = false;
			System.out.println("Iskljucen");
		}else {
			this.powerOn = true;
			System.out.println("Ukljucen");
		}
		
		return this.powerOn;
	} 

	public void getBrzinaIspis() {
		System.out.println("Autommobil je u brzini " + this.brzina);
	}
	
	public void promeniBrzinu(int novaBrzina) {
		if (novaBrzina > 6 || novaBrzina < 0) {
			System.out.println("Brzina ne sme biti veca od 6 ili manja od 0.");
		}
		else if (this.brzina > novaBrzina) {
			//ovde je trenutna brzina auta veca od nove, te moze u bilo koju da stavi
			this.brzina = novaBrzina;
			System.out.println("Brzina je promenjena u " + novaBrzina);
		} else {
			int razlika = novaBrzina - this.brzina;
			if (razlika > 1) {
				System.out.println("Nedozvoljena promena brzine. Moze samo za 1 brzinu");
			} else {
				this.brzina = novaBrzina;
				System.out.println("Brzina je promenjena u " + novaBrzina);
			}
		}
		
	}
	
	
	
	
	public static int getRedniBrojAutomobila() {
		return redniBrojAutomobila;
	}

	public static void setRedniBrojAutomobila(int redniBrojAutomobila) {
		Automobil.redniBrojAutomobila = redniBrojAutomobila;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}

	@Override
	public String toString() {
		return "Automobil [marka=" + marka + ", brzina=" + brzina + ", powerOn=" + powerOn + "]";
	}
	
	
}
