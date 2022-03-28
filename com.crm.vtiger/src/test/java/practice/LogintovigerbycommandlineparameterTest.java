package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintovigerbycommandlineparameterTest {
@Test
public void logintovtiger()
{
	WebDriver driver=null;
	String browsername = System.getProperty("browser");
    String url = System.getProperty("url");
	String username = System.getProperty("username");
	String password = System.getProperty("password");
	
	if(browsername.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.findElement(By.name("user_name")).sendKeys(username);
driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();

}
}
