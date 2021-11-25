package AppUtils;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Apputils 
{

	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public static void launchApp()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	@AfterTest
	public static void closeApp()
	{
		
		driver.close();
		
	}
	
	
	
	
	
}
