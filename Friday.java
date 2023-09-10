package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Friday {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.saucedemo.com";
		driver.get(url);
		Paths(driver, "standard_user", "secret_sauce");
		// logout web application using implicitly case 1
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.cssSelector(".bm-burger-button")).click();
//		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
//		driver.close();
		
		//using wait in Thread case 2
		
//		driver.findElement(By.cssSelector(".bm-burger-button")).click();
//		try {
//			Thread.sleep(10000);
//			//System.out.println("waiting....");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
//		driver.close();
		
		// using multiple waits methods case 3
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
		
		
		driver.findElement(By.cssSelector(".bm-burger-button")).click();
		// use anyone from above list
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// adding conditions
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#logout_sidebar_link"))));
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		driver.close();
		
	}
	
	public static void Paths(WebDriver driver, String username, String password) 
    {
        driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
        driver.findElement(By.cssSelector("#login-button")).click();		     
        
    }
}
