import java.util.Scanner;

public class BubbleSort {
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

    // ! BubbleSort
    public static void bubbleSort(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Swapping(j, j + 1, arr);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
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
        bubbleSort(arr);
        System.out.print("After Sorting : ");
        printArray(arr);
        scanner.close();
    }

    // ! Time Complexcity:O(n2)
    // ! Space Complexcity: O(1)
}
