package com_ActiTime_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com_ActiTime_Generic.BaseTest;
import com_ActiTime_Generic.ExcelData;
import com_ActiTime_Page.ActiTIMELoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority = 2)
	public void invalidLogin() throws InterruptedException
	{
		String title =ExcelData.getData(file_path, "TC01", 1, 2);
		ActiTIMELoginPage lp = new ActiTIMELoginPage(driver);
		// verify login page title
		lp.verifyTitle(title);
		int rc = ExcelData.getRowCount(file_path, "TC02");
		for(int i = 1; i<=rc; i++)
		{
			String un = ExcelData.getData(file_path, "TC02", i, 0);
			String pw = ExcelData.getData(file_path, "TC02", i, 1);
			Reporter.log("User name = "+un,true);
			//to enter invalid user name
			lp.enterUserName(un);
			Reporter.log("Password = "+pw,true);
			//to enter invalid password
			lp.enterPassword(pw);
			//to click on login button
			lp.clickOnLoginButton();
			String aErrorMessage = lp.verfyErrorMessage();
			String eErrorMessage = ExcelData.getData(file_path, "TC02", 1, 2);
			//to comparing actual and expected error message
			Assert.assertEquals(aErrorMessage, eErrorMessage);
			Reporter.log("-------------------------------------",true);
			Thread.sleep(1000);
		}
	}

}
