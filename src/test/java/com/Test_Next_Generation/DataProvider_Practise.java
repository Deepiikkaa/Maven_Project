package com.Test_Next_Generation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practise {

	@Test(dataProvider = "input")
	public void loginPage(String username,String password) {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	@DataProvider
	private Object[][] input() {
		return new Object[][] {
			
			{"jack","jack@123"},
			{"rose","rose@123"},
			{"harry","harry@123"},
			{"rosh","rosh@123"},
			{"black","black@123"},
			{"steve","steve@123"}
			
		};
	}
}
