/**
 * Converts Fahrenheit temperature to its equilvalent value in Celsius
 *
 * @author Bryce Younger
 */
public class MyTempConverter
{
	
	public static void main(String[] args)
	{
		
		final int BASE = 32;
        // @keyterm variable declaration BASE
        // @keyterm primitive data type int
		final double CONVERSION_FACTOR = 9.0 / 5.0;

		
		double celsiusTemp;
		int fahrenheitTemp = 212;  // value to convert
        // @keyterm variable initialization farenheitTemp
		
		celsiusTemp = (fahrenheitTemp - BASE) / CONVERSION_FACTOR ;
        // @keyterm data conversion, implicit caste BASE
		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
		System.out.println("Celsius Equivalent: " + celsiusTemp);
	}
}
