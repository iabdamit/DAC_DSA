public class PivotInArray {

    public static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search to find the pivot
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if the middle element is less than or equal to the first element
            if (arr[mid] >= arr[0]) {
                start = mid + 1; // Move the start pointer to the right
            } else if (arr[mid] > arr[end]) {
                end = mid - 1; // Move the end pointer to the left
            } else {
                end = mid; // Update the end pointer
            }
        }

        // The start pointer now points to the pivot
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 10, 17, 1, 3 };

        // Find and print the pivot index
        int pivotIndex = findPivot(arr);
        System.out.println("Pivot Index: " + pivotIndex);
    }
}
