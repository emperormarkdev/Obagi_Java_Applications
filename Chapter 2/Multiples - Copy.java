// 2.26 Check if one number is a multiple of another
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.printf("%d is a multiple of %d%n", num1, num2);
        } else {
            System.out.printf("%d is NOT a multiple of %d%n", num1, num2);
        }
    }
}