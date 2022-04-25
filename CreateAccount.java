package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	public static void main(String[] args) {
		//Open a chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Load the URL: http://leaftaps.com/opentaps/control/main
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Enter UserName and Password Using Id Locator
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//Click on Login Button using Class Locator
				 driver.findElement(By.className("decorativeSubmit")).click(); 
				 //Click on CRM/SFA Link
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 //Click on Accounts Button
				 driver.findElement(By.linkText("Accounts")).click();
				 //Click on Create Account
				 driver.findElement(By.linkText("Create Account")).click();
				 //Enter AccountName Field Using Xpath Locator value as Debit Limited Account
				 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
				 //Enter DEscriptiion as "Selenium Automation Tester"
				 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
				 //Enter LocalName Field Using Xpath Locator
				 driver.findElement(By.id("groupNameLocal")).sendKeys("Test");
				 //Enter SiteName Field Using Xpath Locator
				 driver.findElement(By.id("officeSiteName")).sendKeys("Testleaf");
				 //Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
				 driver.findElement(By.xpath("//td[@id='ext-gen649']/input")).sendKeys("200000");
				 //Click on Create Account using Xpath Locator
				 driver.findElement(By.xpath("//input[@value='Create Account']")).click();
				 //Close the browser
				 driver.close();
				 
				 
				 
				 
	}

}
