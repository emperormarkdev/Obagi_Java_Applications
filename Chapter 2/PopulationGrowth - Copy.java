// 2.34 World Population Growth Calculator
import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();

        System.out.print("Enter annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble() / 100;

        for (int year = 1; year <= 5; year++) {
            population += (long) (population * growthRate);
            System.out.printf("Estimated population after %d year(s): %d%n", year, population);
        }
    }
}