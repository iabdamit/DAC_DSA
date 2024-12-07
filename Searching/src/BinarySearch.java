import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[], int key) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// ! due to mid value change in each itreation we write mid inside loop
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
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
			System.out.print("Enter the number at index " + i + " : ");
			arr[i] = scanner.nextInt();
		}
		int result = binarySearch(arr, key);
		if (result != -1) {
			System.out.println("Key is present in Array at index " + result);
		} else {
			System.out.println("Key is not present in Array ");
		}

		// ! time Complexcity= O(logN)
		scanner.close();
	}
}
