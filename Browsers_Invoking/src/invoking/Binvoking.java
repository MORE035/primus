package invoking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Binvoking {
	 public static  String Browser="chrome";
	 public static WebDriver driver;
	public static void main(String[] args) {
	if(Browser=="chrome")	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

	}if(Browser=="firefox")	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		 driver =new FirefoxDriver();
		 driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

	}if(Browser=="edge")	{
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

		 driver = new EdgeDriver();	
		 driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

		}if(Browser=="opera")	{
			System.setProperty("webdriver.opera.driver", "C:\\Users\\crown\\Desktop\\Q Edge\\seleniumgrid\\operadriver1.exe");

			 driver = new OperaDriver();	
			 driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			}

	}

}
