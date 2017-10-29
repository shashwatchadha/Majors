package com.mySeleniumFrameWork.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mySeleniumFrameWork.baseSetUp.DriverManager;
import com.mySeleniumFrameWork.baseSetUp.MyMap;
import com.mySeleniumFrameWork.baseSetUp.SetUp;

public class TC_1 extends SetUp{
	
	
	
	
	

	
	@Test()
	public void testCase11() throws InterruptedException
	{
		System.out.println("test case 11");
		hash.put("testCase11","testCase11");
		
		
		MyMap.getMapLocal().put("testCase11","testCase11");
		
		
		DriverManager.getDriver().findElement(By.id("lst-ib")).sendKeys("thet");
		Thread.sleep(5000);
		System.out.println(hash.get("testCase11")+"#################1");
		System.out.println(MyMap.getMapLocal().get("testCase11")+"#################1__________");
		System.out.println(MyMap.getMapLocal().get("shashwat")+"#################1________shashwat__");
	}

	@Test()
	public void testCase12() throws InterruptedException
	{hash.put("testCase11","testCase12");
	MyMap.getMapLocal().put("testCase11","testCase12");
		System.out.println("test case 12");
		DriverManager.getDriver().findElement(By.id("lst-ib")).sendKeys("ttdfbvcb");
		Thread.sleep(5000);
		System.out.println(hash.get("testCase11")+"#########2");
		System.out.println(MyMap.getMapLocal().get("testCase11")+"#################2__________");
	}

	
	@Test(priority=3)
	public void testCase10() throws InterruptedException
	{hash.put("testCase11","testCase10");
	MyMap.getMapLocal().put("testCase11","testCase10");
		System.out.println("test case 10");
		DriverManager.getDriver().findElement(By.id("lst-ib")).sendKeys("thet");
		Thread.sleep(5000);
		System.out.println(hash.get("testCase11")+"########3");
		System.out.println(MyMap.getMapLocal().get("testCase11")+"#################3___________");
	}

	@Test(priority=4)
	public void testCase20() throws InterruptedException
	{
		System.out.println("test case 20");
		DriverManager.getDriver().findElement(By.id("lst-ib")).sendKeys("ttdfbvcb");
		Thread.sleep(5000);
		System.out.println(hash.get("testCase11")+"########3");
		System.out.println(MyMap.getMapLocal().get("testCase11")+"#################3___________");
		
	}
	
	
	
	
	@Test(priority=5)
	public void testCase1() throws InterruptedException
	{
		System.out.println("test case 1");
		DriverManager.getDriver().findElement(By.id("lst-ib")).sendKeys("thet");
		Thread.sleep(5000);
	}

	@Test(priority=6)
	public void testCase2() throws InterruptedException
	{
		System.out.println("test case 1");
		DriverManager.getDriver().findElement(By.id("lst-ib")).sendKeys("ttdfbvcb");
		Thread.sleep(5000);
	}
}
