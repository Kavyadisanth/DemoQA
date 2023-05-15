package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.DemoQABase;
import com.demoqa.pages.AlertsPage;


public class AlertsTest {

DemoQABase demo;
	
	@BeforeMethod
	public void browserConfig()
	{
		demo=new DemoQABase();
		demo.initialization();
				
	}
	
	@Test
	public void validateAlertsFramesWindows()
	{
		AlertsPage alert=new AlertsPage();
		alert.alertsFramesWindows();	
	}
	
	@Test
	public void validateBrowserWindow()
	{
		AlertsPage alert=new AlertsPage();
		alert.browserWindow();	
	}
	
	@Test
	public void validateAlerts()
	{
		AlertsPage alert=new AlertsPage();
		alert.alerts();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		demo=new DemoQABase();
		demo.tearDown();
	}
}
