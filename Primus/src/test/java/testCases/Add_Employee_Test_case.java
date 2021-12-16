package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Admin_Page;
import pages.Login_Page;
import utilities.AppUtils;
import utilities.Login_As_Admin;

public class Add_Employee_Test_case extends Login_As_Admin {
	@Test(enabled = true)
	public void new_Emp() {
		Admin_Page ap=new Admin_Page(driver);

		ap.addEmployee("vasanth", "kumar");
	}
	
	@DataProvider
	public void getData() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="Admin11";
		obj[1][0]="Ad";
		obj[1][1]="Admin";
		obj[2][0]="Adm";
		obj[2][1]="Admi";

	}

}
