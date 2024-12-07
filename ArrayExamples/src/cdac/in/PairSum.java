package cdac.in;

public class PairSum {
    int sum = 9;
    int arr[] = {2,4,5,7, 6, 3, 9, 11};

    public void compare() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        PairSum pairSum = new PairSum();
        pairSum.compare();
    }
}
