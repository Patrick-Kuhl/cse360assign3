package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	@Test
	public void getTotalTest() {
		Calculator calc = new Calculator();
		
		System.out.print(calc.getTotal());
		assertEquals("0", outContent.toString());
	}
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		calc.add(3);
		calc.add(7);
		System.out.print(calc.getTotal());
		assertEquals("10", outContent.toString());
	}
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		calc.subtract(2);
		calc.subtract(5);
		System.out.print(calc.getTotal());
		assertEquals("-7", outContent.toString());
	}
	@Test
	public void multiTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.multiply(2);
		System.out.print(calc.getTotal());
		assertEquals("4", outContent.toString());
	}
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		calc.add(2);
		calc.divide(2);
		System.out.print(calc.getTotal());
		assertEquals("1", outContent.toString());
	}
	@Test
	public void getHistoryTest() {
		Calculator calc = new Calculator();
		
		System.out.print(calc.getHistory());
		assertEquals("", outContent.toString());
	}

}
