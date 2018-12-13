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
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionDurch0ThrowsExpectedException() {
		assertTrue(testee.division(10, 0) == 0);
	}

	@Test
	public void testDivisionDurch0ThrowsUnexpectedException() throws ArithmeticException{
		assertTrue(testee.division(10, 0) == 0);
	}
	
	@Test // --> Funktioniert nicht, da die Funktion Private ist und mir somit keinen Zugriff erlaubt. 
	// (Deshalb ist Assert-Befehlt ausgeklammert)
	public void testPrivateVisibility() {
		// assertTrue(testee.privateRueckgabeAcht() == 8);
	}
	
	@Test
	public void testProtectedVisibility() {
		assertTrue(testee.protectedRueckgabeAcht() == 8);
	}
	
	@Test
	public void testPublicVisibility() {
		assertTrue(testee.publicRueckgabeAcht() == 8);
	}
	
	@Test
	public void testPackageProtectedVisibility() {
		assertTrue(testee.packageProtectedRueckgabeAcht() == 8);
	}
	
	/*
	 * Aquivalenzklassen:
	 */
	
	// Addition
	@Test
	public void additionTwoPositivNumbers() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void additionPositiveAndNegativeNumber() {
		assertTrue(testee.summe(-10, 25) == 15);
	}
	
	@Test
	public void additionPositiveNumberAndNumber0() {
		assertTrue(testee.summe(10, 0) == 10);
	}
	
	@Test
	public void additionMaxAndMinValues() {
		assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	@Test
	public void additionResultPositive() {
		assertTrue(testee.summe(1, 1) > 0);
	}
	
	@Test
	public void additionResultNegative() {
		assertTrue(testee.summe(-1, -1) < 0);
	}
	
	@Test
	public void additionResultIs0() {
		assertTrue(testee.summe(-1, 1) == 0);
	}
	
	@Test
	public void additionResultisMaxValue() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}
	
	@Test
    public void additionResultOverflowValueToBig() {
        assertTrue(testee.summe(Integer.MAX_VALUE, 12) == Integer.MIN_VALUE + 11);
    }

    @Test
    public void additionResultUnderflowValueToSmall() {
        assertTrue(testee.summe(Integer.MIN_VALUE, -12) == Integer.MAX_VALUE - 11);
    }
	
	// Subraktion
	
	@Test
	public void subtractionTwoPositivNumbers() {
		assertTrue(testee.substraktion(10, 25) == -15);
	}
	
	@Test
	public void subtractionPositiveAndNegativeNumber() {
		assertTrue(testee.substraktion(-10, 25) == -35);
	}
	
	@Test
	public void subtractionPositiveNumberAndNumber0() {
		assertTrue(testee.substraktion(10, 0) == 10);
	}
	
	@Test
	public void subtractionMaxAndMinValues() {
		assertTrue(testee.substraktion(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	@Test
	public void subtractionResultPositive() {
		assertTrue(testee.substraktion(2, 1) > 0);
	}
	
	@Test
	public void subtractionResultNegative() {
		assertTrue(testee.substraktion(2, 3) < 0);
	}
	
	@Test
	public void subtractionResultIs0() {
		assertTrue(testee.substraktion(1, 1) == 0);
	}
	
	@Test
	public void subtractionResultisMaxValue() {
		assertTrue(testee.substraktion(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
	}
	
	// Division
	@Test
	public void divideTwoPositivNumbers() {
		assertTrue(testee.division(10, 5) == 2);
	}
	
	@Test
	public void dividePositiveAndNegativeNumber() {
		assertTrue(testee.division(-10, 5) == -2);
	}
	
	@Test
	public void divideNumber0AndPositiveNumber() {
		assertTrue(testee.division(0, 10) == 0);
	}
	
	@Test
	public void divideMinAndMaxValues() {
		assertTrue(testee.division(Integer.MIN_VALUE, Integer.MAX_VALUE) == -1);
	}
	
	@Test
	public void divideResultPositive() {
		assertTrue(testee.division(2, 1) > 0);
	}
	
	@Test
	public void divideResultNegative() {
		assertTrue(testee.division(-2, 1) < 0);
	}
	
	@Test
	public void divideResultIs0() {
		assertTrue(testee.division(0, 10) == 0);
	}
	
	@Test
	public void divideResultisMaxValue() {
		assertTrue(testee.division(Integer.MAX_VALUE, 1) == Integer.MAX_VALUE);
	}
}
