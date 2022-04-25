package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementLinkVerification {
public static void main(String[] args) {
	//Open a chrome browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Load url http://leafground.com/pages/Link.html
	driver.get("http://leafground.com/pages/Link.html");
	//Get the href value
	String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
	System.out.println("The href value is " + attribute);
	//Close the browser
	driver.close();
	
}
}
