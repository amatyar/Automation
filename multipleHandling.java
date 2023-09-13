package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();               
        // open multiple tabs

        driver.get("http://www.saucedemo.com/");// tab 1
        String parent = driver.getWindowHandle();
       	System.out.println("Sauce tab : "+ parent);//
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

        WebDriver newTab = driver.switchTo().newWindow(WindowType.WINDOW);
		String child = newTab.getWindowHandle();
		System.out.println("Google tab : "+ child);
		
        newTab.get("https://www.google.com"); // tab 2
		newTab.findElement(By.name("q")).sendKeys("Where is boston college?");
		Thread.sleep(1000);
		newTab.close();
		// can add more 
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(5000);
        
        driver.quit();
        


	}

}
