package Automation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chaplen7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");		
		WebDriver dr = new ChromeDriver();	
		dr.manage().window().maximize();
		//FileReader fileObject = null;
		
		FileReader fileObject = null;
		try {
			fileObject = new FileReader("C:\\Users\\Rabindra\\OneDrive\\Desktop\\input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		BufferedReader br = new BufferedReader(fileObject);
		String line;
		int lineCount=0;
		int Iteration=0;

		try {
			while ((line = br.readLine()) !=null) {
			String inputData [] = line.split(",", 2);
			lineCount=lineCount+1;

			if (lineCount>1) {
			Iteration=Iteration+1;
			
			dr.get("http://gcreddy.com/project/admin/login.php");
				dr.findElement(By.name("username")).sendKeys(inputData[0]);
				Thread.sleep(500);
				dr.findElement(By.name("password")).sendKeys(inputData[1]);
				Thread.sleep(200);
				dr.findElement(By.id("tdb1")).click();
				Thread.sleep(2000);

				String url= dr.getCurrentUrl();

				if (url.equals("http://gcreddy.com/project/admin/index.php")) {
				System.out.println(Iteration + " Admin Login is Successful – Passed");
				}
				else {
				System.out.println(Iteration+" Admin Login is Unsuccessful – Failed");
				}
				dr.close();
				}
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fileObject.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
