package com.Test_Next_Generation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Practise1 {
	
	@Test(retryAnalyzer = IRetryAnalyser_Practise.class)
	public void loginPage() {
		
		String actual = "Jack";
		String expected = "Rose";
				
		Assert.assertEquals(actual, expected);
		System.out.println("validation");
	}

}
