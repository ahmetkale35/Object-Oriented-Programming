
public class Circle {
	private final static double PI = 3.141519;
	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	static float computeArea(Circle circle) {
		float area;
		area = (float) ((float) Math.pow(circle.radius, 2) * (Circle.PI));
		return area;
	}

}
