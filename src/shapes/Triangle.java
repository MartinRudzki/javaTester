package shapes;

public class Triangle implements Shape {

	private static final String NAME = "Triangle";
	private double a;
	private double b;
	private double c;
	
	public String getName() {
		return NAME;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b){
		this.b = b;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public double getPerimeter() {
		return a + b + c;
	}

}
