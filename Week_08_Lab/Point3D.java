package week08;

class Point3D extends Point2D {
    private int z;

    public Point3D() {
        this(0, 0, 0);
    }
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %d)", super.getX(), super.getY(), z);
    }
}
