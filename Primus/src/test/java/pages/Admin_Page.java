package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Admin_Page {

	
	private WebDriver driver;









	public Admin_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//a[@href='Admin_Emp_details.aspx']//img")
	WebElement Employee;
	@FindBy(xpath = "//input[@id='BtnNew']")
	WebElement NewEmployees;
	@FindBy(name = "txtUname")
	WebElement Empname;
	@FindBy(name = "txtLpwd")
	WebElement Emppass;
	@FindBy(id = "BtnSubmit")
	WebElement click;
	

	

	




	public void addEmployee(String N_Emp_name, String N_Emp_Pass ){
		
		Employee.click();
		NewEmployees.click();
		Empname.sendKeys(N_Emp_name);
		Emppass.sendKeys(N_Emp_Pass);
		click.click();
		
		
	}
}
