package shapes;

public class Square implements Shape {

	private static final String NAME = "Square";
	private double length;
	
	public String getName() {
		return NAME;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setSquare(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return length * length;
	}

	@Override
	public double getPerimeter() {
		return 4*length;
	}

}
