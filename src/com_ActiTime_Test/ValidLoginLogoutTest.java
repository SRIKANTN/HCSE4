package com_ActiTime_Test;
import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Page.ActiTIMELoginPage;
import com_ActiTime_Page.ActiTimeEnterTimeTrackPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority = 1)
	public void validLoginLogout()
	{
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String lgTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String epTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		ActiTimeEnterTimeTrackPage ep = new ActiTimeEnterTimeTrackPage(driver);
		//verify login page
		lp.verifyTitle(lgTitle);
		//enter valid user name
		lp.enterUserName(un);
		//enter valid password
		lp.enterPassword(pw);
		//click on login button 
		lp.clickOnLoginButton();
		//verify enter time track page
		lp.verifyTitle(epTitle);
		//click on logout
		ep.clickOnLogoutButton();
		//verify login page
		lp.verifyTitle(lgTitle);
	}

}
