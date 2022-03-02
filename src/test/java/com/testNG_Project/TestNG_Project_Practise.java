package com.testNG_Project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;
import com.Runner_Class.po_Manager_Runner_Class;
import com.poManager_sdp.PO_Manager;


public class TestNG_Project_Practise extends po_Manager_Runner_Class {
	
//	@Test
//	public void adactin() {
//		WebDriver driver = Base_Class.getBrowserLaunch("chrome");
//		PO_Manager pom = new PO_Manager (driver);
//		getUrl("http://adactinhotelapp.com/");
//		
////		getWait("implicit", 10, element);
//		
//		inputValueElement(pom.getInstanceLp().getUserName(),"8754129120");
//		inputValueElement(pom.getInstanceLp().getPassword(),"poda1@Lusu");
//		clickOnElement(pom.getInstanceLp().getLogin());
//		
//		getDropDown(pom.getInstanceShp().getLocation(),"byIndex", "5");
//		getDropDown(pom.getInstanceShp().getHotels(),"byIndex","3");
//		getDropDown(pom.getInstanceShp().getRoom_type(),"byIndex","3");
//		getDropDown(pom.getInstanceShp().getRoom_nos(),"byIndex", "3");
//		inputValueElement(pom.getInstanceShp().getDatepick_in(),"31.01.2022");
//		inputValueElement(pom.getInstanceShp().getDatepick_out(),"01.02.2022");
//		getDropDown(pom.getInstanceShp().getAdult_room(),"byIndex","3");
//		getDropDown(pom.getInstanceShp().getChild_room(),"byIndex","1");
//		clickOnElement(pom.getInstanceShp().getSubmit());
//		
//		clickOnElement(pom.getInstanceSlp().getRadiobutton_0());
//		clickOnElement(pom.getInstanceSlp().getContinu());
//		
//		inputValueElement(pom.getInstanceBah().getFirst_name(),"Dee");
//		inputValueElement(pom.getInstanceBah().getLast_name(),"s");
//		inputValueElement(pom.getInstanceBah().getAddress(),"ABC Building, ABC Street, ABC");
//		inputValueElement(pom.getInstanceBah().getCc_num(),"1234567890123456");
//		getDropDown(pom.getInstanceBah().getCc_type(), "byIndex", "1");
//		getDropDown(pom.getInstanceBah().getCc_exp_month(), "byIndex", "1");
//		getDropDown(pom.getInstanceBah().getCc_exp_year(), "byIndex", "11");
//		inputValueElement(pom.getInstanceBah().getCc_cvv(),"1234");
//		clickOnElement(pom.getInstanceBah().getBook_now());
//		
//		clickOnElement(pom.getInstanceLo().getLogOut());
//		
//	}
//	
//}
	
	@BeforeSuite
	public void setProperty() {
		System.out.println("Launch the browser");
	}
	
		@BeforeTest
		public void launchBrowser() {
			WebDriver driver = Base_Class.getBrowserLaunch("chrome");
		}
	
			@BeforeClass
			private void launchUrl() {
				getUrl("http://adactinhotelapp.com/");
			}
	
				@BeforeMethod
				public void loginPage() {
					System.out.println("Into the project");
				}
	
	@Test
	@Parameters({"username","password"})
	public void login_Page(String username, String password) {
		
		inputValueElement(pom.getInstanceLp().getUserName(),username);
		inputValueElement(pom.getInstanceLp().getPassword(),password);
		clickOnElement(pom.getInstanceLp().getLogin());
		
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	@Test
	@Parameters({"location","hotel","roomType","noOfRoom","checkInDate","checkOutDate","adultsPerRooms","childrensPerRoom"})
	public void searchHotel_Page(String location,String hotel,String roomType,String noOfRoom,String checkInDate,String checkOutDate,String adultsPerRooms,String childrensPerRoom) { 
		
		getDropDown(pom.getInstanceShp().getLocation(),"byIndex",location);
		getDropDown(pom.getInstanceShp().getHotels(),"byIndex",hotel);
		getDropDown(pom.getInstanceShp().getRoom_type(),"byIndex",roomType);
		getDropDown(pom.getInstanceShp().getRoom_nos(),"byIndex",noOfRoom);
		inputValueElement(pom.getInstanceShp().getDatepick_in(),checkInDate);
		inputValueElement(pom.getInstanceShp().getDatepick_out(),checkOutDate);
		getDropDown(pom.getInstanceShp().getAdult_room(),"byIndex",adultsPerRooms);
		getDropDown(pom.getInstanceShp().getChild_room(),"byIndex",childrensPerRoom);
		clickOnElement(pom.getInstanceShp().getSubmit());
		
		System.out.println("Location : "+location);
		System.out.println("Hotel : "+hotel);
		System.out.println("Room Type : "+roomType);
		System.out.println("No Of Room : "+noOfRoom);
		System.out.println("Check In Date : "+checkInDate);
		System.out.println("Check Out Date : "+checkOutDate);
		System.out.println("Adults Per Rooms : "+adultsPerRooms);
		System.out.println("Childrens Per Room : "+childrensPerRoom);
		
	}
	
	@Test
	public void selectHotel_Page() {
		
		clickOnElement(pom.getInstanceSlp().getRadiobutton_0());
		clickOnElement(pom.getInstanceSlp().getContinu());

	}
	
	@Test
	@Parameters({"firstname","lastname","address","ccnum","cctype","ccexpmonth","ccexpyear","cccvv"})
	public void bookAHotel_Page(String firstname,String lastname,String address,String ccnum,String cctype,String ccexpmonth,String ccexpyear,String cccvv) {
		
		inputValueElement(pom.getInstanceBah().getFirst_name(),firstname);
		inputValueElement(pom.getInstanceBah().getLast_name(),lastname);
		inputValueElement(pom.getInstanceBah().getAddress(),address);
		inputValueElement(pom.getInstanceBah().getCc_num(),ccnum);
		getDropDown(pom.getInstanceBah().getCc_type(),"byIndex",cctype);
		getDropDown(pom.getInstanceBah().getCc_exp_month(),"byIndex",ccexpmonth);
		getDropDown(pom.getInstanceBah().getCc_exp_year(),"byIndex",ccexpyear);
		inputValueElement(pom.getInstanceBah().getCc_cvv(),cccvv);
		clickOnElement(pom.getInstanceBah().getBook_now());
		clickOnElement(pom.getInstanceLo().getLogOut());
		
		System.out.println("First Name : "+firstname);
		System.out.println("Last Name : "+lastname);
		System.out.println("Address : "+address);
		System.out.println("CC Num : "+ccnum);
		System.out.println("CC Type : "+cctype);
		System.out.println("CC Exp Month : "+ccexpmonth);
		System.out.println("CC Exp Year : "+ccexpyear);
		
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
			driver.close();
		}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}
}
