package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chaplen3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		//Initializing the browser driver
		WebDriver dr = new ChromeDriver();
		// window maximize
		dr.manage().window().maximize();
		String url ="http://gcreddy.com/project/create_account.php";
		dr.get(url);
		 
		dr.findElement(By.name("gender")).click();
		dr.findElement(By.name("firstname")).sendKeys("acd123");
		dr.findElement(By.name("lastname")).sendKeys("23xz");
		dr.findElement(By.id("dob")).sendKeys("10/01/2022");
		String email="sriniram"+"@gmail.com";
		System.out.println(email);
		dr.findElement(By.name("email_address")).sendKeys(email);
		dr.findElement(By.name("street_address")).sendKeys("abcd2xyz");
		dr.findElement(By.name("postcode")).sendKeys("02184-3215");
		dr.findElement(By.name("city")).sendKeys("Boston");
		dr.findElement(By.name("state")).sendKeys("Massachusetts");
		Select dropDown = new Select(dr.findElement(By.name("country")));
		dropDown.selectByVisibleText("United States");
		dr.findElement(By.name("telephone")).sendKeys("6174568975");
		dr.findElement(By.name("password")).sendKeys("abcd321");
		dr.findElement(By.name("confirmation")).sendKeys("abcd321");
		dr.findElement(By.id("tdb4")).click();
		dr.findElement(By.name("password")).sendKeys("abcd321");
		dr.findElement(By.name("confirmation")).sendKeys("abcd321");
		dr.findElement(By.id("tdb4")).click();
		String confirmationMessage =dr.findElement(By.tagName("h1")).getText();
		if(confirmationMessage.equals("Your Account Has Been Created!")) {
			System.out.println(" Test case Passes");
		}
		else
		{
			System.out.println(" Test case Failed");
		}
		dr.close();
	}

}
