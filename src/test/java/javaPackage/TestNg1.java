package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg1 {
	WebDriver driver;

	@Test
	public void Test1(){
		
	}
	
	@Test
	public void Test2(){
		System.out.println("Hello Test 2");
	}
	
	@BeforeSuite
	public void Test3(){
		System.setProperty("Webdriver.chrome.driver","C:\\Browser\\chromedriver.exe");
		//using chrome driver launching 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	
	@AfterMethod
	public void Test4() {
		System.out.println("Hello Test 4");
		driver.quit();

}

}
