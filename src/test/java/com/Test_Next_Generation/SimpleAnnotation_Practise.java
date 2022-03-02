package com.Test_Next_Generation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation_Practise {

	@BeforeSuite
	public void setProperty() {
		System.out.println("Driver");
	}
	
		@BeforeTest
		public void launchBrowser() {
			System.out.println("Chrome");
		}
	
			@BeforeClass
			private void launchUrl() {
				System.out.println("Adactin Hotel");
			}
	
				@BeforeMethod
				public void loginPage() {
					System.out.println("Username");
					System.out.println("Password");
				}
	
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
	
					@Test
					public void adultsPerRoom() {
						System.out.println("4");
					}
	
					@Test
					public void childrensPerRoom() {
						System.out.println("2");
					}
	
				@AfterMethod
				public void selectHotelPage() {
					System.out.println("continue");
				}
	
			@AfterClass
			public void logOut() {
				System.out.println("Logged Out");
			}

		@AfterTest
		public void close() {
			System.out.println("Close");
		}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}
}

//convert to .xml to get all output continuously 
//output order:ascii value of method name

//failed test
//ignore
