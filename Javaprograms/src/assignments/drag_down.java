package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_down {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement source = frame.findElement(By.id("draggable"));
		WebElement target = frame.findElement(By.id("droppable"));

		Actions ac=new Actions(driver);

		ac.dragAndDrop(source, target).build().perform();

		
	}

}
