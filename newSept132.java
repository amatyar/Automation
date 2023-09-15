package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newSept132 {

	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver(); 
			driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			driver.manage().window().maximize();
	       
	        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

	        // Iterate through the checkboxes and select each one
	        for (WebElement checkbox : checkboxes) {
	            if (!checkbox.isSelected()) {
	                checkbox.click();
	            }
	            System.out.println("Checked"+ checkbox.isSelected());
	        }

	        for (WebElement checkbox : checkboxes) {
	            if (checkbox.isSelected()) {
	                checkbox.click();
	            }
	            System.out.println("Checked "+ checkbox.isSelected());
	        }
	        // Close the WebDriver
	        driver.quit();    	

	}

}
