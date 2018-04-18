package JUnitStuff;

public class KitchenSink {
	
	public String greet(String name) {
		
		return "Hello, "+name +"!";
	
	}
	public String greetLoudly(String name){
		
		
		return greet(name).toUpperCase();
	}
	
	public int intLog(int value) {
		
		double result = Math.log10(value);
		
		return (int) result+1;
	}

}