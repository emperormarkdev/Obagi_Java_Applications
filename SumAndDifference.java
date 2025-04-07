
// write a java program to accept 10 numbers, from a user and find the sum of numbers 6 to 9 and the sum of numbers 4 to 10, subtract the sum of numbers 6 to 9 from the sum of numbers 4 to 10 and display the results, use the simple statements ive been pshing to you

import java.util.Scanner;

public class SumAndDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum6to9 = 0;
        int sum4to10 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter num%d: ", i);
            int num = input.nextInt();

            if (i >= 6 && i <= 9) {
                sum6to9 += num;
            }

            if (i >= 4 && i <= 10) {
                sum4to10 += num;
            }
        }

        int result = sum4to10 - sum6to9;

        System.out.printf("The sum of numbers 6 to 9 is %d%n", sum6to9);
        System.out.printf("The sum of numbers 4 to 10 is %d%n", sum4to10);
        System.out.printf("The result after subtraction is %d%n", result);
    }
}
