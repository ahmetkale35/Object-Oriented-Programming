package week08;

class Main {
    public static void main(String[] args) {

        Point2D point2D1 = new Point2D(54, 11);
        Point2D point2D2 = new Point2D();
        Point3D point3D1 = new Point3D();
        Point3D point3D2 = new Point3D(3, 4, 5);

        System.out.println("Point2D 1: " + point2D1);
        System.out.println("Point2D 2: " + point2D2);

        System.out.println("Point3D 1: " + point3D1);
        System.out.println("Point3D 2: " + point3D2);

        System.out.println("*******************************************");

        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(10, 3.4, "Blue");

        System.out.println(circle);
        System.out.println(cylinder);
    }

}
