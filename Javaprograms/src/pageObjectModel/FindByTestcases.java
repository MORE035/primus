package pageObjectModel;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AppUtils.premiusApputils;

public class FindByTestcases extends premiusApputils {
	
	@Test(dataProvider= "Data")
	public void Admin_Login_TestCase(String User,String Pass)  {
		System.out.println(User+Pass);
	FindPages FP=new FindPages(driver);
		FP.Banker_Login(User, Pass);
		FP.LogOut();	
	}
	@DataProvider
	public Object[][] Data() {
		
		Object[][] obj=new Object[2][2];
		obj[0][0]="Admin";
		obj[0][1]="Admin";
		obj[1][0]="Admin";
		obj[1][1]="Admin";
		return obj;
	}
	
}
