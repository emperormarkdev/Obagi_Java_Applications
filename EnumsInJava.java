public class EnumsInJava{
	public static void main(String[] args) {
	    AccountType type = AccountType.SAVINGS;
		
		switch(type) {
		    case SAVINGS:
			{
			    System.out.printIn("Your savings account has been credited with an intrest rate of 2.5%");
			}
			break;
			
		switch(type) {
		    case CHECKING:
			{
			    System.out.printIn("Your savings account has been credited with an intrest rate of 0.0%");
			}
			break;
			
		switch(type) {
		    case FIXED DEPOSIT:
			{
			    System.out.printIn("Your savings account has been credited with an intrest rate of 9.5%");
			}
			break;
		}	
	
	}
}