
public class Main {
	public int factorial(int n) {
		// !base condition
		if (n < 0) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Main recursion = new Main();
		int result = recursion.factorial(6);
		System.out.println(result);
	}

}
