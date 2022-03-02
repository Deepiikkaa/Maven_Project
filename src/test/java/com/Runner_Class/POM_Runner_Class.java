package com.Runner_Class;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.pom.BookAHotel_Page_Adactin;
import com.pom.Login_Page_Adactin;
import com.pom.SearchHotelPage_Adactin;
import com.pom.SelectHotelPage_Adactin;

public class POM_Runner_Class extends  Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowserLaunch("chrome");
	
	public static Login_Page_Adactin lp = new Login_Page_Adactin (driver);
	
	public static SearchHotelPage_Adactin seh = new SearchHotelPage_Adactin (driver);
	
	public static SelectHotelPage_Adactin slh = new SelectHotelPage_Adactin (driver);
	
	public static BookAHotel_Page_Adactin  bah = new BookAHotel_Page_Adactin  (driver);
	
	public static void main(String[] args) {

		getUrl("http://adactinhotelapp.com/");
		
		inputValueElement(lp.getUserName(),"8754139120");
		
		inputValueElement(lp.getPassword(),"poda1@Lusu");
		
		clickOnElement(lp.getLogin());
		
		getDropDown(seh.getLocation(), "byIndex", "5");
		
		getDropDown(seh.getHotels(), "byIndex", "3");
		
		getDropDown(seh.getRoom_type(), "byIndex", "3");
		
		getDropDown(seh.getRoom_nos(), "byIndex", "3");
		
		inputValueElement(seh.getDatepick_in(),"31.01.2022");
		
		inputValueElement(seh.getDatepick_out(),"01.02.2022");
		
		getDropDown(seh.getAdult_room(), "byIndex", "3");
		
		getDropDown(seh.getChild_room(), "byIndex", "1");
		
		clickOnElement(seh.getSubmit());
		
		clickOnElement(slh.getRadiobutton_0());
		
		clickOnElement(slh.getContinu());
		
		inputValueElement(bah.getFirst_name(),"Dee");
		
		inputValueElement(bah.getLast_name(),"s");
		
		inputValueElement(bah.getAddress(),"ABC Building, ABC Street, ABC");
		
		inputValueElement(bah.getCc_num(),"1234567890123456");
		
		getDropDown(bah.getCc_type(), "byIndex", "1");
		
		getDropDown(bah.getCc_exp_month(), "byIndex", "1");
		
		getDropDown(bah.getCc_exp_year(), "byIndex", "11");
		
		inputValueElement(bah.getCc_cvv(),"1234");
		
		clickOnElement(bah.getBook_now());
		
	}
}
