import java.util.Scanner;

public class ProductCalculatorr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        // Calculate the product
        int result = num1 * num2 * num3;

        // Display the result
        System.out.printf("Product is %d%n", result);

        input.close();
    }
}