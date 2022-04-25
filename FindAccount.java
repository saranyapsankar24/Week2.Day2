package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
	public static void main(String[] args) {
		//Open a chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Load the URL: http://leaftaps.com/opentaps/control/main
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Enter Username as Demosalesmanager
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Enter Password as crmsfa
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//Click on  Login Button
				driver.findElement(By.className("decorativeSubmit")).click(); 
				//Click on CRM/SFA link 
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Click on Accounts Button
				driver.findElement(By.linkText("Accounts")).click();
             	//Click on Find Accounts
				driver.findElement(By.linkText("Find Accounts")).click();
				//Enter AccountName as "Credit Limited Account"
				driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
				//Click on Find Accounts using xpath Locator
				driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
				//Click on the Account Name
				driver.findElement(By.xpath("//a[contains(text(),'Credit Limited Account')]")).click();
				//Click on the Account Name
				String accountName = driver.findElement(By.xpath("//span[contains(text(),'Credit Limited Account  (accountlimit100)')]")).getText();
				 if(accountName.equalsIgnoreCase("Credit Limited Account (accountlimit100)"))
				 { System.out.println("Account Name matches"); } else {
				 System.out.println("Account Name does not match"); } 
				//Get the title of the page and verify it.
				String title = driver.getTitle();
				System.out.println("Title is " + title);
				driver.close();
	}

}
