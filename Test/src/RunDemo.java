/*
 * Author: Stanley Pieda
 * Date: Nov 21, 2020
 * Description: Demonstration of method that accepts variable number of 
 *              arguments
 */
public class RunDemo {

	public static void main(String[] args) {
		VariableMethodArgumentsDemo demo = new VariableMethodArgumentsDemo();
		int sum1 = demo.addNumbers(1, 2, 3);
		int sum2 = demo.addNumbers(4, 5, 6, 7);
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
