package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		//driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page title is:" + title);

		if(title.equals("Amazon.com")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
			
		}//driver.quit();
		

//		if (title.equals("Google")) {
//			System.out.println("correct title");
//		} else {
//			System.out.println("incorrect title");
//		}
//		
			String url = driver.getCurrentUrl();
			 System.out.println(url);
			
			driver.manage().window().maximize();

			//driver.quit();
	}

}
