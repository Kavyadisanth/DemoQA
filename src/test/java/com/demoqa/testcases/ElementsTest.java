package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.DemoQABase;
import com.demoqa.pages.ElementsPage;


public class ElementsTest {
DemoQABase demo;
	
	@BeforeMethod
	public void browserConfig()
	{
		demo=new DemoQABase();
		demo.initialization();
				
	}
	
	@Test
	public void validateElements()
	{
	ElementsPage elements=new ElementsPage();
		elements.elements();	
	}
	
	@Test
	public void validateTextBox()
	{
	ElementsPage elements=new ElementsPage();
		elements.textbox();	
	}
	
	@Test
	public void validateCheckBox()
	{
	ElementsPage elements=new ElementsPage();
		elements.checkBox();	
	}
	
	@Test
	public void validateRadioButton()
	{
	ElementsPage elements=new ElementsPage();
		elements.radioButton();	
	}
	
	@Test
	public void validateButton()
	{
	ElementsPage elements=new ElementsPage();
		elements.buttons();	
	}
	
	@Test
	public void validateDownload()
	{
	ElementsPage elements=new ElementsPage();
		elements.download();	
	}
	
	@Test
	public void validateUpload()
	{
	ElementsPage elements=new ElementsPage();
		elements.upload();	
	}
	
	@Test
	public void validateLink()
	{
	ElementsPage elements=new ElementsPage();
		elements.link();	
	}
	
	@Test
	public void validateBrokenLink()
	{
	ElementsPage elements=new ElementsPage();
		elements.brokenLink();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		demo=new DemoQABase();
		demo.tearDown();
	}
}
