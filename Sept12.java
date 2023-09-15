package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("http://www.webdriveruniversity.com/"); 
		  driver.manage().window().maximize();
		  String parentWindow = driver.getWindowHandle(); 
		  System.out.println(parentWindow); 
		  driver.findElement(By.cssSelector("#contact-us")).click(); 
		   
		  Set <String> windows = driver.getWindowHandles(); 
		  for(String window:windows) { 
		   if(! window.equals(parentWindow)) { 
		    driver.switchTo().window(window); 
		    break; 
		   } 
		  } 
		   
		  System.out.println(driver.getCurrentUrl()); 
		  WebElement first_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")); 
		  WebElement last_name = driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")); 
		  WebElement email_address = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")); 
		  WebElement message = driver.findElement(By.cssSelector("#contact_form > textarea")); 
		  WebElement submit_button =driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")); 
		   
		  first_name.sendKeys("Rabindra "); 
		  last_name.sendKeys("Amatya"); 
		  email_address.sendKeys("Rabindra.amatya@gmail.com"); 
		  message.sendKeys("Java then selenium , is not it?"); 
		  submit_button.click();   
		  
		  driver.switchTo().window(parentWindow);
		  System.out.println(driver.getCurrentUrl());
				   

	}

}
