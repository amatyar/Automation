package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class laxmi34 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");	
		 WebDriver driver = new ChromeDriver();
		// Lunching the URL:
	    driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

	    // Maximize the window:
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    // Searching the dropdown elements by locating its id:
	    Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));

	    // Printing the choice of the dropdown /Get list of web elements
	    List<WebElement> lists = select.getOptions();

	    // for each Loop through the choice and printing all the dropdown list
	    System.out.println("choice of dropdown");
	    for (WebElement choice : lists)
	      System.out.println(choice.getText());

	    //selecting single sellection dropdpwn 
	    
	    // selectByIndex:
	    WebElement ddown = driver.findElement(By.id("dropdowm-menu-1"));
	    Select ddown1 = new Select(ddown);
	    ddown1.selectByIndex(3); //sql
	    Thread.sleep(2000);

	    // selectByVisibleText:
	    ddown1.selectByVisibleText("Python"); //python
	    Thread.sleep(2000);

	    // selectByValue:
	    ddown1.selectByValue("java"); //Java
	    Thread.sleep(2000);

	    // Selecting the option -- selectByIndex:
	    // Test case 1:
	    select.selectByIndex(3);
	    System.out.println("Select the option by index 3");

	    WebElement index = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(4)"));
	    boolean a = index.isSelected();
	    if (a) {
	      System.out.println("Index is selecting");
	    } else {
	      System.out.println("Index is not selecting");
	    }

	    // Test case 2:
	    // Selecting the option -- selectByVisibleText:
	    select.selectByVisibleText("Python");
	    System.out.println("Select the option by text Python");

	  
	    WebElement string = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(3)"));
	    boolean b = string.isSelected();

	    if (a) {
	      System.out.println("Test case 2 is pass");
	    } else {
	      System.out.println("Test case 2 is fail");
	    }

	    // Test case 3:
	    // Selecting the option -- selectByValue:
	    select.selectByValue("java");
	    System.out.println("Select the option by value");

	    WebElement value = driver.findElement(By.cssSelector("#dropdowm-menu-1 > option:nth-child(1)"));
	    boolean c = value.isSelected();

	    if (a) {
	      System.out.println("Test case 3 is pass");
	    } else {
	      System.out.println("Test case 3 is fail");
	    }

	    // driver.close();

	}

}
