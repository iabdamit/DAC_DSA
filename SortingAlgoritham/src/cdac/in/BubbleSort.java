package cdac.in;

import java.util.Scanner;

public class BubbleSort {
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
	}

	public void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				// ! time complexity : O(N^2)
				// ! Space Complexity : O(1)
			}
		}
	}

	public static void main(String[] args) {
		int[] marks = new int[5];
		BubbleSort bs = new BubbleSort();
		bs.acceptMarks(marks);
		System.out.println("Marks before");
		bs.print(marks);
		bs.bubbleSort(marks);
		System.out.println();
		System.out.println("Marks After");
		bs.print(marks);
	}

}
