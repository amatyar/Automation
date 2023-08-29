package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambdaTest {

	public static void main(String[] args) {
		// objects and variables instantiation
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String appUrl = "https://accounts.google.com";
        
        //open the application url
        driver.get(appUrl);
        
        //maximize the browser window
        driver.manage().window().maximize();
        
        // expected title of the webpage.
        String expectedTitle = " Sign in - Google Accounts ";
        
        //fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
        
        //compare the expected 
        if (expectedTitle.equals(actualTitle))
        {
               System.out.println("Verification Successful");
        }
       else
        {
               System.out.println("Verification Failed");
        }

      
        WebElement a = driver.findElement(By.id("#identifierId"));
        WebElement b = driver.findElement(By.id("#password"));
        WebElement c = driver.findElement(By.id("#passwordNext"));
        
        a.sendKeys("Rabindra.amatya@gmail.com");         
        b.sendKeys("Rohanamatya07");     
            
        c.click();
        //WebElement heading = driver.findElement(By.cssSelector("#passwordNext"));
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");
        
        //terminate the program
        System.exit(0);
		}

//	WebElement l = driver.findElement(By.name("identifier"));
//    l.sendKeys("rabindra.amatya@gmail.com");
//    WebElement b = driver.findElement(By.className("VfPpkd-LgbsSe"));
//    b.click();
//    //identify password
//    WebElement p = driver.findElement(By.name("password"));
//    p.sendKeys("Rohanamatya07");
//    b.click();
//    //close browser
//    driver.close();

}
