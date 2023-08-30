package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class functions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();		

	
		dr.get("http://www.saucedemo.com/");
		
		
		if (
			dr.findElement(By.cssSelector("#login-button")).isDisplayed()) 
		{
		    dr.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		    dr.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		    dr.findElement(By.cssSelector("#login_button")).click();
		} 
		else 
		{
		    System.out.println("Login button is not displayed.");
		}
	}
}