package com.Test_Next_Generation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Practise {
	
	@Test								//method 1 with correct parameter
	@Parameters({"username","password"})
	public void loginPage(String username,String password) {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	@Test								//method 2.a with wrong parameter(i.e. username) in xml
	@Parameters({"username","password"})
	public void loginPage1(@Optional("Rose")String username,String password) {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	@Test								//method 2.b with wrong parameter(i.e. password) in xml
	@Parameters({"username","password"})
	public void loginPage2(String username,@Optional("Rose@123")String password) {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
}

//run at .xml