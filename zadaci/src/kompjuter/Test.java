package kompjuter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Kompjuter k1 = new Kompjuter ("Windows", 8, true);
		System.out.println(k1);
		
		//gasenje kompjutera
		
		k1.OnOff();
		System.out.println(k1);
		
		k1.setOs("macos");
		System.out.println(k1);
		

		k1.setOs("proba");
		System.out.println(k1);
		
	}

}
