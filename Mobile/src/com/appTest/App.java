package com.appTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class App {
	
	private static AndroidDriver driver;
	@BeforeClass
	public static void seleniumsetup() throws MalformedURLException
	{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		
		capabilities.setCapability("deviceName", "Android Device");
		
		capabilities.setCapability("plateformVersion", "6.0");
		
		capabilities.setCapability("PlateformName", "Android");
		
		capabilities.setCapability("appPackage", "org.nativescript.nativescriptui");
		capabilities.setCapability("appActivity", "com.tns.NativeScriptActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(200L, TimeUnit.SECONDS);
	}
	
	

	@Test(priority=1)
	public void FirstTestCase() throws InterruptedException
	{
		for(int i=0; i<=10; i++)
		{
			driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(1000);
		}
		
		
	}
	
	@Test(priority=2)
	public void secondTestCase()
	{
		System.out.println("The App page heading is:::" +driver.findElement(By.className("android.widget.TextView")).getText());
	}
	

	@Test(priority=3)
	public void ThirdTestCase() throws InterruptedException
	{
		for(int i=0; i<=10; i++)
		{
			driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(1000);
		}
		
		
	}

	@Test(priority=4)
	public void FourthTestCase() throws InterruptedException
	{
		for(int i=0; i<=20; i++)
		{
			driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(1000);
		}
		
		
	}
	
	@Test(priority=5)
	public void FifthTestCase() throws InterruptedException
	{
		System.out.println(driver.findElement(By.name("Hoorraaay! You unlocked the NativeScript clicker achievement!")).getText());
		
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=6)
	public void SixthTestCase()
	{
		
		((AppiumDriver)driver).closeApp();
		
	}
	
	
}
