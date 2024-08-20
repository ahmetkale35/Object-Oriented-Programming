package week08;

class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        this(0.0, 0.0, null);
    }
    public Cylinder(double height) {
        this(height, 0.0, null);
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return 2.0 * Math.PI * super.getRadius() * super.getRadius() * height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder volume is " + getVolume();
    }

}
