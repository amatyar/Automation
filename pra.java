package Automation;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
         WebDriver dr = new ChromeDriver();
         String url = "http://www.saucedemo.com/";
         dr.get(url);
         dr.manage().window().maximize();
         
		        // Perform Case 1
         
         CreateLogin(dr, "locked_out_user", "secret_sauce");
	     boolean abcd = dr.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).isDisplayed();
	        if (abcd) 
	        {
	            System.out.println("Perform Case 2 passed.");
	        } 
	        else 
	        {
	            System.out.println("Perform Case 2 failed.");
	        }	       
		        
		        // Perform Case 2		       
		        dr.get(url);	      

		        CreateLogin(dr, "standard_user", "secret_sauce");
		        boolean abc = dr.findElement(By.cssSelector("#header_container > div.header_secondary_container > span")).isDisplayed();
		        if (abc) 
		        {
		            System.out.println("Perform Case 1 passed.");
		        } 
		        else 
		        {
		            System.out.println("Perform Case 1 failed.");
		        }
		        // Perform Case 3
		        dr.get(url);
		        CreateLogin(dr, "problem_user", "secret_sauce");
		        boolean abcde = dr.findElement(By.cssSelector("#item_0_img_link > img")).isDisplayed();
		        if (abcde) 
		        {
		            System.out.println("Perform Case 3 passed.");
		        } 
		        else 
		        {
		            System.out.println("Perform Case 3 failed.");
		        }

		        // Test Case 4
		        dr.get(url);
		        CreateLogin(dr, "performance_glitch_user", "secret_sauce");

		        // it is used to wait before finding element to validate.
		        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		       

		        int displayedImageCount = ImgNumb(dr);

		        if (displayedImageCount > 0) {
		            System.out.println("Number of displayed images: " + displayedImageCount);
		            System.out.println("Perform Case 4 passed.");
		        } else {
		            System.out.println("Unaviable  images  or Perform Case 4 failed.");
		        }

		        dr.close();
		        
		        dr.quit();
		  }

		    public static void CreateLogin(WebDriver driver, String username, String password) 
		    {
		        driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		        driver.findElement(By.cssSelector("#password")).sendKeys(password);
		        driver.findElement(By.cssSelector("#login-button")).click();		     
		        
		    }

		    public static int ImgNumb(WebDriver driver) 
		    {
		        int i = 0;
		        // counting images and list and size		 
		        List<WebElement> a = driver.findElements(By.cssSelector(".inventory_item_price"));
		        a.size();
		        System.out.println(a.size()+" numbers of images"); 
		        
		        for (WebElement image : driver.findElements(By.cssSelector(".inventory_item_price"))) 
		        {
		            if (image.isDisplayed()) 
		            {
		                i++;
		            }
		        }
		        return i;
		    }	
	

}
