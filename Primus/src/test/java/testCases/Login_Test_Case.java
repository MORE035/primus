package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Login_Page;
import utilities.AppUtils;

public class Login_Test_Case extends AppUtils {

	@Test
	public void admin_Login_Valid() {
		
		Login_Page lp=new Login_Page(driver);
		lp.Login("Admin", "Admin");
		Assert.assertTrue(lp.Valid_User());
		
		lp.Logout();
	}
	@Test(dataProvider = "getData")
	public void inValiduser(String Username,String Password) throws InterruptedException {
		Login_Page lp=new Login_Page(driver);
		lp.Login(Username, Password);
		Assert.assertTrue(lp.invalid_User());
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="Admin1";
		obj[1][0]="Ad";
		obj[1][1]="Admin";
		obj[2][0]="vasanth";
		obj[2][1]="Admi";
		return obj;

	}
}
