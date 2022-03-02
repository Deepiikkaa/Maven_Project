package com.Runner_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;

public class Runner_Class extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		getBrowserLaunch("chrome");
		
		getClose();
		
		getQuit();
		
		getNavigateTo("https://www.google.com/");
		
		getNavigateBack();
		
		getNavigateForward();
		
		getNavigateRefresh();
		
		getUrl("https://demoqa.com/alerts");
		
		getAlert("accept", null);
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement logIn = driver.findElement(By.id("username"));
		getAction("dragAndDrop", null, userName, logIn);
		
		getRobot();
		
		WebElement userName1 = driver.findElement(By.id("username"));
		getDropDown(userName1, "byValue", "Dee");
		
		getTitle("");
		
		getCurrentUrl("");
		
		getWait("implicitWait", 40, null);
		
		getTakesScreenshot();
		
		getUpDown("scrollUp", 0, 2000);
		
		WebElement userName2 = driver.findElement(By.id("username"));
		inputValueElement(userName2,"Dee");
		
		WebElement logIn2 = driver.findElement(By.id("username"));
		clickOnElement(logIn2);
	}

}
