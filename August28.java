package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class August28 {

	public static void main(String[] args) {
		System.setProperty("webdeiver.chrome.deriver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		// Test case 1
		//WebElement head = dr.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		WebElement head = dr.findElement(By.cssSelector("h2")); // find out how???
		String a = head.getText();
		System.out.println(a);
//using class
		WebElement head1 = dr.findElement(By.cssSelector(".section_header"));//??
		String b = head1.getText();
		System.out.println(b);
		// id 
		//WebElement head11 = dr.findElement(By.cssSelector("#contact_form"));//??
		WebElement head11 = dr.findElement(By.xpath("//*[@id=\"contact_me\"]/div/div[1]/div/h2"));
		boolean c = head11.isDisplayed();
		System.out.println(c);
		// anyAttribute 
		  //tagName[attribute= "value"] 
		   
		  // Test 3 
		  WebElement headThreeD = dr.findElement(By.cssSelector("h2[name=\"contactme\"]")); 
		  String q3 = headThreeD.getText(); 
		  System.out.println(q3); 
		  if(q3.equals("CONTACT US")) { 
		   System.out.println("Testcase 1 pass"); 
		  } 
		  else { 
		   System.out.println("Testcase Fail"); 
		  } 
	}

}

