package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class August31 {
 /*
  * 	// driver.close()
		// driver.quit()
		// driver.getTitle()
		// driver.getCurrentUrl()
		// driver.navigate()
		// driver.getPageSorce()
		// driver.findElement()
		// driver.findElements()
  */
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
         WebDriver dr = new ChromeDriver();      
         String ulr = "https://www.saucedemo.com/";
      // For driver.getTitle()
         dr.get(ulr);
         String Excepted_Title= "Swag Labs";
         String Actual_Title = dr.getTitle();
         if(Excepted_Title.equals(Actual_Title)) 
         {
        	 System.out.println("Test case for Title is passed ");
         }
         else
         {
        	 System.out.println("Title test case failed");
         }
         
         System.out.println("----Next-----");
         //for driver.getCurrentUrl()
         String Excepted_url = "inventory";
         dr.get(ulr);
         WebElement Username = dr.findElement(By.cssSelector("#user-name"));
         WebElement Password = dr.findElement(By.cssSelector("#password"));
         WebElement Login = dr.findElement(By.cssSelector("#login-button"));
         Username.sendKeys("standard_user");
         Password.sendKeys("secret_sauce");
         Login.click();
         String Actual_url = dr.getCurrentUrl();
         if(Actual_url.contains(Excepted_url)) 
         {
        	 System.out.println("URL Test case is passed.");
         }
         else
         {
        	 System.out.println("URL Test case is failed.");
         }
         //for driver.findElement()
         dr.get(ulr);
         WebElement Username1 = dr.findElement(By.cssSelector("#user-name"));
         WebElement Password1 = dr.findElement(By.cssSelector("#password"));
         WebElement Login1 = dr.findElement(By.cssSelector("#login-button"));
         Username1.sendKeys("standard_user");
         Password1.sendKeys("secret_sauce");
         Login1.click();
         WebElement logo = dr.findElement(By.cssSelector(".app_logo"));
         if(logo.isDisplayed()) {
        	 System.out.println("Logo test is passed");
         }
         else
         {
        	 System.out.println("Logo test is failed");
         }
         
      //for driver.findElements()
         String Expected_Product = "Sauce Labs Bike Light";
         dr.get(ulr);
         WebElement Username2 = dr.findElement(By.cssSelector("#user-name"));
         WebElement Password2 = dr.findElement(By.cssSelector("#password"));
         WebElement Login2 = dr.findElement(By.cssSelector("#login-button"));
         Username2.sendKeys("standard_user");
         Password2.sendKeys("secret_sauce");
         Login2.click();
         List <WebElement > items = dr.findElements(By.cssSelector(".inventory_item_name"));
 		boolean productFound = false;
 		//for(int i = 0 ; i < items.size() ; i++) {
 			//System.out.println(items.get(i).getText());
// 			if(items.get(i).getText().equals(Expected_Product)) {
// 				productFound = true;
// 				break;
// 			}
// 		}	
// 		if(productFound) {
// 			System.out.println("product available");
// 			System.out.println("Test case 4 pass");
// 		}
// 		else {
// 			System.out.println("product not available");
// 			System.out.println("Test case 4 fail");
// 		}
 		 System.out.println(items.size()+" elements"); 
   	  for (int i=0; i<items.size();i++){
   	      System.out.println("Items in productlist " + items.get(i).getText());
   	    }
   	  System.out.println("------to close page ------");
	}

}
