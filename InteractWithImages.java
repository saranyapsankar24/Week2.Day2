package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithImages {
	public static void main(String[] args) {
		//Open a chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Load url http://leafground.com/pages/Button.html
				driver.get("http://leafground.com/pages/Image.html");
				//Click on the image displayed
				driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
				//Close the browser
				driver.close();
	}
	

}
