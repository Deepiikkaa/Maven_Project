package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	
//BrowserLaunch
	public static WebDriver getBrowserLaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
						"\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+
					"\\Chrome_Driver\\chromedriver_win32\\geckodriver.exe");
			
			driver = new FirefoxDriver();

		}else if(browser.equalsIgnoreCase("internet explorer")){
			
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+
					"\\Chrome_Driver\\chromedriver_win32\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();

		}
		
		driver.manage().window().maximize();
		
		return driver;

	}
	
//Close
	public static void getClose() {
		driver.close();
	}
	
//Quit
	public static void getQuit() {
		driver.quit();	
	}
	
//Navigate to
	public static void getNavigateTo(String navigate_url) {
		driver.navigate().to(navigate_url);
	}
	
//Navigate Back
	public static void getNavigateBack() {
		driver.navigate().back();
	}
	
//Navigate Forward
	public static void getNavigateForward() {
		driver.navigate().forward();
	}
		
//Navigate Refresh
	public static void getNavigateRefresh() {
		driver.navigate().refresh();
	}		
		
//Get 
	public static void getUrl(String url) {
		driver.get(url);
	}
	
//Alert 
	public static void getAlert(String optionOfAlert, String value) {
		
		Alert al = driver.switchTo().alert();
		
		if (optionOfAlert.equalsIgnoreCase("accept")) {
			al.accept();
		}
		
		else if (optionOfAlert.equalsIgnoreCase("dismiss")) {
			al.dismiss();
		}	
		
		else if (optionOfAlert.equalsIgnoreCase("senkeys")) {
			al.sendKeys(value);
		}
	}
	
//Action
	public static void getAction(String mouseBasedAction, WebElement element, WebElement source, WebElement target) {
		
		Actions at = new Actions(driver);
		
		if (mouseBasedAction.equalsIgnoreCase("click")) {
			at.click(element).build().perform();
		}
		
		else if (mouseBasedAction.equalsIgnoreCase("contextClick")) {
			at.contextClick(element).build().perform();
		}
		
		else if (mouseBasedAction.equalsIgnoreCase("doubleClick")) {
			at.doubleClick(element).build().perform();
		}
		
		else if (mouseBasedAction.equalsIgnoreCase("moveToElement")) {
			at.moveToElement(element).build().perform();
		}
		
		else if (mouseBasedAction.equalsIgnoreCase("dragAndDrop")) {
			at.dragAndDrop(source, target).build().perform();
		}
		
		else if (mouseBasedAction.equalsIgnoreCase("clickAndHold")) {
			at.clickAndHold().build().perform();
		}
		
		else if (mouseBasedAction.equalsIgnoreCase("sendKeys")) {
			at.sendKeys().build().perform();
		}
	}
	
//Frames
//	public static void getFrames() {
//		driver.switchTo().frame(index)
//		
//	}
	
//Robot
	public static void getRobot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
//WindowHandles
	public static void getWindowHandles() {
		
	}
	
//DropDown
	public static void getDropDown(WebElement element, String type, String value) {
		
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} 
		
		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		} 
		
		else if(type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}
		
//Get Title
	public static void getTitle(String title) {
		driver.getTitle();
		System.out.println(title);
	}
	
//Get CurrentUrl
	public static void getCurrentUrl(String currentUrl) {
		driver.getCurrentUrl();	
		System.out.println(currentUrl);
	}
	
//Wait
	public static void getWait(String typeOfWait, int seconds, WebElement element) {
		if (typeOfWait.equalsIgnoreCase("implicitlyWait")) {
			driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
		}
		
		else if (typeOfWait.equalsIgnoreCase("explicitlyWait")) {
			WebDriverWait wait = new WebDriverWait(driver, seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		else {
			Wait<WebDriver> wait = new FluentWait <WebDriver>(driver).withTimeout(seconds,TimeUnit.SECONDS);
//					.pollingEvery(seconds,TimeUnit.SECONDS).ignoring(Exception.class);
		}
	}
	
	
//Screenshot
	public static void getTakesScreenshot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\GODS\\eclipse-workspace\\MAVEN\\Maven_Project\\Screenshot");
		FileUtils.copyFile(source, destination);
	}
	
//ScrollUp and ScrollDown
	public static void getUpDown(String upOrDown, int startingPoint, int endingPoint) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		if (upOrDown.equalsIgnoreCase("scrollUp")) {
			js.executeScript("window.scrollBy(startingPoint,endingPoint)");
		}
		
		else if (upOrDown.equalsIgnoreCase("scrollDown")) {
			js.executeScript("window.scrollDown(startingPoint,endingPoint)");		
		}
	}
	
//Sendkeys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
		
//Click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

}
