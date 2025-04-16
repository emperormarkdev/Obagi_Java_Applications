import java.security.SecureRandom;

public class RandomBankAccountNumberGenerator {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        System.out.print("Generated Bank Account Number: ");

        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10); // 0 to 9
            System.out.printf("%d", digit); // use % to print each digit
        }

        System.out.println(); // Move to the next line
    }
}