import java.awt.geom.Area;

public abstract class Shape2D {
	protected final static double PI = 3.14;
	protected double height;
	protected double radius;
	protected double width;

	public Shape2D(double height, double width) {
		this.height = height;
		this.width = width;

	}

	public Shape2D(double radius) {
		this.radius = radius;
	}

	public  double getArea(int radius) {
		double area;
		return area = PI * radius * radius;
	}

	public  abstract double getArea();

	@Override
	public String toString() {

		return "Height : " + height + "\n" + "Width : " + width + "\n" + "Radius : " + radius;
	}

}
