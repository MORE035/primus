package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File_AutoIt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");	
		WebElement arg0 = driver.findElement(By.id("uploadframe"));
		driver.switchTo().frame(arg0);
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
	}
}
