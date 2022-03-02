package com.Test_Next_Generation;

import org.testng.annotations.Test;

public class Grouping_Practise {
	
	@Test(groups = "words")
	public void location() {
		System.out.println("New York");
	}

	@Test(groups = "words")
	public void hotel() {
		System.out.println("Hotel SunShine");
	}

	@Test(groups = "words")
	public void roomType() {
		System.out.println("Super Deluxe");
	}

	@Test(groups = "number")
	public void noOfRooms() {
		System.out.println("2");
	}

	@Test(groups = "date")
	public void checkInDate() {
		System.out.println("28.02.2022");
	}

	@Test(groups = "date")
	public void checkOutDate() {
		System.out.println("02.03.2022");
	}

	@Test(groups = "number")
	public void adultsPerRoom() {
		System.out.println("4");
	}

	@Test(groups = "number")
	public void childrensPerRoom() {
		System.out.println("2");
	}

}
