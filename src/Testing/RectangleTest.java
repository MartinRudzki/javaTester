package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Rectangle;

public class RectangleTest {
	@Test
	public void test_getName() {
		Rectangle test = new Rectangle();
		String output = test.getName();
		assertEquals("Rectangle", output);
	}
	
	@Test
	public void test_getLength_setLength() {
		Rectangle test = new Rectangle();
		test.setLength(5);
		double output = test.getLength();
		assertEquals(5.0, output, .00001);
	}
	
	@Test
	public void test_getWidth_setWidth() {
		Rectangle test = new Rectangle();
		test.setWidth(5);
		double output = test.getWidth();
		assertEquals(5.0, output, .00001);
	}
		
	@Test
	public void test_getArea() {
		Rectangle test = new Rectangle();
		test.setWidth(5);
		test.setLength(4);
		double output = test.getArea();
		assertEquals(20.0, output, .00001);
	}
	
	@Test
	public void test_getPerimeter() {
		Rectangle test = new Rectangle();
		test.setWidth(5);
		test.setLength(4);
		double output = test.getPerimeter();
		assertEquals(18.0, output, .00001);
	}
}
