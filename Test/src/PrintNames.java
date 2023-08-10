/*
 * Author: Stanley Pieda
 * Date: Nov 20, 2020
 * Description: Demonstration of command line arguments program.
 */
public class PrintNames {

	// no command line arguments means args will have length of zero
	// checking for null first is a defensive programming technique
	public static void main(String[] args) {
		if(args == null || args.length < 1) {
			System.out.println("Usage: java PrintNames name1 name2 nameN");
		}
		else {
			for(int index = 0; index < args.length; index++) {
				if(index == args.length - 1) { // don't print , on the end
					System.out.println(args[index]);
				}
				else {
					System.out.print(args[index] + ", ");
				} // end if
			} // end for
		} // end else
	} // end main
} // end class
