package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
			      //implicit wait
			      //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			      //URL launch
			      driver.get("https://accounts.google.com/signin");
			      //identify email
			      WebElement l = driver.findElement(By.name("identifier"));
			      l.sendKeys("rabindra.amatya@gmail.com");
			      WebElement b = driver.findElement(By.className("VfPpkd-LgbsSe"));
			      b.click();
			      //identify password
			      WebElement p = driver.findElement(By.name("password"));
			      p.sendKeys("Rohanamatya07");
			      b.click();
			      //close browser
			      driver.close();

	}

}
