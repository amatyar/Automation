package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class third {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://accounts.google.com/signin";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email_phone.sendKeys("rabindra.amatya@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//WebDriverWait wait1 = new WebDriverWait(driver, 20);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("Rohanamatya07");
		driver.findElement(By.id("passwordNext")).click();

	}

}
