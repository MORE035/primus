package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindPages {
	WebDriver driver;
	public FindPages (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="txtuId")
	WebElement Id;
	@FindBy(id="txtPword")
	WebElement Pass;

	@FindBy(id="login")
	WebElement login;

	@FindBy(xpath="//img[@src='images/admin_but_03.jpg']")
	WebElement logOut;
	public void Banker_Login(String UserName,String password) {
		
		Id.sendKeys(UserName);
		Pass.sendKeys(password);
		login.click();
		
	}
	public void LogOut() {
		logOut.click();
		
	}
}
