package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
         WebDriver driver = new ChromeDriver();
         driver.get("http://www.saucedemo.com/");
         
		WebElement username = 	driver.findElement(By.id("user-name"));
        WebElement password = 	driver.findElement(By.id("password"));
        WebElement login = 		driver.findElement(By.id("login-button"));        
        // Enter invalid user name and valid password        
        username.sendKeys("locked_out_user");
        password.sendKeys("secret_sauce");
        login.click();        
        // Check for error message        
        WebElement errorMessage = driver.findElement(By.cssSelector("[data-test='error']"));        
        if (errorMessage.isDisplayed()) {
            System.out.println("Test case Passed - Error message displayed Epic sadface: Sorry, this user has been locked out");
        } else {
            System.out.println("Test case Failed - Error message not displayed");
        }

	}

}
