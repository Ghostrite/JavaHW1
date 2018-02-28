import java.util.Scanner;
public class Fibonacci {

	public static void main(String args[])
	{
		Scanner input;
		
		input = new Scanner(System.in);
		int n;
		long k = 0;
		long k2= 1;
		long k3;
		
		
		System.out.println("Fibonacci sequence up to: ");
		n = Integer.parseInt(input.nextLine());
		
		if (n==0) {
			System.out.println("0");
		}
		if (n==1) {
			System.out.println("0");
			System.out.println("1");
		}
		else {
			for (int i = 1; i<n; i++) {
				k3 = k+k2;
				
				System.out.println(k3);
				k=k2;
				k2=k3;
				
			}
		}
		
	}
}
