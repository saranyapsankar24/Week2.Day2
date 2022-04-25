package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVerification {
	public static void main(String[] args) {
		//Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load url http://leafground.com/pages/Edit.html
		driver.get("http://leafground.com/pages/Edit.html");
		//Get default text entered
		String attributeValue = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("The attribute value is " +attributeValue);
		//Verify the text filed is enabled
		boolean enabled = driver.findElement(By.xpath("//input[@value='TestLeaf']")).isEnabled();
		System.out.println(enabled);
		boolean notEnabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(notEnabled);
		//Close the browser
		driver.close();

	}
}
