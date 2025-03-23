//2.3

import java.util.Scanner; // Import Scanner class

public class TaskSolutions {
    public static void main(String[] args) {
        // a) Declare variables
        int c, thisIsAVariable, q76354, number;

        // b) Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // c) Input an integer and assign the result to int variable value
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        // d) Print "This is a Java program" on one line
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines using printf
        System.out.printf("%s%n%s%n", "This is a", "Java program");

        // f) If variable 'number' is not equal to 7, display a message
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        input.close(); // Close the Scanner
    }
}