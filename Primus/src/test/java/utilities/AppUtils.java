package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtils {
	public static  String URL = "http://primusbank.qedgetech.com/";
	public  static WebDriver  driver;
	@BeforeSuite
	public  void BrowserOpen() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	@AfterSuite
	public   void BrowserClose() throws InterruptedException {
		Thread.sleep(2000L);
		driver.close();
	}
	
	
	

}
