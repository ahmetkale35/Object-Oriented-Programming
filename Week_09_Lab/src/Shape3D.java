
public abstract class Shape3D extends Shape2D{
	protected double depth;
	
	public Shape3D(double depth, double height, double width) {
        super(height, width);
        this.depth = depth;
    }

    public Shape3D(double height, double radius) {
        super(height);
        this.radius = radius;
    }
     public double getVolume(double depth ,double height, double width) {
    	 return depth*height*width;
     }
    
    public  abstract double getVolume();
    
    
    
    @Override
    public String toString() {
    	return super.toString() + "\n" +
    			"Depth : " + depth;
    }
    
    
}
	

