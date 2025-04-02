import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter gender (M/F): ");
        char gender = input.next().charAt(0);
        
        input.nextLine(); // Consume the newline character
        
        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        
        System.out.print("Enter your balance: ");
        double balance = input.nextDouble();
        
        System.out.print("Do you love Java? (True/False): ");
        boolean inJava = input.nextBoolean();

        // Adding a newline after inputs for better formatting
        System.out.println();

        // Output messages
        System.out.printf("Hello %s, you are welcome to First Bank.%n", name);
        System.out.printf("You are living in %s.%n", address);
        System.out.printf("You are %d years old.%n", age);
        System.out.printf("Your account balance is $%.2f%n", balance);
        System.out.printf("%s, do you love Java? %b%n", name, inJava);
        System.out.printf("Your gender is %c%n", gender); // Fixed incorrect method
    }
}
