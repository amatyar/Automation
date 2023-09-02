package Automation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newone {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
        WebDriver driver = new ChromeDriver();	
		
		Map<String, String> userCredentials = new HashMap<>();
	        userCredentials.put("standard_user", "secret_sauce");
	        userCredentials.put("locked_out_user", "secret_sauce");
	        userCredentials.put("problem_user", "secret_sauce"); 
	        userCredentials.put("performance_glitch_user", "secret_sauce"); 	       
	               
			        driver.get("http://www.saucedemo.com/");   
	        
	                String desiredUsername =  "";
	                String desiredPassword = "";

	              
	                WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
	                WebElement passwordField = driver.findElement(By.cssSelector("#password"));

	                
	                usernameField.sendKeys("standard_user");
	                passwordField.sendKeys("secret_sauce");

	              
	                WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
	                loginButton.click();

	              
	                if (userCredentials.containsKey(desiredUsername)) 
	                {
	                    String actualPassword = userCredentials.get(desiredUsername);
	                    if (actualPassword.equals(desiredPassword)) 
	                    {
	                        System.out.println("Login successful!");
	                    } 
	                    else 
	                    {
	                        System.out.println("Invalid password.");
	                    }
	                } 
	                else 
	                {
	                    System.out.println("Invalid username.");
	                }

	                
	                driver.quit();
	            }
	        

	

}
