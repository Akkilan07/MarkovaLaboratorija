package kompjuter;

public class Kompjuter {

	private int ram;
	private String os;
	private boolean powerOn = false;
	
	public Kompjuter() {
		
	}
	
	public Kompjuter (String os, int ram, boolean powerOn) {
		
		this.os = os;
		this.ram = ram;
		this.powerOn = powerOn;
	}

	public void OnOff() {
		//negacija, ako je powerOn true ! ce napraviti da bude false i dodeliti tu vrednost 
		// u powerOn i obrnuto
		this.powerOn = !this.powerOn;
	}
	
	
	public int getRam() {
		return ram;
	}

	
	public void setRam(int ram) {
		if(ram == 4 || ram == 8 || ram == 16 || ram == 32 || ram == 64 || ram == 128) {
			this.ram = ram;
		}else {
			this.ram = 4;
			System.out.println("Unesena vrednost nije dozvoljena.");
		}
		
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		if (os.equalsIgnoreCase("Windows") || os.equalsIgnoreCase("Linus") || os.equalsIgnoreCase("MacOS")) {
			this.os = os;			
		} else {
			System.out.println("Unesena je nedozvoljena vrednost.");
			this.os = "built-in";
		}
	}
	
	

	@Override
	public String toString() {
		return "Kompjuter [ram=" + ram + ", os=" + os + ", powerOn=" + powerOn + "]";
	}

	public boolean isPowerOn() {
		return powerOn;
	}

	public void setPowerOn(boolean powerOn) {
		this.powerOn = powerOn;
	}
	
	
	
	
}
