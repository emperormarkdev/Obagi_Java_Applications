// Exercise 3.17 - Gas Mileage
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons;
        double totalMiles = 0, totalGallons = 0;

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
            if (miles == -1) break;

            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            totalMiles += miles;
            totalGallons += gallons;

            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);
            System.out.printf("Total miles per gallon: %.2f\n", totalMiles / totalGallons);
        }
    }
}