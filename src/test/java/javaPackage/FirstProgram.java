package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\Browser\\chromedriver.exe");
		//using chrome driver launching 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		System.out.println("Program started...");

	        try {
	            // Sleep for 5 seconds (5000 milliseconds)
	            Thread.sleep(10000);  // Pauses the program for 5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	    System.out.println("Program finished after sleep.");
       driver.quit();

	}

}
