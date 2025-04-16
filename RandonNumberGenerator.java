import java.util.Random;

public class RandonNumberGenerator{
    public static void main (String[] args) {
	    Random ran = new Random ();
		
		Boolean option = ran.nextBoolean () ;
		System.out.printf("Do you love java? %b%n",option);
		
		int integer = ran.nextInt ();
		System.out.printf("The integer is %d%n",integer);
		
		int integerwithbound = ran.nextInt(100) + 1;
		System.out.print("The interger is %d%n",integerWithBound);
		
		float floatValue = ran.nextFloat();
        System.out.printf("Random float: %f%n", floatValue);

        double doubleValue = ran.nextDouble(); 
        System.out.printf("Random double: %f%n", doubleValue);
		
		
		
		
		
		
	}
}