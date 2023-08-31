package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class august30 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
         WebDriver dr = new ChromeDriver();
     	dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
     	
       
        // getTitle() to obtain page title
        System.out.println("Page title is : " + dr.getTitle());
				
				
		
			
				// driver.findElements()
	
     	
		
		WebElement head = dr.findElement(By.cssSelector("h2"));
		//getText()
		String q = head.getText();
		if(q.equals("CONTACT US"))
		{
			System.out.println("Test case 1 passed");
		}
		else
		{
			System.out.println("Test case 1 Failed");
		}	
		
		//getSize
		//to maximize the window to get actual size
		dr.manage().window().maximize(); 
		Dimension D1 = head.getSize();
		System.out.println(D1);	
		
		// test case 2
		//Arrange
		//Action
		//dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		dr.findElement(By.cssSelector(" #contact_form > input:nth-child(1)")).sendKeys("Rabindra ");
		dr.findElement(By.cssSelector("#contact_form > input:nth-child(2) ")).sendKeys("Amatya");
		dr.findElement(By.cssSelector(" #contact_form > input:nth-child(3)")).sendKeys("amatyar@yahoo.com");
		dr.findElement(By.cssSelector(" #contact_form > textarea")).sendKeys("Hello i am Rabindra from Boston.");
		dr.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		//Assertion
		boolean ab = dr.findElement(By.cssSelector("h1")).isDisplayed();
		if (ab) {
			System.out.println("Test case 2 passed.");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		//Test Cases 3 --incorrect email  address
		dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		dr.findElement(By.cssSelector(" #contact_form > input:nth-child(1)")).sendKeys("Rabindra ");
		dr.findElement(By.cssSelector("#contact_form > input:nth-child(2) ")).sendKeys("Amatya");
		dr.findElement(By.cssSelector(" #contact_form > input:nth-child(3)")).sendKeys("amatyaryahoo.com");
		dr.findElement(By.cssSelector(" #contact_form > textarea")).sendKeys("Hello i am Rabindra from Boston.");
		dr.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		boolean q5 = dr.findElement(By.cssSelector("body")).isDisplayed(); 
		  if(q5){ 
		   System.out.println("Testcase 3 Passed"); 
		  } 
		  else { 
		   System.out.println("Testcase 3 Failed"); 
		  } 
		  
		  
		  // Test cases 4 -- reset button
		  	dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
			dr.findElement(By.cssSelector(" #contact_form > input:nth-child(1)")).sendKeys("Rabindra ");
			dr.findElement(By.cssSelector("#contact_form > input:nth-child(2) ")).sendKeys("Amatya");
			dr.findElement(By.cssSelector(" #contact_form > input:nth-child(3)")).sendKeys("amatyar@yahoo.com");
			dr.findElement(By.cssSelector(" #contact_form > textarea")).sendKeys("Hello i am Rabindra from Boston.");
			dr.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
			String abc = dr.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getText();// put any field
			System.out.println(abc);
			if(abc.isEmpty()) {
				System.out.println("Test Case 4 passed");
			}
			else
			{
				System.out.println("Test case 4 failed");
			}
			
			// driver.navigate()
			dr.navigate().refresh();
			
			// driver.getCurrentUrl()
			String url ="http://www.webdriveruniversity.com/Contact-Us/contactus.html";
			System.out.println("Current URL is:" + url);
			
			
			//get page source with getText method
		      WebElement l= dr.findElement(By.cssSelector("body"));
		      String p = l.getText();
		      System.out.println("Page Source is : " + p);
		      
//		      dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html"); 
//		    	  String pagesource=dr.getPageSource(); 
//		    	  System.out.println(pagesource + "Page Source"); 
		      dr.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
		    	  //to find elements 
		    	  List<WebElement> links=dr.findElements(By.xpath("//input[@type='radio']")); 
		    	  //Counting no of links in result page 
		    	  System.out.println(links.size()+" elements"); 
		    	  for (int i=0; i<links.size();i++){
		    	      System.out.println("Radio button text:" + links.get(i).getAttribute("value"));
		    	    }
			
			dr.close();
			dr.quit();
	}

}
