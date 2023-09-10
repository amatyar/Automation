package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDlNew {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");	       
        WebDriver driver = new ChromeDriver();
		// Navigate to the URL
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        //Maximizing window
        driver.manage().window().maximize();

        //Selecting the multi-select element by locating its id       
        Select select = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-3")));
        //Get the list of all the options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();

        for(WebElement option: options)
            System.out.println(option.getText());

        //Using isMultiple() method to verify if the element is multi-select
        if(select.isMultiple()){

        	System.out.println("\nThis Dropdown List is multi selector.");
        }
        else
        {
        	System.out.println("\nThis Dropdown List is not multi selector.");
        }
        
        System.out.println("Select the Option by value 3");
        select.selectByValue("javascript");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        System.out.println("Happy coding assignment. Thank you!");
        //
        select.selectByVisibleText("HTML");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        select.selectByValue("jquery");
        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
        
        driver.quit();

	}

}
