// 2.17 Arithmetic, Smallest and Largest
import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;
        
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);
    }
}