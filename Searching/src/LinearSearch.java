import java.util.Scanner;

public class LinearSearch {
	// !
	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(key + " is found at index : " + i);
				return i;
			}
		}
		System.out.println("value not found ");
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = scanner.nextInt();
		System.out.print("Enter Key : ");
		int key = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the number  at index  " + i + " : ");
			arr[i] = scanner.nextInt();
		}
		linearSearch(arr, key);
		scanner.close();
	}
}
