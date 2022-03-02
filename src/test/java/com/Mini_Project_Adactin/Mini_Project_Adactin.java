package com.Mini_Project_Adactin;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class Mini_Project_Adactin {
		
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GODS\\eclipse-workspace\\MAVEN\\Maven_Project\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			
			driver.get("http://adactinhotelapp.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
//			WebElement register = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
//			register.click();
//			
//			WebElement username = driver.findElement(By.id("username"));
//			username.sendKeys("abcdefire@gmail.com");
//			
//			WebElement password = driver.findElement(By.id("password"));
//			password.sendKeys("123@Abc");
//			
//			WebElement password1 = driver.findElement(By.id("re_password"));
//			password1.sendKeys("123@Abc");
//			
//			WebElement name = driver.findElement(By.name("full_name"));
//			name.sendKeys("Deeps");
//			
//			WebElement email = driver.findElement(By.id("email_add"));
//			email.sendKeys("abcdefire@gmail.com");
//			
//			WebElement checkbox = driver.findElement(By.id("tnc_box"));
//			checkbox.click();
//			
//			WebElement register1 = driver.findElement(By.id("Submit"));
//			register1.click();
			
			WebElement login = driver.findElement(By.id("username"));
			login.sendKeys("8754139120");
			
			WebElement password2 = driver.findElement(By.id("password"));
			password2.sendKeys("poda1@Lusu");
			
			WebElement logbut = driver.findElement(By.name("login"));
			logbut.click();
			
			WebElement location = driver.findElement(By.id("location"));
			Select s1 = new Select(location);
			s1.selectByIndex(5);
			
			WebElement hotelName = driver.findElement(By.id("hotels"));
			Select s2 = new Select(hotelName);
			s2.selectByIndex(3);
			
			WebElement roomType = driver.findElement(By.id("room_type"));
			Select s3 = new Select(roomType);
			s3.selectByIndex(3);
			
			WebElement roomNo = driver.findElement(By.id("room_nos"));
			Select s4 = new Select(roomNo);
			s4.selectByIndex(3);
			
			WebElement dateIn = driver.findElement(By.id("datepick_in"));
			dateIn.sendKeys("31.01.2022");
			
			WebElement dateOut = driver.findElement(By.id("datepick_out"));
			dateOut.sendKeys("01.02.2022");
			
			WebElement adultNo = driver.findElement(By.id("adult_room"));
			Select s5 = new Select(adultNo);
			s5.selectByIndex(3);
			
			WebElement childNo = driver.findElement(By.id("child_room"));
			Select s6 = new Select(childNo);
			s6.selectByIndex(1);
			
			WebElement search = driver.findElement(By.id("Submit"));
			search.click();
			
			WebElement radbut = driver.findElement(By.id("radiobutton_0"));
			radbut.click();
			
			WebElement continu = driver.findElement(By.id("continue"));
			continu.click();
			
			WebElement firstname = driver.findElement(By.id("first_name"));
			firstname.sendKeys("Dee");
			
			WebElement lastname = driver.findElement(By.id("last_name"));
			lastname.sendKeys("s");
			
			WebElement address = driver.findElement(By.id("address"));
			address.sendKeys("ABC Building, ABC Street, ABC");
			
			WebElement cardnum = driver.findElement(By.id("cc_num"));
			cardnum.sendKeys("1234567890123456");
			
			WebElement cardType = driver.findElement(By.id("cc_type"));
			Select s7 = new Select(cardType);
			s7.selectByIndex(1);
			
			WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
			Select s8 = new Select(expmonth);
			s8.selectByIndex(1);
			
			WebElement expyear = driver.findElement(By.id("cc_exp_year"));
			Select s9 = new Select(expyear);
			s9.selectByIndex(11);
			
			WebElement ccv = driver.findElement(By.id("cc_cvv"));
			ccv.sendKeys("1234");
			
			WebElement booknow = driver.findElement(By.id("book_now"));
			booknow.click();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File ("C:\\Users\\GODS\\eclipse-workspace\\MAVEN\\Maven_Project\\Screenshot\\Mini_Project_Adactin.png");
			FileUtils.copyFile(source, destination);
			
			
	}
}
