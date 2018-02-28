import java.io.*;
import java.util.Scanner;

public class Lab2 {
	public static void main(String args[]) throws Exception {
		
		Scanner input;
		input = new Scanner(System.in);
		String File;
		String st;
		String name;
		boolean repeat = true;
		System.out.println("Please enter the name of your ingredient list");
		name = input.nextLine();
		
		try {
			PrintWriter pw = new PrintWriter(name);
		
		
		
		
			while (repeat=true) {
				System.out.println("Please enter the next ingrediant, leave blank there are no additional ingrediants.");
				File = input.nextLine();
			if(File.length() == 0) {
				break;
			}
				pw.println(File);
			}
			pw.close();
		}
		catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
			
			
		}

			
	


