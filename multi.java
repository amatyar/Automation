package Automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi 
{

	public static void main(String[] args) 
	{
		ArrayList<ArrayList<String>> users = new ArrayList<ArrayList<String>>();
		ArrayList<String> user1 = new ArrayList<String>();
		user1.add("standard_user");
		user1.add("secret_sauce");
		users.add(user1);
		ArrayList<String> user4 = new ArrayList<String>();
		user4.add("performance_glitch_user");
		user4.add("secret_sauce");
		users.add(user4);
		ArrayList<String> user2 = new ArrayList<String>();
		user2.add("locked_out_user");
		user2.add("secret_sauce");
		users.add(user2);
		ArrayList<String> user3 = new ArrayList<String>();
		user3.add("problem_user");
		user3.add("secret_sauce");
		users.add(user3);
		
		MultipleUsers(users);
	}


public static void MultipleUsers(ArrayList<ArrayList<String>> users) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    try {
		    for (ArrayList<String> user : users) 
		    {
		        String username = user.get(0);
		        String password = user.get(1);
		        driver.get("http://www.saucedemo.com/");
		        driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		        driver.findElement(By.cssSelector("#password")).sendKeys(password);
		        driver.findElement(By.cssSelector("#login-button")).click();
		
		
		    }
    	}
    	catch(Exception ex)
		    {
		    	System.out.println("fail test cases" + ex);
		    }
	    finally 
		    {
		    driver.close();
		    driver.quit();
		    }
	}
}