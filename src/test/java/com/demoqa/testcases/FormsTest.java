package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.DemoQABase;
import com.demoqa.pages.FormsPage;



public class FormsTest {
DemoQABase demo;
	
	@BeforeMethod
	public void browserConfig()
	{
		demo=new DemoQABase();
		demo.initialization();
				
	}
	
	@Test
	public void validateForm()
	{
		FormsPage form=new FormsPage();
		form.forms();	
	}
	
	@Test
	public void validatePracticeForm()
	{
		FormsPage form=new FormsPage();
		form.practiceForm();	
	}
	

	
	@Test
	public void validateFormFilling()
	{
		FormsPage form=new FormsPage();
		form.formFilling();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		demo=new DemoQABase();
		demo.tearDown();
	}
	
}
