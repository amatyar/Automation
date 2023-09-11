package Automation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chaplen8 {

static WebDriver driver;
static String ErrorMessage;

	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();	
		dr.manage().window().maximize();
		
		FileReader file = new FileReader ("C:\\Users\\Rabindra\\OneDrive\\Desktop\\index.txt");
		BufferedReader br = new BufferedReader(file);

		int count=0;
		int iteration=0;
		String line;

		while ((line=br.readLine()) !=null) {
		count = count+1;

		if (count>1) {
		iteration = iteration+1;

		String inputData[] = line.split(",",2);
	
		dr.get("http://gcreddy.com/project/admin/login.php");
		dr.findElement(By.name("username")).sendKeys(inputData[0]);
		dr.findElement(By.name("password")).sendKeys(inputData[1]);
		dr.findElement(By.id("tdb1")).click();
		Thread.sleep(2000);

		ErrorMessage = driver.findElement(By.className("messageStackError")).getText();

		if ((iteration == 4) && (ErrorMessage.contains("The maximum number of login attempts has been reached. Please try again in 5 minutes."))) {
		System.out.println(iteration+ " Maximum invalid login attempts are over – Passed");
		}
		else if ((iteration <= 3) && (ErrorMessage.contains("Error: Invalid administrator login attempt."))) {
		System.out.println(iteration+ " Maximum invalid login attempts are Not over – Passed");
		}
		else
		{
		System.out.println(iteration+" Failed");
		}
		dr.close();
		}
		}
		br.close();
		file.close();

	}

}
