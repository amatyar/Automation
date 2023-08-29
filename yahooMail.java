package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooMail {

	public static void main(String[] args) {
		//Now you need to specify the system property
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// Navigate to URL
				driver.get("https://login.yahoo.com/");
				// Maximize the window.
				driver.manage().window().maximize();
				// Enter UserName
				driver.findElement(By.id("login-username")).sendKeys("amatyar@yahoo.com");
				// Click on ‘Next’ button
				driver.findElement(By.id("login-signin")).click();
				// Enter Password
				driver.findElement(By.id("login-passwd")).sendKeys("March2006");
				// Wait For Page To Load
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// Click on ‘Sign In’ button
				driver.findElement(By.id("login-signin")).click();
				// Click on ‘Mail’ Link
				driver.findElement(By.linkText("Mail")).click();
				
				//Close the browser.
				driver.close();
	}

}
