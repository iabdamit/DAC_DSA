
import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		// ! Factorial without recursion
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scanner.nextInt();

		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of " + n + " is " + factorial);
		scanner.close();
	}
	// Time Complexity : O(n)
	// Space Complexity: O(n)

}
