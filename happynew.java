package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class happynew {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");
	

	String arr[][]= { 
			{"standard_user","locked_out_user","problem_user","performance_glitch_user"} ,
			{"secret_sauce","secret_sauce","secret_sauce","secret_sauce"} 
	};
	   

	for(int i=0; i<arr.length-1 ; i++){

	for(int j=0;j<arr.length;j++) { 

	   
	

	driver.findElement(By.cssSelector("#user-name")).sendKeys(arr[i][j]);

	driver.findElement(By.cssSelector("#password")).sendKeys(arr[i+1][j]);
	driver.findElement(By.cssSelector("#login-button")).click();
         
	        }    
	    }

	}

}
