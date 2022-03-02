package com.poManager_sdp;

import org.openqa.selenium.WebDriver;

import com.pom.BookAHotel_Page_Adactin;
import com.pom.Login_Page_Adactin;
import com.pom.SearchHotelPage_Adactin;
import com.pom.SelectHotelPage_Adactin;

public class PO_Manager {
	
	public WebDriver PO_ManagerDriver;
	
	private Login_Page_Adactin lp;
	
	private SearchHotelPage_Adactin shp;
	
	private SelectHotelPage_Adactin slp;
	
	private BookAHotel_Page_Adactin bah;
	
	private LogOut_Page_Adactin lo;
	
	public PO_Manager(WebDriver driver) {
		this.PO_ManagerDriver = driver;
	}

	public Login_Page_Adactin getInstanceLp() {
		
		lp=new Login_Page_Adactin(PO_ManagerDriver);
		return lp;
		
	}
	
	public SearchHotelPage_Adactin getInstanceShp() {
		
		shp=new SearchHotelPage_Adactin(PO_ManagerDriver);
		return shp;
	}
	
	public SelectHotelPage_Adactin getInstanceSlp() {
		
		slp=new SelectHotelPage_Adactin(PO_ManagerDriver);
		return slp;
	}
	
	public BookAHotel_Page_Adactin getInstanceBah() {
		
		bah=new BookAHotel_Page_Adactin(PO_ManagerDriver);
		return bah;
	}
	
	public LogOut_Page_Adactin getInstanceLo() {
		
		lo=new LogOut_Page_Adactin(PO_ManagerDriver);
		return lo;
	}
	
}
