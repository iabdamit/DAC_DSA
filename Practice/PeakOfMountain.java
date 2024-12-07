//import java.util.Scanner;

public class PeakOfMountain {

    // public static int peak(int arr[]) {
    // int s = 0;
    // int e = arr.length - 1;
    // int mid = 0;
    // while (s <= e) {
    // mid = s + (e - s) / 2;
    // if (mid > 0 && mid < arr.length - 1) {
    // if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
    // return arr[mid];
    // } else if (arr[mid - 1] > arr[mid]) {
    // e = mid - 1;
    // } else {
    // s = mid + 1;
    // }
    // } else {
    // // Handling cases where mid is at the boundaries
    // if (mid == 0) {
    // return arr[mid] > arr[mid + 1] ? arr[mid] : arr[mid + 1];
    // } else {
    // return arr[mid] > arr[mid - 1] ? arr[mid] : arr[mid - 1];
    // }
    // }
    // }
    // return -1; // This line will never be reached if the array is correctly
    // formatted as a
    // // mountain.
    // }

    // !
    public static int peak(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {// ! agar yaha = use kiya to to vo end = start pe process karega
            int mid = (s + (e - s) / 2);
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                e = mid - 1;
            } else {
                s = mid;// ! we can use here (e=mid)
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 2, 1 };
        System.out.println("hello");
        System.out.println(peak(arr));
    }

}
