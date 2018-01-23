
public class PartE {
	
	public static void main(String args[]) {
		
	int g = 0;
	for(int i=1; i<50; i++) {
		for (int x=2; x<i; x++) {
			if(i%x ==0) {
				g=0;
				break;
				
			}
			else {
				g=1;
			}
			
		}
		if(g==0) {
			System.out.println(i+" Is NOT a prime number");
			
		}
		else {
			System.out.println(i + " Is a prime number");
		}
	}
	}

}
