package shapes;

public class Circle implements Shape {

    private static final String NAME = "Circle";
    private double radius;

	public String getName() {
		return NAME;
	}
	
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;	
	}
}