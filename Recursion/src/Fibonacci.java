public class Fibonacci {
    public static void main(String[] args) {
        int count = 9;
        int num1 = 0;
        System.out.print("first " + count + " Fibonacci Number : ");
        System.out.print(num1 + " ");
        int num2 = 1;
        System.out.print(num2 + " ");
        for (int i = 2; i < count; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}
