package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.demoqa.base.DemoQABase;

public class InteractionsPage extends DemoQABase{
	
	public void interactions()
	{
		String interactions_locator=prop.getProperty("Interactions_Locator");
		
		driver.findElement(By.xpath(interactions_locator)).click();
	}

	public void sortable()
	{
		String interactions_locator=prop.getProperty("Interactions_Locator");
		String sortable_locator=prop.getProperty("Sortable_Locator");
		String grid_locator=prop.getProperty("Grid_Locator");
		
		driver.findElement(By.xpath(interactions_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(sortable_locator)).click();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath(grid_locator)).click();
	}
	
	public void selectable()
	{
		String interactions_locator=prop.getProperty("Interactions_Locator");
		String selectable_locator=prop.getProperty("Selectable_Locator");
		String list_locator=prop.getProperty("List_Locator");
		
		driver.findElement(By.xpath(interactions_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(selectable_locator)).click();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath(list_locator)).click();
	}
}
