package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartLogin_DD {
public static void main(String[] args) {
	//Open a chrome browser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//Load url http://leafground.com/pages/Button.html
			driver.get("https://www.opencart.com/index.php?route=account/register");
			//Enter the first name and last name
			driver.findElement(By.id("input-firstname")).sendKeys("Saranya P");
			driver.findElement(By.id("input-lastname")).sendKeys("Sankar");
			//Select a value from country dropdown
			driver.findElement(By.id("input-country")).sendKeys("Iceland");
			//Close the browse
			driver.close();
					
			
}
}
