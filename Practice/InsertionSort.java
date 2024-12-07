
import java.util.Scanner;

public class InsertionSort {
    // ! Print Array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ! InsertionSort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            // ! hame 0th index ko sorted maan liya or uske piche kuch he hi nahi
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
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
        insertionSort(arr);
        System.out.print("After Sorting : ");
        printArray(arr);
        scanner.close();
    }

    // ! Time Complexcity:O(n2)
    // ! Space Complexcity: O(1)
}