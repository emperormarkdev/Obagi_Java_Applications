// Exercise 3.19 - Sales Commission Calculator
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;

        while (true) {
            System.out.print("Enter item value (-1 to quit): ");
            double itemValue = input.nextDouble();
            if (itemValue == -1) break;
            totalSales += itemValue;
        }

        double earnings = 200 + (0.09 * totalSales);
        System.out.printf("Total earnings: $%.2f\n", earnings);
    }
}