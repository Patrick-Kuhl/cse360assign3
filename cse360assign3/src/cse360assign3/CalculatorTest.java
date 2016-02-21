package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	@Test
	public void getTotalTest() {
		Calculator calc = new Calculator();
		assertTrue(0 == calc.getTotal());
	}
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		calc.add(3);
		calc.add(7);
		assertTrue(10 == calc.getTotal());
	}
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		calc.subtract(2);
		calc.subtract(5);
		assertTrue(-7 == calc.getTotal());
	}
	@Test
	public void multiTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.multiply(2);
		assertTrue(4 == calc.getTotal());
	}
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.divide(2);
		assertTrue(1 == calc.getTotal());
	}
	@Test
	public void divBy0Test() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.divide(0);
		assertTrue(0 == calc.getTotal());
	}
	@Test
	public void getHistoryTest() {
		Calculator calc = new Calculator();
		assertTrue("" == calc.getHistory());
	}

}
