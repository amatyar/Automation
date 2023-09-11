package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chaplen5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();	
		dr.manage().window().maximize();
		dr.get("http://gcreddy.com/project/admin/login.php");
		dr.findElement(By.linkText("Online Catalog")).click();
		String url1 = dr.getCurrentUrl();
		if (url1.equals("http://gcreddy.com/project/")) {
			System.out.println("Before Login - page is redirect from admin ot user interface - passed");
			
		}
		else
		{
			System.out.println("Before Login - page is not redirect from admin ot user interface - Failed");
		}
		dr.navigate().back();
		dr.findElement(By.name("username")).sendKeys("gcreddy");
		dr.findElement(By.name("password")).sendKeys("Temp@2020");
		dr.findElement(By.id("tdb1")).click();
		
		String url2 = dr.getCurrentUrl();
		if(url2.equals("http://gcreddy.com/project/admin/index.php")) {
			dr.findElement(By.linkText("Online Catalog")).click();
		}
		String url3=dr.getCurrentUrl();
		if(url3.equals("http://gcreddy.com/project/")) {
			System.out.println("After Login - page is redirecting from admin to user interface - passed");
		}
		else
		{
			System.out.println("After Login - page is not redirecting from admin to user interface - Failed");
		}
		dr.close();
	}

}
