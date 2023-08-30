package Automation;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class neeww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");
        
		String arr[][] = {
							{"standard_user", "secret_sauce"}, 
							{"locked_out_user", "secret_sauce"},
							{"problem_user", "secret_sauce"},
							{"performance_glitch_user", "secret_sauce"}
						};		

		for (int i = 0; i < arr.length; i++) {
			String [] pra = arr[i];
			for(int j = 0; j <pra.length; j++) {
		    driver.findElement(By.cssSelector("#login-button")).click();
		    driver.findElement(By.cssSelector("#user-name")).sendKeys(arr[i][0]);
		    driver.findElement(By.cssSelector("#password")).sendKeys(arr[i][1]);
		   
		    driver.close();
		}
		}
	}

}
