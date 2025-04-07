import java.util.Scanner;

public class Accept10Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average;
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter num%d: ", i);
            int num = input.nextInt();

            sum += num;
            product *= num;
        }

        average = sum / 10.0;

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The average will be %.2f%n", average);
        System.out.printf("The product will be %d%n", product);
    }
}
