import java.util.Scanner; // Import Scanner class

// 2.2 - LoveJava Class
public class LoveJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter an integer
        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("\"This is a Java\"\n");
        System.out.println("Program");

        String programming = "programming";
        String java = "Java";
        System.out.printf("Java is my best %s language%n", programming);
        System.out.printf("I love %s%n", java);

        input.close();
    }
}

// 2.3 - TaskSolutions Class
class TaskSolutions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Declare variables
        int c, thisIsAVariable, q76354, number;

        // b) Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // c) Input an integer and assign the result to int variable value
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

// 2.5 - ProductCalculator Class
class ProductCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) State that a program will calculate the product of three integers.
        System.out.println("This program calculates the product of three integers.");

        // b) Create a Scanner called input that reads values from the standard input.
        // c) Declare the variables x, y, z and result to be of type int.
        int x, y, z, result;

        // d) Prompt the user to enter the first integer.
        System.out.print("Enter the first integer: ");
        x = input.nextInt();

        // e) Prompt the user to enter the second integer.
        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        // f) Prompt the user to enter the third integer.
        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        // g) Compute the product of the three integers and assign the result to the variable result.
        result = x * y * z;

        // h) Display the result.
        System.out.printf("Product is %d%n", result);

        input.close(); // Close the Scanner
    }
}

// Another version of ProductCalculator - ProductCalculatorr Class
class ProductCalculatorr {
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