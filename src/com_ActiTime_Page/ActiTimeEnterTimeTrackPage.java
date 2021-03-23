package com_ActiTime_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_ActiTime_Generic.BasePage;

public class ActiTimeEnterTimeTrackPage extends BasePage
{
	//Declaration
	@FindBy(id = "logoutLink")
	private WebElement logout;
	
	//Intilization
	public ActiTimeEnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void clickOnLogoutButton()
	{
		logout.click();
	}

}
