package ch.bbw.consolecalculator;

public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}
	public int substraktion(int value1, int value2) {
		return value1 - value2;
	}
	public int division(int value1, int value2) {
		return value1 / value2;
	}
	private int privateRueckgabeAcht() {
		return 8;
	}
	protected int protectedRueckgabeAcht() {
		return 8;
	}
	public int publicRueckgabeAcht() {
		return 8;
	}
	int packageProtectedRueckgabeAcht() {
		return 8;
	}
}
