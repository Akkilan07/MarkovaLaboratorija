package geometrija1;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	/* KONSTRUKTORI */
	
	public Point() {
		
	}
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point (int x, int y, boolean selected) {
		this.x = x;
		this.y = y;
		this.selected = selected;
	}
	
	
	public double distance (int x, int y) {
		int dx = this.x - x;
		int dy = this.y - y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Point) {
			Point temp = (Point) obj;
			if( x == temp.x && y == temp.y) {
				return true;
			}
		}return false;
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
	
}
