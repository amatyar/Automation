package Automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saturday02sept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		String url = "http://www.webdriveruniversity.com/Contact-Us/contactus.html";
		driver.get(url);
//		
//		// Test case 1 enter valid credentials
//		
//		getData(driver, "Rabindra", "Amatya", "amatyar@yahoo.com","I am testing cases with valid data");
//		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
//		boolean a = driver.findElement(By.cssSelector("#contact_reply > h1")).isDisplayed();
//		if (a) {
//			System.out.println("Test case passed for validations");
//		}
//		else
//		{
//			System.out.println("Test case failed for validations ");
//		}
//		
//		// test case 2 for invalid email
//		
//		driver.get(url);
//		getData(driver,"Rabindra", "Amatya","amatyaryahoo.com","Invalid email entered");
//		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(2)")).click();
//		boolean b = driver.findElement(By.cssSelector("body")).isDisplayed();
//		if (b) {
//			System.out.println("Test case passed for invalid email");
//		}
//		else
//		{
//			System.out.println("Test case failed for invalid email ");
//		}	
//		
//		//test case 3 reset button
//		
//		driver.get(url);
//		getData(driver,"Rabindra", "Amatya","amatyar@yahoo.com","for reset button entered");
//		driver.findElement(By.cssSelector("#form_buttons > input:nth-child(1)")).click();
//		boolean c = driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).isDisplayed();
//		if (c) {
//			System.out.println("Test case passed for reset button");
//		}
//		else
//		{
//			System.out.println("Test case failed for reset button ");
//		}
//		
//		//driver.close();
//		// Radio buttons
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> linkes = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total :"+ linkes.size());
	 for(int j = 0; j <linkes.size(); j++) {
		 System.out.println("Radio Button: "+ linkes.get(j).getAttribute("value"));
	 }
	 
	 // for checkboxes
	 driver.navigate().to("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	 List<WebElement> check= driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println("total :" + check.size());
	 for(int i =0; i < check.size(); i++)
	 {
		 System.out.println("Check boxes :"+check.get(i).getAttribute("value"));
	 }
	
////is_display() function -- true
//	 WebElement header = driver.findElement(By.cssSelector("#main-header > h1"));
//	 boolean q = header.isDisplayed();
//	 System.out.println(q);

	       //is-enable
//	 WebElement enable_R= driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(3)"));
//	 boolean w = enable_R.isEnabled();
//	 System.out.println(w);
//	 //is selected
//	 WebElement isSelected = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled > input[type=radio]:nth-child(5)"));
//	 boolean e= isSelected.isSelected();
//	 System.out.println(e);
	 
	 driver.get(url);
	 //tagName == h2
	// <h2 name="contactme" class="section_header">CONTACT US</h2>
	 WebElement head1 = driver.findElement(By.cssSelector("h2"));
		String a= head1.getText();
		System.out.println(a);
	 //class name ==class="section_header"
		WebElement head11 = driver.findElement(By.cssSelector(".section_header"));
		String a1= head11.getText();
		System.out.println(a);
		
		// id -->id="contact_form"
		//<form action="contact_us.php" method="post" id="contact_form">
		WebElement head111 = driver.findElement(By.cssSelector("#contact_form"));
		boolean a11= head111.isDisplayed();
		System.out.println(a11);
		
		// tagName [attribute = "value"] -->h2 name="contactme"
		//<h2 name="contactme" class="section_header">CONTACT US</h2>
		WebElement rt = driver.findElement(By.cssSelector("h2[name=\"contactme\"]"));
		String q3 = rt.getText();
		System.out.println(q3);
		if(q3.equals("CONTACT US")) 
		{
			System.out.println("Testcase 1 pass");
		}
		else 
		{
			System.out.println("Testcase Fail");
		}
		
		//getText()
		String txt = rt.getText();
		System.out.println(txt);
		
		//getTagName()
		String txt1 =rt.getTagName();
		System.out.println(txt1);
		//getAttribute
		String txt2 =rt.getAttribute("class");
		System.out.println(txt2);
		
		// getSize()
		driver.manage().window().maximize();
		Dimension a21 =rt.getSize();
		System.out.println(a21);
		// getSize for textbox first name
		Dimension f = driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).getSize();
		System.out.println(f + "firstname");
		
		String txt3 = rt.getCssValue("font-size");
		System.out.println(txt3);
		String txt4 = rt.getCssValue("font-family");
		System.out.println(txt4);
		String txt5 = rt.getCssValue("color");
		System.out.println(txt5);
		Point d = rt.getLocation();
		System.out.println(d);
	}
public static void getData(WebDriver driver, String FirstName, String LastName, String Email, String Comments) 
	{
	driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys(FirstName);
	driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys(LastName);
	driver.findElement(By.cssSelector("#contact_form > input:nth-child(3)")).sendKeys(Email);
	driver.findElement(By.cssSelector("#contact_form > textarea")).sendKeys(Comments);
	}

}
