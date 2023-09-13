package Automation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Sept12c {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.cssSelector(".bm-burger-button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)) // total time
				.pollingEvery(Duration.ofSeconds(2)) // polling time
				.ignoring(NoSuchElementException.class); // exemption

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#logout_sidebar_link"))));
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();

//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.cssSelector("#logout_sidebar_link"));
//			}
//		});


	}

}
