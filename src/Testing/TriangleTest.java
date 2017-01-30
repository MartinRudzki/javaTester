package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Triangle;

public class TriangleTest {

	@Test
	public void test_getName() {
		Triangle test = new Triangle();
		String output = test.getName();
		assertEquals("Triangle", output);
	}
	
	@Test
	public void test_getABC_setABC() {
		Triangle test = new Triangle();
		test.setA(5);
		test.setB(5);
		test.setC(5);
		double outputA = test.getA();
		double outputB = test.getA();
		double outputC = test.getA();
		assertEquals(5.0, outputA, .00001);
		assertEquals(5.0, outputB, .00001);
		assertEquals(5.0, outputC, .00001);
	}
		
	@Test
	public void test_getArea() {
		Triangle test = new Triangle();
		test.setA(6);
		test.setB(6);
		test.setC(6);
		double output = test.getArea();
		assertEquals(15.5884, output, .0001);
	}
	
	@Test
	public void test_getPerimeter() {
		Triangle test = new Triangle();
		test.setA(6);
		test.setB(6);
		test.setC(6);
		double output = test.getPerimeter();
		assertEquals(18.0, output, .00001);
	}
}
