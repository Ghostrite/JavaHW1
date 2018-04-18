package JUnitStuff;


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
	
	public int divXByY(int x, int y) {
		if (y==0) {
			return (Integer) null;
		}
		else {
		return (x/y);
		}
}
	public int[] reverseIntArray(int[] x) {
		for (int i=0; i<x.length/2; i++) {
			int temp = x[i];
			x[i] = x[x.length-i-1];
			x[x.length-i-1] = temp;
	
		}
		return x;
	}
}
