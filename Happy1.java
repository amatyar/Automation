package Automation;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Happy1 {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\Downloads\\chromedriver\\chromedriver.exe");	       
        WebDriver d = new ChromeDriver();
        d.get("http://www.saucedemo.com/");
        d.manage().window().maximize();
		List<LoginData> data = new ArrayList<LoginData>();
	        //data.add(new LoginData("standard_user","secret_sauce"));
	        data.add(new LoginData("locked_out_user","secret_sauce"));
	        //data.add(new LoginData("problem_user", "secret_sauce"));
	        data.add(new LoginData("performance_glitch_user", "secret_sauce"));
	        

	            for(LoginData Da : data)
	            {
	               d.findElement(By.cssSelector("#user-name")).clear();
	               d.findElement(By.cssSelector("#user-name")).sendKeys(Da.getUname());
	               System.out.println(Da.getUname());
	               d.findElement(By.cssSelector("#password")).clear();
	               d.findElement(By.cssSelector("#password")).sendKeys(Da.getpd());
	               System.out.println(Da.getpd());
	               d.findElement(By.cssSelector("#login-button")).click();
	             }           
	            
	}

}
class LoginData
{
    private String username;
    private String password;

    public LoginData(String us, String pd)
    {
      this.username = us;  
      this.password= pd;
    }

    public String getUname()
    {
        return username;
    }

    private void setUsername(String us)
    {
        this.username = us;
    }

    public String getpd()
    {
        return password;
    }

    private void setpassword(String pd)
    {
        this.password = pd;
    }

}