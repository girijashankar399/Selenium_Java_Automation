package javaPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Program1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://amazon.in");
		
		
	}
	
	
	@Test
	public void verifyTitle() {
		
		String actual_title = driver.getTitle();
		String expected_Title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actual_title,expected_Title);
		
	}
	
	
	@Test
	public void Verify_Logo() {
		
	boolean flag = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
	Assert.assertTrue(flag);
	
	
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
		
	}
	
	

}
