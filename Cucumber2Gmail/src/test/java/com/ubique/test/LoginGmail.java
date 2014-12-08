package com.ubique.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginGmail {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\BiswajitData\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	@Test
	public void loginGoogleMail(){
		
		//Clicking on the Gmail Link 
		driver.findElement(By.id("gb_70")).click();
		
		//Asserting we are on the right page
		Assert.assertTrue(driver.getPageSource().contains("Sign in - Google Accounts"));
		System.out.println("We are on the Login Page");
		
		//Entering the UserName
		driver.findElement(By.id("Email")).sendKeys("ABCD");
		
		//Enteirn the password
		driver.findElement(By.id("Passwd")).sendKeys("abcd");
		
		//Hitting the SignIn Button
		driver.findElement(By.id("signIn")).click();
	}

}
