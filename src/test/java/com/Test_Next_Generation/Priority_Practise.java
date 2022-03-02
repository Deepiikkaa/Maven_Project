package com.Test_Next_Generation;

import org.testng.annotations.Test;

public class Priority_Practise {

	@Test(priority=2)
	public void location() {
		System.out.println("New York");
	}

	@Test(priority=1)
	public void hotel() {
		System.out.println("Hotel SunShine");
	}

	@Test(priority=-2)
	public void roomType() {
		System.out.println("Super Deluxe");
	}

	@Test(priority=0)
	public void noOfRooms() {
		System.out.println("2");
	}

	@Test(priority=-1)
	public void checkInDate() {
		System.out.println("28.02.2022");
	}

	@Test(priority=-3)
	public void checkOutDate() {
		System.out.println("02.03.2022");
	}

	@Test
	public void adultsPerRoom() {
		System.out.println("4");
	}

	@Test(priority=3)
	public void childrensPerRoom() {
		System.out.println("2");
	}
	
}
