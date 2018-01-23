
public class PartD {
	public static void main (String args[]) {
		System.out.print("Factorial of is: "+fact(10));
		
		}
	 static int fact(int n) {
		if (n==1) 
			return 1;
		else {
			return (n * fact(n-1));
		}
	
		

	
}
}
