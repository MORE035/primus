package pageObjectModel;


import org.testng.annotations.Test;

import AppUtils.Apputils;

public class Testcases extends Apputils {
	@Test
	public void Admin_Login_TestCase()  {
		
		Pages pg=new Pages(driver);
		pg.Admin_Login("Admin", "Qedge123!@#");
		pg.Log_Out();
		
	}
}
