package com.mySeleniumFrameWork.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mySeleniumFrameWork.baseSetUp.DriverManager;
import com.mySeleniumFrameWork.baseSetUp.SetUp;

public class TC_2 extends SetUp {
	
	
	
	
	
	@Test(priority=8)
	public void testcase3() throws InterruptedException
	{
		System.out.println("testcase 2 cllass2");
		DriverManager.getDriver().findElement(By.xpath("//*[text()='Gmail']")).click();
		Thread.sleep(5000);
	}

	
	@Test(priority=3)
	public void testcase4() throws InterruptedException
	{
		System.out.println("testcase 2 class2");
		DriverManager.getDriver().findElement(By.xpath("//*[text()='Gmail']")).click();
		Thread.sleep(5000);
	}

	@Test(priority=2)
	public void testcase5() throws InterruptedException
	{
		System.out.println("testcase 5 classs2");
		DriverManager.getDriver().findElement(By.xpath("//*[text()='Gmail']")).click();
		Thread.sleep(5000);
	}

	
	@Test(priority=4)
	public void testcase6() throws InterruptedException
	{
		System.out.println("testcase 6   classsssssss 2");
		DriverManager.getDriver().findElement(By.xpath("//*[text()='Gmail']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void testcase7() throws InterruptedException
	{
		System.out.println("testcase 7  classss 2");
		DriverManager.getDriver().findElement(By.xpath("//*[text()='Gmail']")).click();
		Thread.sleep(5000);
	}

	
	@Test(priority=1)
	public void testcase1() throws InterruptedException
	{
		System.out.println("testcase 8 classs 2");
		DriverManager.getDriver().findElement(By.xpath("//*[text()='Gmail']")).click();
		Thread.sleep(5000);
	}


}
