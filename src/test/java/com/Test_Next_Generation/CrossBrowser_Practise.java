package com.Test_Next_Generation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser_Practise {
	
	public WebDriver driver;
	
	@Test
	public void chromeBrowser() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
				"\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
//		driver.close();
		
	}
	
	@Test
	public void firefoxBrowser() throws Exception {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+
				"\\Chrome_Driver\\chromedriver_win32\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
//		driver.close();
	}

}
