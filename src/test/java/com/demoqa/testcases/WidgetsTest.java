package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.DemoQABase;
import com.demoqa.pages.WidgetsPage;


public class WidgetsTest {
	
DemoQABase demo;
	
	@BeforeMethod
	public void browserConfig()
	{
		demo=new DemoQABase();
		demo.initialization();
				
	}
	
	@Test
	public void validateWidgets()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.widgets();	
	}
	
	@Test
	public void validateAccordian()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.accordian();	
	}
	
	@Test
	public void validateAccordianHeading()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.accordianHeading();	
	}

	@Test
	public void validateSlider()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.slider();	
	}
	
	@Test
	public void validateDragSlider()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.dragSlider();	
	}
	
	@Test
	public void validateTabs()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.tabs();	
	}
	
	@Test
	public void validateOriginTabs()
	{
		WidgetsPage widget=new WidgetsPage();
		widget.originTab();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		demo=new DemoQABase();
		demo.tearDown();
	}
}
