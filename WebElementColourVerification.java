package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementColourVerification {
	public static void main(String[] args) {
		//Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Load url http://leafground.com/pages/Button.html
		driver.get("http://leafground.com/pages/Button.html");
		//Get the color of the WebElement
		System.out.println(driver.findElement(By.id("color")).getText());
		System.out.println(driver.findElement(By.id("color")).getSize());
		String webElementColor = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("WebElement color is "+ webElementColor);
        //Close the browser
		driver.close();
	}

}
