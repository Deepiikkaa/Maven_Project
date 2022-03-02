package com.Test_Next_Generation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Practise {
	
//Hard Assert ----> Validation
	@Test
	public void loginPage() {
		
		String actual = "Jack";
		String expected = "Rose";
				
		Assert.assertEquals(actual, expected);
		System.out.println("validation");
	}
	
	@Test
	public void loginPage1() {
		
		String actual = "Jack";
		String expected = "Jack";
				
		Assert.assertEquals(actual, expected);
		System.out.println("validation");
	}
	
//Soft Assert -----> Verification
	@Test
	public void loginPage2() {
		
		String actual = "Jack";
		String expected = "Rose";
				
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		
		System.out.println("verification");
	}
	
	@Test
	public void loginPage3() {
		
		String actual = "Jack";
		String expected = "Rose";
				
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		
		System.out.println("verification");
		
		soft.assertAll();		//to get failed value
	}

}
