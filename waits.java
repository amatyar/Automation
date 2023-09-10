package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;


public class waits {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Timeouts pageLoadTimeout = driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); // pageload timeout
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    // Implicit Wait for 20 seconds
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("amatyar@yahoo.com"); //Finding element and sending values
		
		// Wait For Page To Load
		Timeouts implicitlyWait2 = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Abcd");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();//Clicking on the next button if element is located
		}
	

}
