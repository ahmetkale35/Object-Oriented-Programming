
public class Cylinder extends Shape3D{
	
	public Cylinder(double height, double radius) {
		super(height, radius);
	}
	
	public double getVolume(double height,double radius) {
		return PI*radius*radius*height;
	}
	
	public double getArea(double height,double radius){
		double a,b;
		a= 2*PI*radius*radius;
		b= 2*PI*radius*height;
		return a+b;
	}
}

