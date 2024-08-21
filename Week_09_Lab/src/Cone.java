
public class Cone extends Shape3D {
	public Cone(double height, double radius) {
		super(height, radius);
	}

	public double getVolume(double height, double radius) {
		return (PI * radius * radius * height) / 3;

	}
	
	public double getArea(double height,double radius) {
		return PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}
}
