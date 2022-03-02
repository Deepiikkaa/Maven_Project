package com.poManager_sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Page_Adactin {
	
public WebDriver logOutPageDriver;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	private WebElement logOut;

	public LogOut_Page_Adactin(WebDriver runnerClassDriver) {
		
		this.logOutPageDriver = runnerClassDriver;
		PageFactory.initElements(logOutPageDriver, this);
	
	}

	public WebElement getLogOut() {
		return logOut;
	}

}
