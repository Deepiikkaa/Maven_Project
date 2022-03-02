package com.Test_Next_Generation;

import org.testng.annotations.Test;

public class TimeOutException_Practise {
	
	@Test(timeOut=7000)
	public void timeOut() throws InterruptedException {
		
		System.out.print("New York");
		Thread.sleep(3000);
		
		System.out.println("Hotel SunShine");
		System.out.println("Super Deluxe");
		System.out.println("2");
	
		System.out.println("28.02.2022");
		Thread.sleep(9000);					//fail : 9000>7000 to get pass Thread.sleep>timeOut
		
		System.out.println("02.03.2022");
		System.out.println("4");
	
		Thread.sleep(5000);
		System.out.println("2");
	}
}
