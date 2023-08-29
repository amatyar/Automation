package Automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class August25 {

	public static void main(String[] args) 
	{ 
		//HashMap ---> System.setProperty(Key, Value)
		//set the system property indicated by specified key
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		//what is use for? setting the properties for the browser for creating test cases, it is method
		ChromeDriver dr = new ChromeDriver ();
		dr.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		
		WebElement fn = dr.findElement(By.cssSelector("#contact_form > input:nth-child(1)"));
		//find the first web element
		WebElement ln = dr.findElement(By.cssSelector("#contact_form > input:nth-child(2)"));
		WebElement em = dr.findElement(By.cssSelector("#contact_form > input:nth-child(3)"));
		WebElement cm= dr.findElement(By.cssSelector("#contact_form > textarea"));
		WebElement rb = dr.findElement(By.cssSelector("#form_buttons > input:nth-child(1)"));
		
		fn.sendKeys("Rabindra"); // send to element
		ln.sendKeys("Amatya");
		em.sendKeys("Amatyar@yahoo.com");
		cm.sendKeys("Hello from my home");
		fn.clear(); // clear fn
		rb.click();
		
		
		// Text()
		
		WebElement head = dr.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
		String tx =head.getText(); //get method takes single parameter
		System.out.println(tx);
		
		System.out.println(" next case ----->>>>>");
		
		dr.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		dr.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		//  is_Enabled()
		WebElement RadioButton_IsEnable= dr.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(1)"));
		boolean a1 = RadioButton_IsEnable.isEnabled();
		System.out.println(a1);
		
		//GetText()
		WebElement getText = dr.findElement(By.cssSelector("#dropdowm-menu-1"));
		String ab = getText.getText();
		System.out.println(ab);
		
		// Is_Displayed()
		WebElement header = dr.findElement(By.cssSelector("h1"));
		boolean q1 = header.isDisplayed();
		System.out.println(q1);
		
		//is_Selected()
		WebElement isSelected_RadioB = dr.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
		boolean q2 = isSelected_RadioB.isSelected();
		System.out.println(q2);
		
		//Is_Disabled
		WebElement isDesable_radioB = dr.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
		boolean q3= isDesable_radioB.isEnabled();
		System.out.println(q3);
	}

}
