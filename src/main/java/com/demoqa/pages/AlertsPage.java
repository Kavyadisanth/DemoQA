package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.demoqa.base.DemoQABase;

public class AlertsPage extends DemoQABase{
	
	public void alertsFramesWindows()
	{
		String alertsframes_locator=prop.getProperty("Alerts_Locator");
		String alerts_locator=prop.getProperty("Alert_Action_Locator");
		
		driver.findElement(By.xpath(alertsframes_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(alerts_locator)).click();
		
	}
	
	public void browserWindow()
	{
		String alerts_locator=prop.getProperty("Alerts_Locator");
		String browser_locator=prop.getProperty("Browser_Window_Locator");
		String newtab_locator=prop.getProperty("NewTab_Locator");
		
		driver.findElement(By.xpath(alerts_locator)).click();
		driver.findElement(By.xpath(browser_locator)).click();
		driver.findElement(By.xpath(newtab_locator)).click();
	}
	
	public void alerts()
	{
		String alertsframes_locator=prop.getProperty("Alerts_Locator");
		String alerts_locator=prop.getProperty("Alert_Action_Locator");
		String clickme_locator=prop.getProperty("ClickMe_Locator");
		
		driver.findElement(By.xpath(alertsframes_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(alerts_locator)).click();
		driver.findElement(By.xpath(clickme_locator)).click();
	}
	
	

}
