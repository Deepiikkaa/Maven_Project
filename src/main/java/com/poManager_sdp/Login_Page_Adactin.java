package com.poManager_sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Adactin {
	
	public static WebDriver loginPageDriver;
	
	@FindBy(id="username")
	private WebElement userName;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;

	public Login_Page_Adactin(WebDriver runnerClassDriver) {
		this.loginPageDriver=runnerClassDriver;
		PageFactory.initElements(loginPageDriver, this);
		
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
