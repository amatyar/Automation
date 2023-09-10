package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");	       
         WebDriver driver = new ChromeDriver();
		
         // Launching URL
         String url = "http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
         driver.get(url);
         //Maximizing window
         driver.manage().window().maximize();
         //Selecting the dropdown element by locating its id
         List<WebElement> items = driver.findElements(By.id("dropdowm-menu-1"));       
        
         //Get list of web elements
       
         for(int i =0; i< items.size(); i++) 
         	{
 				System.out.println("Lists in dropdown 1: \n"+items.get(i).getText());			
 			}   
         try 
         	{
 			Thread.sleep(3000);
 			} 
         catch (InterruptedException e) 
         	{
 			
 			e.printStackTrace();
         	}
 		   driver.get(url);
         
 		  Select selecty = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-2")));
	        	        
	      List<WebElement> opt = selecty.getOptions();  
	      System.out.println("The dropdown from two list -");
	      selecty.selectByValue("maven");;
	      System.out.println("Select value is:"+selecty.getFirstSelectedOption().getText());
         try 
         	{
 			Thread.sleep(3000);
 			} 
         catch (InterruptedException e) 
         	{
 			// TODO Auto-generated catch block
 			e.printStackTrace();
         	}
         
         
 		  driver.get(url);
 		 Select selectu = new Select(driver.findElement(By.cssSelector("#dropdowm-menu-3"))); 	       	        
 	     List<WebElement> options = selectu.getOptions();  
 	     System.out.println("The dropdown from three list -");
         selectu.selectByVisibleText("HTML");
         System.out.println("Select value is: " + selectu.getFirstSelectedOption().getText());
         selectu.selectByValue("jquery");
         System.out.println("Select value is: " + selectu.getFirstSelectedOption().getText());
         
	}

}
