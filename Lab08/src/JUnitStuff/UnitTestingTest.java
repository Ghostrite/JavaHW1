package JUnitStuff;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTestingTest {
@Test
	
	public void AddIntsTest(){
		UnitTesting uT = new UnitTesting();
		int x = 14;
		int y = 20;
		int test = uT.addInts(x, y);
		int expected = 34;
		
		assertEquals(expected,test);
	}
	
@Test
	
	public void addStringsTest(){
		UnitTesting uT = new UnitTesting();
		String x = "Mon";
		String y = "ster";
		String test = uT.addStrings(x, y);
		String expected = "Monster";
		
		assertEquals(expected,test);
	}

@Test

public void findLenTest(){
	UnitTesting uT = new UnitTesting();
	String x = "what is the length of this string";
	int test = uT.findLen(x);
	int expected = 33;
	
	assertEquals(expected,test);
}

@Test

public void divXByYTest() {
	
	UnitTesting uT = new UnitTesting();
	int x = 20;
	int y = 10;
	int test = uT.divXByY(x, y);
	int expected = 2;
	assertEquals(expected,test);
	
//	UnitTesting uT1 = new UnitTesting();
//	int x1 = 20;
//	int y1 = 0;
//	int test1 = uT.divXByY(x, y);
//	int expected1 = (Integer) null;
//	assertEquals(expected1,test1);
}

@Test

public void reverseIntArray() {
	
	UnitTesting uT = new UnitTesting();
	int[] x = {2,3,4,5,6};
	int[] test = uT.reverseIntArray(x);
	int[] expected = {6,5,4,3,2};
	assertEquals(expected,test);
}
}


