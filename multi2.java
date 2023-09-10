package Automation;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

public class multi2 {

	private static final String FileUtils = null;
	private static final String ShootingStrategies = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdeiver.chrome.deriver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
				

		 // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        
      //navigate to url
        driver.get("https://demoqa.com");

        // capture screenshot and store the image
//        ScreenshotException s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
//        ImageIO.write(s.getImage(),"PNG",new File("C:\\projectScreenshots\\fullPageScreenshot.png"));
        
        //closing the webdriver
        driver.close();
	}

}
