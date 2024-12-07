package cdac.in;

public class FindMissingNumber {
    
    public void missingValue() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = 10;
        
        int expectedSum = (n * (n + 1)) / 2;
        
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        
        int missing = expectedSum - actualSum;
        System.out.println("Missing Integer is " + missing);
    }
}

