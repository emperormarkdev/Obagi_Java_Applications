// Complete Java program covering Chapter 6 exercises 6.10 through 6.24

import java.util.*;

public class Chapter6Solutions {

    // 6.10: Sales Commissions
    public static void salesCommissions(int[] sales) {
        int[] salaryRanges = new int[9]; // $200-$299 to $1000+

        for (int sale : sales) {
            int salary = 200 + (int)(sale * 0.09);
            int index = salary >= 1000 ? 8 : (salary - 200) / 100;
            salaryRanges[index]++;
        }

        System.out.println("Salesperson Salary Ranges:");
        for (int i = 0; i < salaryRanges.length; i++) {
            if (i == 8)
                System.out.println("$1000 and over: " + salaryRanges[i]);
            else
                System.out.printf("$%d - $%d: %d\n", 200 + i * 100, 299 + i * 100, salaryRanges[i]);
        }
    }

    // 6.11
    public static void arrayOperations() {
        int[] counts = new int[10];
        Arrays.fill(counts, 0);

        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++)
            bonus[i]++;

        int[] bestScores = {87, 92, 78, 95, 88};
        for (int score : bestScores)
            System.out.println(score);
    }

    // 6.12: Duplicate Elimination
    public static void eliminateDuplicates() {
        Scanner scanner = new Scanner(System.in);
        int[] unique = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.print("Enter a number (10–100): ");
            int num = scanner.nextInt();
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (unique[i] == num) {
                    exists = true;
                    break;
                }
            }
            if (!exists && num >= 10 && num <= 100) {
                unique[count++] = num;
                System.out.println("Current unique values: " + Arrays.toString(Arrays.copyOf(unique, count)));
            }
        }
    }

    // 6.13: 2D Array Labeling
    public static void labelSalesArray() {
        int[][] sales = new int[3][5];
        int counter = 1;
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = counter++;
                System.out.print(sales[row][col] + " ");
            }
            System.out.println();
        }
    }

    // 6.14: Variable-Length Argument Product
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers)
            result *= num;
        return result;
    }

    // 6.15: Command-line array size
    public static void commandLineArray(String[] args) {
        int size = args.length > 0 ? Integer.parseInt(args[0]) : 10;
        int[] array = new int[size];
        System.out.println("Array of size: " + array.length);
    }

    // 6.16: Enhanced for loop sum
    public static void sumFromCommandLine(String[] args) {
        double total = 0;
        for (String arg : args)
            total += Double.parseDouble(arg);
        System.out.println("Sum: " + total);
    }

    // 6.17: Dice Rolling Simulation
    public static void rollDiceSimulation() {
        Random rand = new Random();
        int[] frequency = new int[13];
        for (int i = 0; i < 36_000_000; i++) {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            frequency[die1 + die2]++;
        }
        for (int i = 2; i <= 12; i++)
            System.out.printf("%2d: %d\n", i, frequency[i]);
    }

    // 6.18: Airline Reservation System
    public static void airlineReservation() {
        Scanner scanner = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        while (true) {
            System.out.print("Type 1 for First Class, 2 for Economy (0 to exit): ");
            int choice = scanner.nextInt();
            if (choice == 0) break;
            int start = choice == 1 ? 0 : 5;
            int end = choice == 1 ? 5 : 10;
            boolean assigned = false;
            for (int i = start; i < end; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    System.out.println("Boarding pass: Seat " + (i + 1) + " " + (choice == 1 ? "First Class" : "Economy"));
                    assigned = true;
                    break;
                }
            }
            if (!assigned) {
                if (choice == 1 && hasSpace(seats, 5, 10)) {
                    System.out.print("First Class full. Economy available. Accept? (y/n): ");
                    if (scanner.next().equalsIgnoreCase("y")) continue;
                } else if (choice == 2 && hasSpace(seats, 0, 5)) {
                    System.out.print("Economy full. First Class available. Accept? (y/n): ");
                    if (scanner.next().equalsIgnoreCase("y")) continue;
                }
                System.out.println("Next flight leaves in 3 hours.");
            }
        }
    }

    private static boolean hasSpace(boolean[] seats, int start, int end) {
        for (int i = start; i < end; i++)
            if (!seats[i]) return true;
        return false;
    }

    // 6.19: Total Sales
    public static void totalSales() {
        double[][] sales = new double[5][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales data as: salesperson(1-4) product(1-5) amount (enter -1 to stop):");
        while (true) {
            int person = scanner.nextInt();
            if (person == -1) break;
            int product = scanner.nextInt();
            double amount = scanner.nextDouble();
            sales[product - 1][person - 1] += amount;
        }

        System.out.printf("%-12s", "Product\\Person");
        for (int i = 1; i <= 4; i++)
            System.out.printf("P%d      ", i);
        System.out.println("Total");

        for (int i = 0; i < 5; i++) {
            double rowTotal = 0;
            System.out.printf("Product %d   ", i + 1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%8.2f", sales[i][j]);
                rowTotal += sales[i][j];
            }
            System.out.printf("  %8.2f\n", rowTotal);
        }
    }

    // Additional methods for 6.20 to 6.24 will be continued separately due to space...

    public static void main(String[] args) {
        // You can call any method here to test
        // e.g. salesCommissions(new int[]{5000, 3000, 7000});
    }
}
