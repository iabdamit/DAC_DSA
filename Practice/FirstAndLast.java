import java.util.Scanner;

public class FirstAndLast {
    public static int firstOccurenece(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurenece(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 0, 0, 1, 1, 2, 2, 2, 2 };
        System.out.print("Enter Key : ");
        int key = scanner.nextInt();
        System.out.println(" First Occurence at index : " + firstOccurenece(arr, key));
        System.out.println(" last Occurence at index : " + lastOccurenece(arr, key));
        int totalOccurence = lastOccurenece(arr, key) - firstOccurenece(arr, key) + 1;
        System.out.println("Total Occerence : " + totalOccurence);
        scanner.close();

    }
}
