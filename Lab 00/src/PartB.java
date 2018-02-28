import java.io.*;
import java.util.Scanner;
public class PartB {
	
	public static void main(String args[]) throws Exception {
		Scanner input;
		input = new Scanner(System.in);
		String File;
		String st;
		int k = 1;
		System.out.println("What file?");
		File = input.nextLine();
		
		try {
			FileReader fileReader = new FileReader(File);
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(File));
			
			
			
			while((st =bufferedReader.readLine()) !=null) {
				System.out.println(k+" "+st);
				k=k+1;
			
			}
			
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
