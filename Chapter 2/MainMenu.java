import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a program to run:");
            System.out.println("1 - Display Numbers (Coming Soon!)");
            System.out.println("2 - Arithmetic Operations (Coming Soon!)");
            System.out.println("16 - BMI Calculator");
            System.out.println("18 - Car-Pool Savings Calculator");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");

            if (!input.hasNextInt()) {  // Prevents input mismatch errors
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Consume invalid input
                continue;
            }

            choice = input.nextInt();

            switch (choice) {
                case 16: BMICalculator.run(input); break;
                case 18: CarPoolSavings.run(input); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Feature coming soon!");
            }
        } while (choice != 0);

        input.close();
    }
}

// 2.33 BMI Calculator
class BMICalculator {
    public static void run(Scanner input) {
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (m): ");
        double height = input.nextDouble();

        if (height <= 0) {
            System.out.println("Invalid height. Must be greater than 0.");
            return;
        }

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        System.out.println("\nBMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi <= 24.9) {  // No need for bmi >= 18.5 since it's already checked
            System.out.println("You have a Normal weight.");
        } else if (bmi <= 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }
    }
}

// 2.35 Car-Pool Savings Calculator
class CarPoolSavings {
    public static void run(Scanner input) {
        System.out.print("Enter total miles driven per day: ");
        double totalMilesPerDay = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        if (milesPerGallon <= 0) {
            System.out.println("Invalid miles per gallon. Must be greater than 0.");
            return;
        }

        System.out.print("Enter parking fees per day: ");
        double parkingFeesPerDay = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();

        double gasolineCostPerDay = (totalMilesPerDay / milesPerGallon) * costPerGallon;
        double totalDailyCost = gasolineCostPerDay + parkingFeesPerDay + tollsPerDay;

        System.out.printf("Your daily driving cost is: $%.2f%n", totalDailyCost);
    }
}
