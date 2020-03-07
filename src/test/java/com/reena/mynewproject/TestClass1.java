package com.reena.mynewproject;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass1 {
	

	public static WebDriver driver;
	
	@BeforeMethod
		public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
			}
@Test
public void Test1() {
	
	driver.get("https://automationtalks.com/");
	String title = driver.getTitle();
	System.out.println("Test 1 Title is :"+driver.getTitle());
	Assert.assertEquals("AutomationTalks - Learn Automation Testing",title);
}
@Test
public void Test2() {
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	Assert.assertEquals("Google",title);
}
@Test
public void Test3() {
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();	
	Assert.assertEquals(true, title.contains("Facebook"));
}

@AfterMethod
public void quit() {
	driver.quit();
}
}















