import java.util.Scanner;

public class test {
	// ! Swap
	public static void Swapping(int i, int j, int arr[]) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// ! Print Array
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// ! Selection Sort
	public static int selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					arr[minIndex] = arr[j];
				}
			}
			Swapping(i, minIndex, arr);
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the value at index " + i + " : ");
			arr[i] = scanner.nextInt();
		}
		System.out.print("Before Sorting : ");
		printArray(arr);
		selectionSort(arr);
		System.out.print("After Sorting : ");
		printArray(arr);
		scanner.close();
	}

}
