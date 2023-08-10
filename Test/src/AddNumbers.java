/*
 * Author: Stanley Pieda
 * Date: Nov 20, 2020
 * Description: Demonstration of command line arguments program.
 */
public class AddNumbers {

	// no command line arguments means args will have length of zero
	// checking for null first is a defensive programming technique
	public static void main(String[] args) {
		if(args == null || args.length < 1) {
			System.out.println("Usage: java AddNumbers x y z");
			System.out.println("Each of x y and z is a floating point number ");
		}
		else {
			String value = null;
			double sum = 0;
			double number = 0;
			for(int index = 0; index < args.length; index++) {
				value = args[index]; // obtain value in array
				number = Double.parseDouble(value); // convert to double
				sum = sum + number; // sum the data items
			} // end for
			System.out.println(sum);
		} // end else
	} // end main
}
// This program does not verify that each of the String arguments is numeric.
// For optional, advanced-reading regarding checking if String is numeric see
//     baeldung. (April 26, 2020). Check If a String is Numeric in Java. Retrieved
//     from https://www.baeldung.com/java-check-string-number last accessed on
//     Nov 20, 2020
