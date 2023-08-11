import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		int numberGiven;
		int strictDivisor=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number");
		numberGiven=scan.nextInt();
		//System.out.println(numberGiven);
		//System.out.println(numberGiven/2);
		for (int index=1; index<=numberGiven/2;index++) {
			if (numberGiven % index==0) {
				sum=index+sum;
				System.out.printf(index+" ");
			}
			
		}
		System.out.println("\nThe sum of all distric devisers are "+sum);
	}
}
