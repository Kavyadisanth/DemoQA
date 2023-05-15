package com.demoqa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.demoqa.base.DemoQABase;

public class WidgetsPage extends DemoQABase{

	public void widgets()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		driver.findElement(By.xpath(widget_locator)).click();
	}
	

	public void accordian()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		String accordian_locator=prop.getProperty("Accordian_Locator");
		String heading1_locator=prop.getProperty("Heading1_Locator");
		
		driver.findElement(By.xpath(widget_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(accordian_locator)).click();
		driver.findElement(By.xpath(heading1_locator)).click();
		
	}
	
	public void accordianHeading()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		String accordian_locator=prop.getProperty("Accordian_Locator");
		String heading3_locator=prop.getProperty("Heading3_Locator");
		
		driver.findElement(By.xpath(widget_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(accordian_locator)).click();
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath(heading3_locator)).click();
		
	}
	
	public void slider()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		String slider_locator=prop.getProperty("Slider_Locator");
		
		driver.findElement(By.xpath(widget_locator)).click();
		
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        
		driver.findElement(By.xpath(slider_locator)).click();
		
		
	}
	
	public void dragSlider()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		String slider_locator=prop.getProperty("Slider_Locator");
		String dragslider_locator=prop.getProperty("DragSlider_Locator");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath(widget_locator)).click();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(By.xpath(slider_locator)).click();
		WebElement slider=driver.findElement(By.xpath(dragslider_locator));
		((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','visibility:visible;');",slider);
		act.dragAndDropBy(slider, 25, 75).perform();
		
	}
	
	public void tabs()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		String tabs_locator=prop.getProperty("Tabs_Locator");
	
		driver.findElement(By.xpath(widget_locator)).click();

		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        
		driver.findElement(By.xpath(tabs_locator)).click();
	}
	
	public void originTab()
	{
		String widget_locator=prop.getProperty("Widget_Locator");
		String tabs_locator=prop.getProperty("Tabs_Locator");
		String origin_locator=prop.getProperty("OriginTab_Locator");

		driver.findElement(By.xpath(widget_locator)).click();

		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        
		driver.findElement(By.xpath(tabs_locator)).click();
		driver.findElement(By.xpath(origin_locator)).click();
	}
	
	
}
