package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	    
	    List<WebElement> checkboxes =driver.findElements(By.cssSelector("input[type='checkbox']"));
	    System.out.println("Total no of check:"+ checkboxes.size());	        
	     //for each loop: for select each one
	    for(WebElement chbox:checkboxes) 
	    {
	    	if(!chbox.isSelected()) {
	    		chbox.click();
	    	}    		    	      
	    	
	    	System.out.println("Checked checkBoxes are\t"+chbox.isSelected());	    
	    }
	    //for unselected 
	    
	    //for()
	}
}
