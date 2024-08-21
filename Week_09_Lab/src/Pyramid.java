import java.io.PrintWriter;

public class Pyramid extends Shape3D{
	public Pyramid(int depth, int height, int witdh) {
		super(depth, height, witdh);

	}

	public double getVolume(int depth, int height, int witdh) {
		return (1.0) / (3.0) * witdh * depth * height;
	}

	public double getArea(int depth, int height, int witdh) {
		double a = 4 * (height * witdh / 2);
		double b = height * height;
		return a + b;

	}
}
