import java.util.Scanner;
import java.lang.Math.*;
public class PartC {
	public static void main(String args[]) {
		Scanner input;
		double n;
		double k;
		input = new Scanner(System.in);
		System.out.println("Please enter the radius");;
		n = Integer.parseInt(input.nextLine());
		
		
		k = (4.0/3.0)*Math.PI*Math.pow(n, 3);
		System.out.println("The volume of the sphere is: "+k);
		
		
		
	}

}
