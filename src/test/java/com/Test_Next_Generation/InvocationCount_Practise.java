package com.Test_Next_Generation;

import org.testng.annotations.Test;

public class InvocationCount_Practise {
	
	@Test
	public void location() {
		System.out.println("New York");
	}

	@Test(invocationCount = 5)
	public void hotel() {
		System.out.println("Hotel SunShine");
	}

	@Test
	public void roomType() {
		System.out.println("Super Deluxe");
	}

	@Test(invocationCount = 10)
	public void noOfRooms() {
		System.out.println("2");
	}

	@Test
	public void checkInDate() {
		System.out.println("28.02.2022");
	}

	@Test(invocationCount = 2)
	public void checkOutDate() {
		System.out.println("02.03.2022");
	}

	@Test
	public void adultsPerRoom() {
		System.out.println("4");
	}

	@Test
	public void childrensPerRoom() {
		System.out.println("2");
	}

}
