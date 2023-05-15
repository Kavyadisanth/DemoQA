package com.demoqa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.base.DemoQABase;
import com.demoqa.pages.InteractionsPage;


public class InteractionsTest {
DemoQABase demo;
	
	@BeforeMethod
	public void browserConfig()
	{
		demo=new DemoQABase();
		demo.initialization();
				
	}
	
	@Test
	public void validateInteractions()
	{
		InteractionsPage interaction=new InteractionsPage();
		interaction.interactions();	
	}
	
	@Test
	public void validateSortable()
	{
		InteractionsPage interaction=new InteractionsPage();
		interaction.sortable();	
	}
	
	@Test
	public void validateSelectable()
	{
		InteractionsPage interaction=new InteractionsPage();
		interaction.selectable();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		demo=new DemoQABase();
		demo.tearDown();
	}

}
