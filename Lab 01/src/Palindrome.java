import java.util.Scanner;


public abstract class Palindrome {
	
	
	private static Scanner input;

	public static void main(String args[]) {
		
	boolean x = true;
	while (x= true) {
		
	
		
	
	input = new Scanner(System.in);
	String check = "";
	String again;
	String input1;

	
	System.out.println("Please enter a string: ");
	input1 =input.nextLine();

	
	int l = input1.length();
	
	for (int i =l -1; i>=0; i--)
		check = check+input1.charAt(i);
	
			
			if(input1.equals(check))
				System.out.println("The word, "+input1+", is a palindrome");		
			else {
				System.out.println("The word, "+input1+", is not a palindrome");	
			}
			
			
			System.out.println("Again?(y/n): ");
			again = input.nextLine();
			if (again.equals("n")) {
				break;
			}
			
	
	
	
	
	

	}
	
	}
}
