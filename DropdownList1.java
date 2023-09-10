package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");	       
        WebDriver driver = new ChromeDriver();
		
        //Step#2- Launching URL
        String url ="http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
        //url
        driver.get(url);
        //navigate
        driver.navigate().refresh();
        //Maximizing window
        driver.manage().window().maximize();
        // wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        // Using findElements for list
        List<WebElement> items = driver.findElements(By.id("dropdowm-menu-1"));
        //Looping through the options and printing dropdown options
		for(int i =0; i< items.size(); i++) {
			System.out.println("Lists in dropdown 1: \n"+items.get(i).getText());			
			}   
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   driver.get(url);
        List<WebElement> item = driver.findElements(By.id("dropdowm-menu-2"));
        //Looping through the options and printing dropdown options
		for(int i =0; i< item.size(); i++) {
			System.out.println("Lists in dropdown 2: \n"+item.get(i).getText());			
			}   
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get(url);
		
		List<WebElement> it = driver.findElements(By.id("dropdowm-menu-3"));
        //Looping through the options and printing dropdown options
		for(int i =0; i< it.size(); i++) {
			System.out.println("Lists in dropdown 3: \n"+it.get(i).getText());			
			} 
				
		driver.close();
	}
}
       
	