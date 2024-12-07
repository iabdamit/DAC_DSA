package cdac.in;

public class MergeSort {

    public static void merge(int[] A, int left, int middle, int right) {
        // ! Create temporary arrays to store the left and right halves
        int[] leftTempArray = new int[middle - left + 1];
        int[] rightTempArray = new int[right - middle];

        // ! Copy elements to the temporary left and right arrays
        for (int i = 0; i <= middle - left; i++) {
            leftTempArray[i] = A[left + i];
        }

        for (int i = 0; i < right - middle; i++) {
            rightTempArray[i] = A[middle + 1 + i];
        }

        // ! Merge the two halves in sorted order back into the original array A
        int i = 0, j = 0, k = left;
        while (i < leftTempArray.length && j < rightTempArray.length) {
            if (leftTempArray[i] <= rightTempArray[j]) {
                A[k] = leftTempArray[i];
                i++;
            } else {
                A[k] = rightTempArray[j];
                j++;
            }
            k++;
        }

        // ! Copy remaining elements from leftTempArray, if any
        while (i < leftTempArray.length) {
            A[k] = leftTempArray[i];
            i++;
            k++;
        }

        // ! Copy remaining elements from rightTempArray, if any
        while (j < rightTempArray.length) {
            A[k] = rightTempArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] Array, int left, int right) {
        if (right > left) {
            // ! Find the middle point of the array
            int middle = (left + right) / 2;

            // ! Recursively sort the left and right halves
            mergeSort(Array, left, middle);
            mergeSort(Array, middle + 1, right);

            // ! Merge the sorted halves
            merge(Array, left, middle, right);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 53, 10, 30, 76, 3, 57, 24 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
