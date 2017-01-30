package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Square;

public class SquareTest {
	@Test
	public void test_getName() {
		Square test = new Square();
		String output = test.getName();
		assertEquals("Square", output);
	}
	
	@Test
	public void test_getLength_setLength() {
		Square test = new Square();
		test.setSquare(5);
		double output = test.getLength();
		assertEquals(5.0, output, .00001);
	}
		
	@Test
	public void test_getArea() {
		Square test = new Square();
		test.setSquare(5);
		double output = test.getArea();
		assertEquals(25.0, output, .00001);
	}
	
	@Test
	public void test_getPerimeter() {
		Square test = new Square();
		test.setSquare(5);
		double output = test.getPerimeter();
		assertEquals(20.0, output, .00001);
	}
}
