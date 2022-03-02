package com.Test_Next_Generation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Practise {
	
	@Test
	public void location() {
		System.out.println("New York");
	}

	@Test
	public void hotel() {
		System.out.println("Hotel SunShine");
	}

	@Test
	public void roomType() {
		System.out.println("Super Deluxe");
	}

	@Ignore									//method 1
	@Test
	public void noOfRooms() {
		System.out.println("2");
	}

	@Test
	public void checkInDate() {
		System.out.println("28.02.2022");
	}

	@Test
	public void checkOutDate() {
		System.out.println("02.03.2022");
	}

	@Test(enabled=false)					// method 2
	public void adultsPerRoom() {
		System.out.println("4");
	}

	@Test(enabled=false)
	public void childrensPerRoom() {
		System.out.println("2");
	}

}

//convert to .xml to get output for method 3
