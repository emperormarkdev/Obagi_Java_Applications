public class InstancMeethodWithNoReturnType {
    public static void main (String[] args) {
		InstancMeethodWithNoReturnType imwrt = new InstancMeethodWithNoReturnType();
		imwrt.addition();
	}
	
	public void addition() {
	    int num1 = 50;
		int num2 = 17;
		
		int sum = num1 + num2;
		System.out.print("The sum is %d%n",sum);
	}
	
}