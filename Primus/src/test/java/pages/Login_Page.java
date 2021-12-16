package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	WebDriver driver;
	
	
	By UserName=By.name("txtuId");
	By password=By.name("txtPword");
	By Login=By.id("login");
	By Logout=By.xpath("//img[@src='images/admin_but_03.jpg']");
	By Admin_Text=By.xpath("//font[contains(text(),'Welcome')]");
	
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}



	public void  Login(String username ,String Pass) {
		
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(password).sendKeys(Pass);
	
		driver.findElement(Login).click();
	
		
	}
	public boolean Valid_User() {
		
		if(driver.findElement(Admin_Text).getText().contains("Admin")) {
			return true;
		}
		else {
			return false;
			
		}
	}
	public boolean invalid_User()  {
		String actual_err = driver.switchTo().alert().getText().toLowerCase();
		String expected_err = "incorrect";
		driver.switchTo().alert().accept();

		if(actual_err.contains(expected_err)) {
			return true;
		}else {
			return false;
		}
		
	}
	public void  Logout() {
		driver.findElement(Logout).click();
		
		
	}
	

}
