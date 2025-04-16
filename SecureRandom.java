import java.security.SecureRandom;

public class SecureRandonNumberGenerator{
    public static void main (String[] args) {
	    SecureRandom secureRan = new SecureRandom ();
		
		Boolean option = securean.nextBoolean () ;
		System.out.printf("Do you love java? %b%n",option);
		
		int integer = secureRan.nextInt ();
		System.out.printf("The integer is %d%n",integer);
		
		int integerwithbound = secureRan.nextInt(100) + 1;
		System.out.print("The interger is %d%n",integerWithBound);
		
		float floatValue = secureRan.nextFloat();
        System.out.printf("Random float: %f%n", floatValue);

        double doubleValue = secureRan.nextDouble(); 
        System.out.printf("Random double: %f%n", doubleValue);
	}
}