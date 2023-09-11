package Automation;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaplen4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();	
		dr.manage().window().maximize();
		dr.get("http://gcreddy.com/project/login.php");
		dr.findElement(By.name("email_address")).sendKeys("sriniram123@gmail.com");
		dr.findElement(By.name("password")).sendKeys("abcd321");
		dr.findElement(By.id("tdb1")).click();
		try {
			boolean ele = dr.findElement(By.linkText("Log Off")).isDisplayed();
			if(ele == true) {
				System.out.println("Customer Login is Successful - passed");
			}
		}
		catch(NoSuchElementException e1) {
		System.out.println("Customer Login is Unsuccessful - failed");
		}
		dr.close();
	}

}
