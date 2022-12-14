package geometrija1;

public class Circle {

	
	private Point center;
	private int r;
	private boolean selected;
	
	public Circle() {
		
	}
	
	public Circle (Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	public Circle (Point center, int r, boolean selected) {
		this.center = center;
		this.r = r;
		this.selected = selected;
	}
	
	public double circumference() {
		return 2*r*Math.PI;
	}
	
	@Override
	public String toString() {
		return "Center: "+ center + ", Radius: "+ r;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Circle) {
			Circle temp = (Circle)obj;
			return center.equals(temp.center) && r == temp.r;
		}return false;
	}
	
	

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
	
}
