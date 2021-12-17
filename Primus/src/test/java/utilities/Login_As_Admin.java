package utilities;


import org.testng.annotations.*;

import pages.Login_Page;
import utilities.AppUtils;



public class Login_As_Admin extends AppUtils{
	
@BeforeMethod
	public void Adminestater() {
		
		Login_Page lp=new Login_Page(driver);
		lp.Login("Admin", "Admin");
	
		
	}
	
	
}
