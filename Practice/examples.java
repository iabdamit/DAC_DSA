import java.util.Scanner;

public class examples {
    // ! two Sum
    // public static void main(String[] args) {
    // int arr[] = { 3, 5, 6, 8, 9, 29, 12 };
    // for (int i = 0; i < arr.length; i++) {
    // int sum = 0;
    // for (int j = i + 1; j < arr.length; j++) {
    // sum = arr[i] + arr[j];
    // if (sum == 9) {
    // System.out.println(arr[i] + " and " + arr[j]);
    // }
    // }
    // }
    // }

    // ! string first Unique
    // public static void main(String[] args) {
    // String str = "abcdabf";
    // for (int i = 0; i < str.length(); i++) {
    // char unique = str.charAt(i);
    // boolean isRepeating = false;
    // for (int j = i + 1; j < str.length(); j++) {
    // if (str.charAt(j) == unique) {
    // isRepeating = true;
    // break;
    // }
    // }
    // if (!isRepeating) {
    // System.out.println(unique);
    // break;
    // // ! Stop the loop after finding the first non-repeating character
    // }
    // }
    // }

    // ! Binary search
    public static int bS(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            // ! if we give assign value tomid outside while so we have to update mid here
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 4, 7, 9, 11, 28, 38 };
        System.out.print("Enter Key : ");
        int key = scanner.nextInt();
        int result = bS(arr, key);
        if (result != -1) {
            System.out.println("Key is present in Array ");
        } else {
            System.out.println("Key is not present in Array ");
        }
        scanner.close();

    }
}
