package Automation;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chaplen2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		//Initializing the browser driver
		WebDriver dr = new ChromeDriver();
		// window maximize
		dr.manage().window().maximize();
		String url ="http://gcreddy.com/project/admin/login.php";
		dr.get(url);
		dr.findElement(By.name("username")).sendKeys("gcreddy");
		dr.findElement(By.name("password")).sendKeys("Temp@2020");
		dr.findElement(By.id("tdb1")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boolean linkExists = dr.findElement(By.linkText("Logoff")).isDisplayed();
			if(linkExists == true) {
				System.out.println("Admin Login is successful - passed");
			}
		}
		catch(NoSuchElementException e1) {
			System.out.println("Admin Login is unsuccesful - Failed");
		}
		dr.close();
	}

}
