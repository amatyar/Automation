package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://www.webdriveruniversity.com");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector("#contact-us > div > div.section-title > h1")).click();
		Set<String> windows =	driver.getWindowHandles();
		for(String window:windows) {
			System.out.println(window);
			
			if(!window.equals(parent)) {
				driver.switchTo().window(window);
				break;
			}
		}
		
		System.out.println(driver.getCurrentUrl());
		
		  driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("Rabindra"); 
		  driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("Amatya"); 
		  driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys("rabindra.amatya@gmail.com");
		  driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys("we are learning selenium.");
		  driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		  
		  driver.switchTo().window(parent);
		  System.out.println(driver.getCurrentUrl());
				   

	}

}
