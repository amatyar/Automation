package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSept132b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		List<WebElement> rb= driver.findElements(By.cssSelector("input[name='color']"));
		
		for(WebElement rb1:rb) {
			

	        rb1.click();
	        System.out.println("radio"+ rb1.isSelected());
		}

	        // Close the WebDriver
	        driver.quit();
	    
	}

}
