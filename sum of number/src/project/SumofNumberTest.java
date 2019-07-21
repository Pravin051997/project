package project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumofNumberTest {

	@Test
	void test() {
		sumofnumbers sum =new sumofnumbers();
		int out = sum.SumOfEven(1, 10);
		assertEquals(30,out);
		
		int out1 = sum.SumOfOdd(1, 10);
		assertEquals(25,out1);
	}

}
