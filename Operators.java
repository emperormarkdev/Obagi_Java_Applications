public class Operators {
    public static void main(String[] args) {
        // Assignment Operator (=)
        int num1, num2;

        num1 = 19;
        num2 = 5;

        // Arithmetic Operators (+, *, -, /, %)
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double) num1 / num2; // Using double because we want decimal division
        int modulus = num1 % num2;

        // Relational Operators (>, <, >=, ==, !=)
        boolean isLessThan = num1 < num2;
        boolean isGreaterThan = num1 > num2;
        boolean isGreaterThanOrEqualTo = num1 >= num2;
        boolean isLessThanOrEqualTo = num1 <= num2;
        boolean isEqualTo = num1 == num2;
        boolean isNotEqualTo = num1 != num2;

        // Logical Operators (&&, ||, !)
        boolean isAndOperator = num1 > num2 && num1 >= num2;
        boolean isOrOperator = num1 == num2 || num1 >= num2;
        boolean isNotOperator = !(num1 == num2 || num1 >= num2); // Fixed typo: changed "isNotOpeartor" to "isNotOperator"

        // Corrected output statements
        System.out.printf("The sum of the numbers is: %d%n", sum);
        System.out.printf("The product of the numbers is: %d%n", product);
        System.out.printf("The difference between %d and %d is: %d%n", num1, num2, difference);
        System.out.printf("The quotient of %d and %d is: %.2f%n", num1, num2, quotient);
        System.out.printf("The modulus of %d and %d is: %d%n", num1, num2, modulus);

        System.out.println("=============================================================================");

        // printf statement for relational operators
        System.out.printf("Is %d less than %d? %b%n", num1, num2, isLessThan);
        System.out.printf("Is %d greater than %d? %b%n", num1, num2, isGreaterThan);
        System.out.printf("Is %d greater than or equal to %d? %b%n", num1, num2, isGreaterThanOrEqualTo);
        System.out.printf("Is %d less than or equal to %d? %b%n", num1, num2, isLessThanOrEqualTo);
        System.out.printf("Is %d == %d? %b%n", num1, num2, isEqualTo);
        System.out.printf("Is %d != %d? %b%n", num1, num2, isNotEqualTo);

        System.out.println("=============================================================================");

        // Corrected logical operators output
        System.out.printf("Is %d > %d && %d >= %d? %b%n", num1, num2, num1, num2, isAndOperator);
        System.out.printf("Is %d == %d || %d >= %d? %b%n", num1, num2, num1, num2, isOrOperator);
        System.out.printf("Is ! (%d == %d || %d >= %d)? %b%n", num1, num2, num1, num2, isNotOperator);
    }
}
