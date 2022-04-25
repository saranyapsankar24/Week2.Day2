package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
		//Click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead Menu
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name, first name, last name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Not Working");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya P");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		//Click on Create Lead button
		driver.findElement(By.name("submitButton")).click();
		//Get the Lead ID text and print
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String LeadId=text.replaceAll("[A-Za-z]", "");
		System.out.println("Lead ID is : " + LeadId);
		String companyName=text.replaceAll("[^A-Za-z]","");
		System.out.println("Company Name is : "+ companyName);
		//Close the browser driver.close(); 
		driver.close();




	}

}
