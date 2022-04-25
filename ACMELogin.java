package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {
	public static void main(String[] args) {
		//Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		//Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		// Click login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//Get the title of the page and print
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		// Click on Log Out
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		//Close the browser (use -driver.close())
		driver.close();
	
		
	}

}
