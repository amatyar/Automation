package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturday03Sept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String url = "https://www.saucedemo.com/";
		driver.get(url);
				//locked_out_user
				//problem_user
				//performance_glitch_user //secret_sauce
		// Testcase 1
		String expected ="Sauce Labs Bolt T-Shirt";
		actions(driver, "standard_user", "secret_sauce");
		boolean productFound = false;
		List<WebElement> items = driver.findElements(By.cssSelector(".inventory_item_name"));
		for(int i =0; i< items.size(); i++) {
			//System.out.println(items.get(i).getText());
			if(items.get(i).getText().equals(expected)) {
				productFound = true;
				break;
			}
		}
		if(productFound) {
			System.out.println("Product is available");
			System.out.println("Test case 1 passed");
		}
		else
		{
			System.out.println("Product is no available");
			System.out.println("Test case 1 Failed");
		}
		// Test case 2
		driver.get(url);
		String ExceptedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
		if(ExceptedTitle.equals(ActualTitle)) {
			System.out.println("Test case 2 passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		//Test case 3
		String exceptedurl = "inventory.html";
		driver.get(url);
		actions(driver, "standard_user", "secret_sauce");
		String Actualurl = driver.getCurrentUrl();
		if(Actualurl.contains(exceptedurl))
		{
			System.out.println("Test case 3 passed");
		}
		else
		{
			System.out.println("Test case 3 Failed");
		}
		
		// test case 4
		driver.get(url);
		actions(driver, "standard_user", "secret_sauce");
		WebElement logo = driver.findElement(By.cssSelector(".app_logo"));
		if(logo.isDisplayed()) {
			System.out.println("Test case 4 is passed ");
		}
		else
		{
			System.out.println("Test case 4 is failed");
		}
		// test case 5
		driver.get(url);
		actions(driver, "standard_user", "secret_sauce");
		int imgCount = CountImg(driver);
		if (imgCount >0 )
		{
			System.out.println("Test case passed");
			System.out.println(imgCount+ " display image");
			System.out.println(imgCount  + " display image");
		}
		else
		{
			System.out.println("Test case 5 failed");
		}
	}
	
public static void actions(WebDriver driver, String username, String password) 
{
	driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
	driver.findElement(By.cssSelector("#password")).sendKeys(password);
	driver.findElement(By.cssSelector("#login-button")).click();
	
}

public static int CountImg(WebDriver driver) 
{
    int count = 0;
    // counting images and list and size		 
    List<WebElement> a = driver.findElements(By.cssSelector(".inventory_item_price"));
    a.size();
    System.out.println(a.size()+" numbers of images"); 
    for(int i = 0; i < a.size(); i ++) {
    System.out.println(a.get(i
    		).getText());
    }
    for (WebElement image : driver.findElements(By.cssSelector(".inventory_item_price"))) 
    {
        if (image.isDisplayed()) 
        {
            count++;
        }
    }
    return count;
}	

}
