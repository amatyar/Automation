package Automation;
import java.util.List;

//Ctrl + Shift + o
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		//Action --Selecting the Elements
		dr.get("http://www.saucedemo.com/");
		WebElement username = dr.findElement(By.cssSelector("#user-name"));
		WebElement password = dr.findElement(By.cssSelector("#password"));
		WebElement login = dr.findElement(By.cssSelector("#login-button"));
		
		//Dash board elements
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		//Assertion
	
		WebElement heading = dr.findElement(By.cssSelector("#header_container > div.header_secondary_container > span "));
		
		if(heading.isDisplayed()) {
			System.out.println("Test case passed.");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		// Closing 
		//dr.close();
		List<WebElement> eleList = dr.findElements(By.className("input_error"));
	//  // [ele,ele,ele,ele,ele]
	 eleList.get(1).sendKeys("secret_sauce");
	}

}
