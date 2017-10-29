package com.mySeleniumFrameWork.baseSetUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	
	
	
	
	
	
	
	private static ThreadLocal<WebDriver>    driver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver webDriver) {
		driver.set(webDriver);
	}
	
	
	
	
	
	
	public static void tearDownDriver(WebDriver driver)
	{
		if(driver!=null)
		{
			driver.quit();
			driver=null;
			
		}
	}
	
	
	public void setImplicitWait(WebDriver driver,int timeInSeconds)
	{
		driver.manage().timeouts().implicitlyWait(timeInSeconds,TimeUnit.SECONDS);
	}
	
	public void manageBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	
	
	
	

}
