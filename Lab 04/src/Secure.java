import java.util.Scanner;
import java.io.*;
public class Secure {

	
	public static void main(String args[]) throws Exception {
	Scanner input;
	input = new Scanner(System.in);
	String user;
	boolean repeat = true;
	while (repeat =true){
		System.out.println("Please enter your sentence");
		user = input.nextLine();
		if(user.length() == 0) {
			break;
		}
	if(user.contains("int") || user.matches("(.)*(\\s)(0)(.)*") || user.matches("(0)(.)*") ||  user.contains("SELECT") && user.contains("WHERE") || user.contains("'") && user.matches("(.)*(\")(.)*(')(.)*(\")(.)*") == false
			|| user.contains("\"") && user.matches("(.)*(\")(.)*(\")(.)*(\")(.)*") == false && user.matches("(.)*(\")(.)*(')(.)*(\")(.)*") == false)
	{
		System.out.println("Unsafe\n");
		
	}
	else {
		System.out.println("Safe\n");
		
		}
	}
}
	}
