package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	public static void main(String[] args) {
		System.setProperty("webdeiver.chrome.deriver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement head = dr.findElement(By.cssSelector("h2"));//???
		String q = head.getText();
		if(q.equals("CONTACT US"))
		{
			System.out.println("Test case 1 passed");
		}
		else
		{
			System.out.println("Test case 1 Failed");
		}
		
		//dr.close();
		
		// test case 2
		//Arrange
		//Action
		dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		dr.findElement(By.cssSelector(" #contact_form > input:nth-child(1)")).sendKeys("Rabindra ");
		dr.findElement(By.cssSelector("#contact_form > input:nth-child(2) ")).sendKeys("Amatya");
		dr.findElement(By.cssSelector(" #contact_form > input:nth-child(3)")).sendKeys("amatyar@yahoo.com");
		dr.findElement(By.cssSelector(" #contact_form > textarea")).sendKeys("Hello i am Rabindra from Boston.");
		dr.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).submit();
		
		//Assertion
		boolean ab = dr.findElement(By.cssSelector("h1")).isDisplayed();/////???
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
		
		boolean q5 = dr.findElement(By.cssSelector("body")).isDisplayed(); //??
		  if(q5){ 
		   System.out.println("Testcase 3 pass"); 
		  } 
		  else { 
		   System.out.println("Testcase 3 fail"); 
		  } 
		  
		  
		  // Test cases 4 -- reset button
		  	dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
			dr.findElement(By.cssSelector(" #contact_form > input:nth-child(1)")).sendKeys("Rabindra ");
			dr.findElement(By.cssSelector("#contact_form > input:nth-child(2) ")).sendKeys("Amatya");
			dr.findElement(By.cssSelector(" #contact_form > input:nth-child(3)")).sendKeys("amatyar@yahoo.com");
			dr.findElement(By.cssSelector(" #contact_form > textarea")).sendKeys("Hello i am Rabindra from Boston.");
			dr.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
			String abc = dr.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).getText();
			//System.out.println(abc);
			if(abc.isEmpty()) {
				System.out.println("Test Case 4 passed");
			}
			else
			{
				System.out.println("Test case 4 failed");
			}
			
			
	}

}
