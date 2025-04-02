// 2.24 Finding Largest and Smallest of 5 Numbers
import java.util.Scanner;

public class LargestSmallestFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();
            
            if (num > largest) {
                largest = num;
            }
            
            if (num < smallest) {
                smallest = num;
            }
        }
        
        System.out.printf("Largest: %d%n", largest);
        System.out.printf("Smallest: %d%n", smallest);
    }
}