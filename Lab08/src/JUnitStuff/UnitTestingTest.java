package JUnitStuff;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;

public class UnitTestingTest {
@Test
	
	public void AddIntsTest(){
		UnitTesting uT = new UnitTesting();
		UnitTesting uT2 = new UnitTesting();
		UnitTesting uT3 = new UnitTesting();
		int x = 14;
		int y = 20;
		int test = uT.addInts(x, y);
		int expected = 34;
		int x2 = -14;
		int y2 = -20;
		int test2 = uT2.addInts(x2, y2);
		int expected2 = -34;
		int x3 = 14;
		int y3 = -20;
		int test3 = uT3.addInts(x3, y3);
		int expected3 = -6;
		
		assertEquals(expected,test); // Positive + positive 
		assertEquals(expected2,test2); // negative + negative
		assertEquals(expected3,test3); // Positive + negative
		
	}

	
@Test
	
	public void addStringsTest(){
		UnitTesting uT = new UnitTesting();
		String x = "Mon";
		String y = "ster";
		String test = uT.addStrings(x, y);
		String expected = "Monster";
		int test2 = test.length();
		int expected2  = expected.length();
		
		assertEquals(expected,test); // String = String
		assertEquals(expected2,test2);  //length of string = length of string
	}

@Test

public void findLenTest(){
	UnitTesting uT = new UnitTesting();
	String x = "what is the length of this string";
	int test = 33;
	int expected = x.length();
	String x2 = "";
	int test2 = uT.findLen(x2);
	int expected2 = 0;
	assertEquals(expected,test);    // expected length
	assertEquals(expected2,test2);  // length = 0
}

@Test

public void divXByYTest() {
	
	UnitTesting uT = new UnitTesting();
	int x = 20;
	int y = 10;
	int test = uT.divXByY(x, y);
	int expected = 2;
	assertEquals(expected,test);     //Division by two integers
	
	UnitTesting uT1 = new UnitTesting();
	Integer x1 = 20;
	Integer y1 = 0;
	Integer test1 = uT.divXByY(x1, y1);
	Integer expected1 = null;
	assertEquals(expected1,test1);    // division by 0
}

@Test

public void reverseIntArray() {
	
	UnitTesting uT = new UnitTesting();
	int[] x = {2,3,4,5,6};
	
	int[] test = uT.reverseIntArray(x);
	int testSum = IntStream.of(test).sum();
	int[] test2 = {6,5,4,3,2};
	int[] expected = {6,5,4,3,2};
	int expectedSum = IntStream.of(expected).sum();
	
	
	assertEquals(expectedSum,testSum);  // Sum(ReveresedArraylist) + Sum(expectedArraylist)
	
}

@Test

public void rangeTest() {
	
	UnitTesting uT = new UnitTesting();
	
	
	
	int x = 2;
	int y = 10;
	int z = 3;
	int[] test = uT.range(x);
	int testSum = IntStream.of(test).sum();
	int[] test2 = uT.range(x,y);
	int testSum2 = IntStream.of(test2).sum();
	int[] test3 = uT.range(x,y,z);
	int testSum3 = IntStream.of(test3).sum();
	
	int[] expected = {0,1};
	int expectedSum = IntStream.of(expected).sum();
	int[] expected2 = {2,3,4,5,6,7,8,9};
	int expectedSum2 = IntStream.of(expected2).sum();
	int[] expected3 = {2,5,8};
	int expectedSum3 = IntStream.of(expected3).sum();
	
	
	
	
	assertEquals(testSum,expectedSum);    // range(x)
	assertEquals(expectedSum2,testSum2);  // range(x,y)
	assertEquals(expectedSum3,testSum3);  //range(x,y,z)
	
}
}





