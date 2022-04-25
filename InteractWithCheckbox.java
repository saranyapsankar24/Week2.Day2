package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithCheckbox {
	public static void main(String[] args) {
		//Open a chrome browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Load url http://leafground.com/pages/Button.html
				driver.get("http://leafground.com/pages/checkbox.html");
				//Verify the checkbox is checked
				boolean selected = driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).isSelected();
				System.out.println("The checkbox is selected " +selected);
				boolean selected2 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
				System.out.println("The checkbox is not selected " + selected2);
				//Close the browser
				driver.close();
				
	}

}
