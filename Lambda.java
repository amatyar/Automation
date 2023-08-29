package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testing.Assert;

public class Lambda {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		try {
			WebDriver dr = new ChromeDriver();
			String url = "http://accounts.lambdatest.com/login";
			dr.get(url);
			dr.manage().window().maximize();
			
			//WebElement email = dr.findElement(By.id("email"));
			WebElement email = dr.findElement(By.xpath("//input[//*[@id=\"email\"]]"));
			WebElement password = dr.findElement(By.id("password"));
			WebElement Login = dr.findElement(By.id("login-button"));
			
			email.clear();
			email.sendKeys("abc@gmail.com");
			
			password.clear();
			password.sendKeys("abc@123");
			
			Login.click();
			
			String title = "Welcome - LambdaTest";
			String actualTitle = dr.getTitle();			
			//Assert.assertEquals(actualTitle, title, "Page title does not match");
			
			System.out.println("User logged in successfully");
			dr.close();
			dr.quit();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fail to login");
		}
		finally
		{
			System.out.println("Closing connection");
		}

	}

}
