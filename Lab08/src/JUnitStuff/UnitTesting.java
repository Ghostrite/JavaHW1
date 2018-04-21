package JUnitStuff;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class UnitTesting {
	
	public int addInts(int x, int y) {
		
		return x+y;
	
	}
	public String addStrings(String x, String y){
		
		
		return  x+y;
	}
	
	
	public int findLen(String x) {
		
		return x.length();
		
	}
	
	
	public Integer divXByY(int x, int y) {
		if (y==0) {
			
			return null;
		}
		else {
			
		return (x/y);
		}
}
	public int[] reverseIntArray(int[] x) {
		 
		int[] ArrayReverse = new int[x.length];
		
		
		int tempVar = 0;
		 for (int i = x.length-1; i>=0; i--) 
		 {
			 
			 ArrayReverse[tempVar] = x[i];
			 
			tempVar += 1;
			 
			 	
		}
		
		return ArrayReverse;
	}
	
	public int[] range(int x) {
		 
		int[] ArrayRange = new int[x];
		int tempVar = 0;
		 for (int i = 0; i<x; i++) 
		 {
			 ArrayRange[tempVar] = i;
			 tempVar+=1;
			 
		}
		
		return ArrayRange;
	}
	public int[] range(int x, int y) {
		 
		int[] ArrayRange = new int[y];
		int tempVar = 0;
		 for (int i = x; i<y; i++) 
		 {
			 ArrayRange[tempVar] = i;
			 tempVar+=1;
			 
			
		}
		
		return ArrayRange;
	}
	public int[] range(int x, int y, int z) {
		 
		int[] ArrayRange = new int[y];
		int tempVar = 0;
		 for (int i = x; i<y; i+=z) 
		 {
			 ArrayRange[tempVar] = i;
			 tempVar+=1;
			 System.out.println(i);
			 
		}
		
		return ArrayRange;
	}
	
	}

