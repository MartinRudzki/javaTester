package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class CircleTest {
	@Test
	public void test_getName() {
		Circle test = new Circle();
		String output = test.getName();
		assertEquals("Circle", output);
	}
	
	@Test
	public void test_getRadius_setRadius() {
		Circle test = new Circle();
		test.setRadius(5);
		double output = test.getRadius();
		assertEquals(5.0, output, .00001);
	}
		
	@Test
	public void test_getArea() {
		Circle test = new Circle();
		test.setRadius(5);
		double output = test.getArea();
		assertEquals(78.5, output, .1);
	}
	
	@Test
	public void test_getPerimeter() {
		Circle test = new Circle();
		test.setRadius(5);
		double output = test.getPerimeter();
		assertEquals(31.4, output, .1);
	}

}
