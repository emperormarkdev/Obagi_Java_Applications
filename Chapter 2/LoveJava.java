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