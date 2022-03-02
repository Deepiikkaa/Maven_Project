package com.Runner_Class;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.poManager_sdp.PO_Manager;

public class po_Manager_Runner_Class extends  Base_Class {
	
//	public static WebDriver driver = Base_Class.getBrowserLaunch("chrome");
	
	public static PO_Manager pom = new PO_Manager (driver);
	
	public static void main(String[] args) {
	
		getUrl("http://adactinhotelapp.com/");
		
		inputValueElement(pom.getInstanceLp().getUserName(),"8754139120");
		
		inputValueElement(pom.getInstanceLp().getPassword(),"poda1@Lusu");
		
		clickOnElement(pom.getInstanceLp().getLogin());
		
		getDropDown(pom.getInstanceShp().getLocation(), "byIndex", "5");
		
		getDropDown(pom.getInstanceShp().getHotels(), "byIndex", "3");
		
		getDropDown(pom.getInstanceShp().getRoom_type(), "byIndex", "3");
		
		getDropDown(pom.getInstanceShp().getRoom_nos(), "byIndex", "3");
		
		inputValueElement(pom.getInstanceShp().getDatepick_in(),"31.01.2022");
		
		inputValueElement(pom.getInstanceShp().getDatepick_out(),"01.02.2022");
		
		getDropDown(pom.getInstanceShp().getAdult_room(), "byIndex", "3");
		
		getDropDown(pom.getInstanceShp().getChild_room(), "byIndex", "1");
		
		clickOnElement(pom.getInstanceShp().getSubmit());
		
		clickOnElement(pom.getInstanceSlp().getRadiobutton_0());
		
		clickOnElement(pom.getInstanceSlp().getContinu());
		
		inputValueElement(pom.getInstanceBah().getFirst_name(),"Dee");
		
		inputValueElement(pom.getInstanceBah().getLast_name(),"s");
		
		inputValueElement(pom.getInstanceBah().getAddress(),"ABC Building, ABC Street, ABC");
		
		inputValueElement(pom.getInstanceBah().getCc_num(),"1234567890123456");
		
		getDropDown(pom.getInstanceBah().getCc_type(), "byIndex", "1");
		
		getDropDown(pom.getInstanceBah().getCc_exp_month(), "byIndex", "1");
		
		getDropDown(pom.getInstanceBah().getCc_exp_year(), "byIndex", "11");
		
		inputValueElement(pom.getInstanceBah().getCc_cvv(),"1234");
		
		clickOnElement(pom.getInstanceBah().getBook_now());
		
		clickOnElement(pom.getInstanceLo().getLogOut());
	}

}
