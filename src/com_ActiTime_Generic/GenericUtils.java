package com_ActiTime_Generic;

import java.io.File;
import java.time.LocalDate;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

public class GenericUtils
{
	/***
	 * @author CBT
	 * @category screen shot
	 * @param driver
	 * @param name
	 */
	public static void getScreenShot(WebDriver driver,String name)
	{
		LocalDate date = LocalDate.now();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			Files.copy(src, new File("./ScreenShot/"+date+"_"+name+".png"));
		}
		catch (Exception e) 
		{
		}
	}
	
	public static void selectByIndex(WebElement element,int index)
	{
		Select sel =  new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void deSelectByIndex(WebElement element,int index)
	{
		Select sel =  new Select(element);
		sel.deselectByIndex(index);
	}
	
	public static void deSelectByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.deselectByValue(value);
	}
	
	public static void deSelectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	
	public static void deSelectAll(WebElement element)
	{
		Select sel =  new Select(element);
		sel.deselectAll();
	}
	
	
	
	
	
	
	
	
	
}
