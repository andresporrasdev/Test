import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=0;
		int sum;
		for (sum=0; sum<100;) {
		System.out.println("Give me a number to sum");
		number=scan.nextInt();
		sum=sum+number;
		System.out.println("Done "+sum);
		}
	}
}
