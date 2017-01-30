package shapes;

public class Rectangle implements Shape {
	
	private static final String NAME = "Rectangle";
	private double width;
	private double length;
	
	public String getName() {
		return NAME;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return width * length ;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}
}
