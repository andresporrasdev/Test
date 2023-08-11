import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int givenNumber;
		System.out.println("Give me a number to check if it is prime or not");
		givenNumber=scan.nextInt();
		for (int index=2; index<=givenNumber;index++) {
			if (givenNumber/index!=givenNumber) {
				System.out.println("The number is not prime");
				break;
			}  else {
				System.out.println("The number is prime");
			}
		}
	}

}


/*
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		int numberGiven;
		int strictDivisor=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
		numberGiven=scan.nextInt();
		for (int index=1; index<=numberGiven/2;index++) {
			if (numberGiven % index==0) {
				sum=index+sum;
			}
			
		}
		System.out.println(sum!=1?"not prime":"prime");
}
}
*/
