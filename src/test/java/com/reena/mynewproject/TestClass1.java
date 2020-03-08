package com.reena.mynewproject;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.phantomjs().setup();
	}
	
	@BeforeMethod
	public void launchDriver() {
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		driver = new PhantomJSDriver();
	}

	@Test
	public void Test1() {
		String myName = "Reena";
		String myFirstName = "Reena";
		String mylastName = myName + myFirstName + "";
		driver.get("https://automationtalks.com/");
		String title = driver.getTitle();
		System.out.println("Test 1 Title is :" + driver.getTitle());
		Assert.assertEquals("AutomationTalks - Learn Automation Testing", title);
	}

	@Test
	public void Test2() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
	}

    @Test
	public void Test3() {
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		Assert.assertEquals(true, title.contains("Facebook"));
	}
    
    @Test
    public void test() {
        // Your test code here. For example:
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        By searchInput = By.id("searchInput");
        wait.until(presenceOfElementLocated(searchInput));
        driver.findElement(searchInput).sendKeys("Software");
        By searchButton = By.id("searchButton");
        wait.until(elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();

        wait.until(textToBePresentInElementLocated(By.tagName("body"),
                "Computer software"));
    }
	
	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
