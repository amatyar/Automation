package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUpAuto {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();	
		dr.manage().window().maximize();
		
		String URL ="http://the-internet.herokuapp.com/basic_auth";
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\Rabindra\\OneDrive\\Desktop\\Login.exe");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.close();
	}

}
