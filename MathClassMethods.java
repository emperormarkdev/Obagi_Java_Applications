import java.util.Scanner;

public class MathClassMethods {
    public static void main (String[] args) {
	    Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter number: ");
		double num = scan.nextDouble();
		
		System.out.printf("The absolutr value is %f%n",Maths.abs(num));
	}
}