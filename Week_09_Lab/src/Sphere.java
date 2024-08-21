import java.io.ObjectInputStream.GetField;

public class Sphere extends Shape3D{
	public Sphere(int depth,double radius) {
		super(depth,radius);
	}
	
	public double getVolume(double radius) {
		return (4*(PI*Math.pow(radius, 3)))/3;
		
	}
	
	public double getArea() {
		return 4*(PI*radius*radius);
	}
	
	
}
