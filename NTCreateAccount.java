package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
	public static void main(String[] args) {
		//Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL: http://leaftaps.com/opentaps/control/login
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Enter Username as Demosalesmanager
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Enter Password as crmsfa
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click(); 
				//Click on CRM/SFA link 
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click on Accounts Button
				driver.findElement(By.linkText("Accounts")).click();
				//Click on Create Account
				driver.findElement(By.linkText("Create Account")).click();
				//Select preferred currency as Indian Rupee using sendkeys
				driver.findElement(By.id("currencyUomId")).sendKeys("INR - Indian Rupee");
				//Enter the Description text as "NRI Account"
				driver.findElement(By.name("description")).sendKeys("NRI Account");
				//Enter LocalName Field Using Xpath Locator
				driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Test");
				//Enter SiteName Field Using Xpath Locator
				driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
				//Enter value for AnnualRevenue Field using Xpath Locator
				driver.findElement(By.id("annualRevenue")).sendKeys("1000000");
				//Click on Create Account using Xpath Locator
				driver.findElement(By.className("smallSubmit")).click();
				//Get the Text of Error Message Displayed (hint: Red Texts)
				String errorMessage = driver.findElement(By.xpath("//ul[@class='errorList']/li[@class='errorMessage']")).getText();
				System.out.println("Error Messgae is :  "  + errorMessage );
				//Close the browser
				driver.close();
				
				
				  
				
	}

}
