
// public class DecimalToBinary {

// 	public String decToBinary(int n) {
// 		if (n == 0) {
// 			return "0";
// 		}
// 		int rem = n % 2;
// 		System.out.println(rem);
// 		int quot = n / 2;
// 		System.out.println(quot);
// 		return decToBinary(quot) + rem;
// 	}

// 	public static void main(String[] args) {
// 		DecimalToBinary dtb = new DecimalToBinary();
// 		String result = dtb.decToBinary(5);
// 		System.out.println(result);
// 	}

// }

public class DecimalToBinary {
	public int decimalToBinary(int n) {
		if (n == 0) {
			return 0;
		}
		return n % 2 + 10 * decimalToBinary(n / 2);
	}

	public static void main(String[] args) {
		DecimalToBinary db = new DecimalToBinary();
		int result = db.decimalToBinary(5);
		System.out.println(result);
	}

}
