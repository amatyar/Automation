
package Automation;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chaplen1 
{

	public static void main(String[] args) 
	{
		//setProperty() method to define the path for the driver before writing test cases,this method takes parameters key and value 
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
				//Initializing the browser driver
				WebDriver dr = new ChromeDriver();
				// window maximize
				dr.manage().window().maximize();
				dr.get("https://www.google.com");
				try 
				{
				boolean li = dr.findElement(By.linkText("abcd")).isDisplayed();
				
					if(li == true) 
					{
							System.out.println("Gmail paeesd");
					
					}
				}
				catch(NoSuchElementException e)				
				{
					System.out.println("Gmail is failed");
				}
				dr.close();
	}

}
