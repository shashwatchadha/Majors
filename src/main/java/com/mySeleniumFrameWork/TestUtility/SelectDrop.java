package com.mySeleniumFrameWork.TestUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SelectDrop {

	
	
	
	
	
	
	protected static Select selectDropDown;
	
	
	
	
	
	
	public void selectByVisibleText(WebElement elementLocator,String visibleText)
	{
		selectDropDown = new Select(elementLocator);
		selectDropDown.selectByVisibleText(visibleText);
	}
	
	public void selectByValue(WebElement elementLocator,String value)
	{
		selectDropDown = new Select(elementLocator);
		selectDropDown.selectByValue(value);
	}
	
	
	public ArrayList<String> getListOfOPtions()
	{
		List<WebElement> optionList=selectDropDown.getOptions();
		
		ArrayList<String> options = new ArrayList<String>();
		
		for(WebElement element: optionList)
		{
			options.add(element.getText());
		}
		return options;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
