package cdac.in;

import java.util.Scanner;

public class SelectionSort {
	Scanner scanner = new Scanner(System.in);

	public void acceptMarks(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Marks " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}
	}

	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // Move to the next line after printing the array
	}

	public void swap1(int i, int j, int arr[]) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void selectionSort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap1(i, minIndex, arr);
		}
	}

	public static void main(String[] args) {
		int[] marks = new int[5];
		SelectionSort ss = new SelectionSort();
		ss.acceptMarks(marks);
		System.out.println("Marks before");
		ss.print(marks);
		ss.selectionSort(marks);
		System.out.println("Marks After");
		ss.print(marks);
	}
}
