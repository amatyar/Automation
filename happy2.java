package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class happy2 {

	public static void main(String[] args) 
	{
		 String[] username={"locked_out_user", "standard_user","problem_user","performance_glitch_user"};		 			
		
         String[] password= {"secret_sauce", "secret_sauce","secret_sauce","secret_sauce"};      
	        
         
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
         WebDriver d = new ChromeDriver();
         d.get("http://www.saucedemo.com/");
        
         for(int i = 0; i < username.length ; i++)
         {
        	 d.findElement(By.cssSelector("#user-name")).clear();
            d.findElement(By.cssSelector("#user-name")).sendKeys(username[i]);
            System.out.println(username[i]);
            d.findElement(By.cssSelector("#password")).clear();
            d.findElement(By.cssSelector("#password")).sendKeys(password[i]);
            System.out.println(username[i]);

            d.findElement(By.cssSelector("#login-button")).click();
          }
	}
     
     
}
