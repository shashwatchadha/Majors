package com.mySeleniumFrameWork.baseSetUp;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.mySeleniumFrameWork.TestUtility.PropertyFilesManager;

public class SetUp {

	
	
	
	
	
	
	
	
	
	protected static Properties configProperty;
	public static HashMap<String,String> hash = new HashMap<String,String>();
	@BeforeSuite
	public void suiteSetUp() {
		
		
		
		PropertyFilesManager.setConfigFilePath(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesFile\\config.properties");
		
		
		
		
		
		
		
		
		
		
		
		

	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeClass
	public void beforeClass() {

		
	}

	@BeforeMethod
	public void beforeMethod(Method m) {
		
		System.out.println("executing before method" );
		configProperty = PropertyFilesManager.loadConfigFile();
		MyMap.initiateMap();
		DriverManager.setDriver(DriverFactory.selectBrowser(configProperty.getProperty("browser")));
		DriverManager.getDriver().navigate().to(configProperty.getProperty("URL"));

	}

	@AfterMethod
	public void afterMethod() {
		
		DriverManager.tearDownDriver(DriverManager.getDriver());
		

		

	}

	@AfterClass
	public void afterClass() {
		

	}

	@AfterTest
	public void afterTest() {

	}

	@AfterSuite
	public void afterSuite() {

	}

}
