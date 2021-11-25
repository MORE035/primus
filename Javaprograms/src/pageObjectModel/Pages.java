package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pages {
	public WebDriver driver;
	
	By User=By.id("txtUsername");
	By pass=By.id("txtPassword");
	By Login=By.id("btnLogin");
	By Welcome=By.id("welcome");
	By Logout=By.linkText("Logout");
	

	public Pages( WebDriver driver) {
		this.driver=driver;
	}

	public void Admin_Login(String Username,String Pass) 
	{
	driver.findElement(User).sendKeys(Username);
	driver.findElement(pass).sendKeys(Pass);
	driver.findElement(Login).click();

		
	}
	public void Log_Out() {

		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Welcome));
	driver.findElement(Welcome ).click();
	driver.findElement(Logout).click();
		
	}

}
