package Selenium.webdriver.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nitex_task01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","//Users//shofiqurrahman//eclipse//geckodriver"); //defining the fire fox driver locator at device
		WebDriver driver = new FirefoxDriver(); // Invoke the browser; Interface
		
		driver.get("Enter Website URL here"); // This line will re-direct to Web site landing page
		driver.findElement(By.xpath("Enter Username field locator here")).sendKeys("E-mail or Username data here"); //find User name field and Enter Data
		driver.findElement(By.xpath("Enter Password field locator here")).sendKeys("Enter passowrd data here"); //find password field and Enter Data
		driver.findElement(By.xpath("Enter Login Button locator here")).click(); //find login button and click the button
		
		//verifying the login is successful
		
		String expectedtitle = "Enter expected page title of the after login page here"; //Declaring Expected title of the dash board page
		String actualtitle = driver.getTitle(); //returns Actual title of the page and store the value inside the variable
		
		if(expectedtitle==actualtitle) { //validating that the login is successful and after login page title is returning correct value
			
			System.out.println("Title match and Test Passed");
		}
		else {
			
			System.out.println("Title didn't match, Test Failed");
		}
		
		driver.close(); //close the browser		
	}

}
