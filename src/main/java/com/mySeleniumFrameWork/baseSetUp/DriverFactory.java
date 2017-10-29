package com.mySeleniumFrameWork.baseSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	
	
	
	
	
	
	String chromeDriverPath="";
	
	
	
	
	
	
	public static WebDriver selectBrowser(String browser)
	{
		
		
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\CantataHealth\\MySeleniumFramework\\src\\main\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			
		
			
			
		}
		
		
		return driver;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
