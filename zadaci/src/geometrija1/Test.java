package geometrija1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(5,3);
		System.out.println(p1);
		
		System.out.println(p1.distance(9, 2));
		
		Point p2 = new Point(5,3);
		System.out.println(p1.equals(p2));
		Point p = new Point(1,2);
		p.getX();
//		p.setX(5);
		System.out.println(p);
		
		Line l1 = new Line(new Point(4,2), new Point(5,2));
		System.out.println(l1);
		System.out.println("Duzina ove linije je : " + l1.length());
		
		Line l2 = new Line (new Point(4,2), new Point (5,2));
		System.out.println(l1.equals(l2));
		
		
		
		Circle c1 = new Circle (new Point (5,2),7);
		Circle c2 = new Circle (new Point(5,2),7);
		System.out.println("Prvi krug: "+ c1 + " Drugi krug; " + c2);
		System.out.println(c1.equals(c2));
		
	}

}
