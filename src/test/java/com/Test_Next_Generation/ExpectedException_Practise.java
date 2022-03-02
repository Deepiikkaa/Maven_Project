package com.Test_Next_Generation;

import org.testng.annotations.Test;

public class ExpectedException_Practise {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void mathematics() {
	
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}

}
