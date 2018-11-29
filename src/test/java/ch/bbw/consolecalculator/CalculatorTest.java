package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * Test Class for Class Calculator
 * 
 * @author DennisRittmeyer
 * @version 0.0.1
 */
public class CalculatorTest {
	Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubstractionZweiPositiveIsOk() {
		assertTrue(testee.substraktion(25, 10) == 15);
	}

}
