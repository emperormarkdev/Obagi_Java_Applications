// 2.32 Counting negative, positive, and zero numbers
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("Positive numbers: %d%n", positiveCount);
        System.out.printf("Negative numbers: %d%n", negativeCount);
        System.out.printf("Zeros: %d%n", zeroCount);
    }
}