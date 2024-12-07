
public class SumOfDigits {

	public int sum(int n) {
		if (n <= 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		SumOfDigits sod = new SumOfDigits();
		int result = sod.sum(10);
		System.out.println(result);
	}

}
