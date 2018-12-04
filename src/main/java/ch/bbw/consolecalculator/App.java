package ch.bbw.consolecalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(Integer.MAX_VALUE-Integer.MIN_VALUE);
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;
        
        System.out.println("Console Calculator");
        System.out.println("================");
        System.out.println();
        
        valueA = 10;
        valueB = 20;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(10, 20));
    }
}
