package Automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chaplen6 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();	
		dr.manage().window().maximize();
		dr.get("https://www.gcreddy.com/discussiongroup/ucp.php?mode=register");
		dr.findElement(By.id("agreed")).click();
		dr.findElement(By.id("username")).sendKeys("Indianewad");

		String Email = "Indianew"+Math.random()+"@gmail.com";
		dr.findElement(By.id("email")).sendKeys(Email);

		dr.findElement(By.id("new_password")).sendKeys("Abcd123");
		dr.findElement(By.id("password_confirm")).sendKeys("Abcd123");

		System.out.println("Enter Verification Code");
		Scanner scan = new Scanner(System.in);
		String captcha = scan.nextLine();

		dr.findElement(By.id("confirm_code")).sendKeys(captcha);

		dr.findElement(By.id("submit")).click();
		//Thread.sleep(3000);

		String message = dr.findElement(By.xpath("//*[@id=\'message\']/div/p")).getText();

		if (message.contains("Your account has been created.")) {
		System.out.println("User Registration is Successful – Passed");
		}
		else {
		System.out.println("User Registration is Unsuccessful – Failed");
		}
		dr.close();
	}

}
