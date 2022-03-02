package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage_Adactin {
	
public static WebDriver selectHotelPageDriver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement continu;
	
	public SelectHotelPage_Adactin(WebDriver  runnerClassDriver) {
		this.selectHotelPageDriver = runnerClassDriver;
		PageFactory.initElements(selectHotelPageDriver, this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinu() {
		return continu;
	}
}
