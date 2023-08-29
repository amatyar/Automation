package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SELEDAY1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver ();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		String baseurl ="http://demo.guru99.com/test/newtours/";
		String expectedTitle ="Welcome: Mercury tours";
		
		String actualTitle = "";
		
		driver.get(baseurl);
		
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("passed");
		}
		else
		{
			System.out.println("Fail");
		}
		
		

		driver.close();
	
		
		
		
		
		
		
		
		
	}

}
