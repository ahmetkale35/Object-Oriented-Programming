
public class TestMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(3) ;
		System.out.println("Circle Area : " + c1.getArea(3));
		
		Pyramid p1 = new Pyramid(10, 5, 7);
		System.out.println("Pyramid Area : " + p1.getArea(10, 5, 7));
		System.out.println("Pyramid Volume : " + p1.getVolume(10, 5 ,7));
	}

}
