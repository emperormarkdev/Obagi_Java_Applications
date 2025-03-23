import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a program to run:");
            System.out.println("1 - Display Numbers (2.14)");
            System.out.println("2 - Arithmetic Operations (2.15)");
            System.out.println("3 - Compare Two Integers (2.16)");
            System.out.println("4 - Number Statistics (2.17)");
            System.out.println("5 - Display Shapes (2.18)");
            System.out.println("6 - Print Patterns (2.19 - 2.23)");
            System.out.println("7 - Find Largest & Smallest (2.24)");
            System.out.println("8 - Odd or Even (2.25)");
            System.out.println("9 - Multiples (2.26)");
            System.out.println("10 - Checkerboard Pattern (2.27)");
            System.out.println("11 - Circle Calculations (2.28)");
            System.out.println("12 - Integer Value of a Character (2.29)");
            System.out.println("13 - Separating Digits (2.30)");
            System.out.println("14 - Table of Squares and Cubes (2.31)");
            System.out.println("15 - Negative, Positive, and Zero Values (2.32)");
            System.out.println("16 - BMI Calculator (2.33)");
            System.out.println("17 - World Population Growth Calculator (2.34)");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1: DisplayNumbers.run(); break;
                case 2: ArithmeticOperations.run(); break;
                case 3: CompareIntegers.run(); break;
                case 4: NumberStatistics.run(); break;
                case 5: DisplayShapes.run(); break;
                case 6: PrintPatterns.run(); break;
                case 7: LargestSmallest.run(); break;
                case 8: OddOrEven.run(); break;
                case 9: Multiples.run(); break;
                case 10: CheckerboardPattern.run(); break;
                case 11: CircleCalculations.run(); break;
                case 12: IntegerValue.run(); break;
                case 13: SeparatingDigits.run(); break;
                case 14: TableSquaresCubes.run(); break;
                case 15: NumberClassifier.run(); break;
                case 16: BMICalculator.run(); break;
                case 17: PopulationGrowth.run(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        input.close();
    }
}

// 2.33 BMI Calculator
class BMICalculator {
    public static void run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (m): ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Display BMI categories
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

        // Evaluate the BMI category
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }
    }
}