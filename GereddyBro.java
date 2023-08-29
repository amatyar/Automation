package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GereddyBro {

	public static void main(String[] args) {		
		//setProperty() method to define the path for the driver before writing test cases,this method takes parameters key and value 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		//Initializing the browser driver
		WebDriver dr = new ChromeDriver();
		// window maximize
		dr.manage().window().maximize();
		//get() method is used to open an URL and it will wait till the whole page gets loaded
		dr.get("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_Webdriver");
		
		dr.findElement(By.linkText("Create account")).click();
		String url1 = dr.getCurrentUrl();
		if(url1.contains("wikipedia.org")) {
			System.out.println("1st verification: "+"it is an internal Link -Passed");
		}
		else
		{
			System.out.println("1st Verification: " + "It is not an Internal Link-Fail");
		}
		//navigate() method 
		dr.navigate().back();
		dr.findElement(By.partialLinkText("selenium.dev")).click();
		String url2 = dr.getCurrentUrl();
		if(url2.contains("selenium.dev")) {
			System.out.println("2nd Verification: "+"It is an external link -Passed");			
		}
		else
		{
			System.out.println("2nd Verification: "+"It is an external link - Fail");
		}
		dr.close();
	}

}
