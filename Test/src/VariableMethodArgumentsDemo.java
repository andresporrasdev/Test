/*
 * Author: Stanley Pieda
 * Date: Nov 21, 2020
 * Description: Demonstration of method that accepts variable number of 
 *              arguments
 */
public class VariableMethodArgumentsDemo{
	
	// demonstrates variable number of arguments
	public int addNumbers(int... values ){
		int sum = 0;
		for(int index = 0; index < values.length; index++) {
			sum = sum + values[index];
		}
		return sum;
	}
}
/* values is just a variable name
	public int addNumbers(int... tunaFishes){
		int sum = 0;
		for(int index = 0; index < tunaFishes.length; index++) {
			sum = sum + tunaFishes[0];
		}
		return sum;
	}

*/
