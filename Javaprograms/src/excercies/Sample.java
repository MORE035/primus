package excercies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("wedriver.gecko.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.englishcoachchad.com/thank-you-welcome?");
		driver.findElement(By.linkText("Login")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Set<String> winhand = driver.getWindowHandles();
		Iterator<String> it = winhand.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.switchTo().window(parent);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
	
		driver.quit();
		
	}

}
