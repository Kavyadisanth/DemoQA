package com.demoqa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoqa.base.DemoQABase;

public class ElementsPage extends DemoQABase {

	public void elements() {
		String elements_locator=prop.getProperty("Elements_Locator");
		driver.findElement(By.xpath(elements_locator)).click();
	}
	
	public void textbox() {
		
		String elements_locator=prop.getProperty("Elements_Locator");
		String textbox_locator=prop.getProperty("TextBox_Locator");
		String fullname_locator=prop.getProperty("FullName_Locator");
		String fullname_input=prop.getProperty("FullName_Input");
		String email_locator=prop.getProperty("Email_Locator");
		String email_input=prop.getProperty("Email_Input");
		String caddress_locator=prop.getProperty("CurrentAddress_Locator");
		String caddress_input=prop.getProperty("CurrentAddress_Input");
		String paddress_locator=prop.getProperty("PermanentAddress_Locator");
		String paddress_input=prop.getProperty("PermanentAddress_Input");
		String submitbutton_locator=prop.getProperty("SubmitButton_Locator");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		driver.findElement(By.xpath(elements_locator)).click();
		driver.findElement(By.xpath(textbox_locator)).click();
		
		//Passing values to the textbox
		driver.findElement(By.xpath(fullname_locator)).sendKeys(fullname_input);
		driver.findElement(By.xpath(email_locator)).sendKeys(email_input);
		driver.findElement(By.xpath(caddress_locator)).sendKeys(caddress_input);
		driver.findElement(By.xpath(paddress_locator)).sendKeys(paddress_input);
		WebElement submitbutton=driver.findElement(By.xpath(submitbutton_locator));
		js.executeScript("arguments[0].scrollIntoView();", submitbutton);
        submitbutton.click();
		
	}
	
	public void checkBox() {
		String elements_locator=prop.getProperty("Elements_Locator");
		String checkbox_locator=prop.getProperty("CheckBox_Locator");
		String home_locator=prop.getProperty("Home_Locator");
		
		driver.findElement(By.xpath(elements_locator)).click();
		driver.findElement(By.xpath(checkbox_locator)).click();
		driver.findElement(By.xpath(home_locator)).click();
		
	}
	
	public void radioButton()
	{
		String elements_locator=prop.getProperty("Elements_Locator");
		String radiobutton_locator=prop.getProperty("RadioButton_Locator");
		String impressive_locator=prop.getProperty("Impressive_Locator");
		
		driver.findElement(By.xpath(elements_locator)).click();
		driver.findElement(By.xpath(radiobutton_locator)).click();
		
		driver.findElement(By.xpath(impressive_locator)).click();
		
	}
	
	public void buttons() {
		String elements_locator=prop.getProperty("Elements_Locator");
		String button_locator=prop.getProperty("Button_Locator");
		String doubleclick_locator=prop.getProperty("DoubleClick_Locator");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath(elements_locator)).click();		
        WebElement button= driver.findElement(By.xpath(button_locator));
       
      //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", button);
        button.click();
      
       //Performing Double click action
		WebElement ele = driver.findElement(By.xpath(doubleclick_locator)); 
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public void download() {
		String elements_locator=prop.getProperty("Elements_Locator");
		String uploaddownload_locator=prop.getProperty("UploadDownload_Locator");
		String download_locator=prop.getProperty("Download_Locator");
		
		driver.findElement(By.xpath(elements_locator)).click();
		
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
        driver.findElement(By.xpath(uploaddownload_locator)).click();   
        driver.findElement(By.xpath(download_locator)).click();	
		
	}
	
	public void upload() {
		String elements_locator=prop.getProperty("Elements_Locator");
		String uploaddownload_locator=prop.getProperty("UploadDownload_Locator");
		String upload_locator=prop.getProperty("Upload_Locator");
		
		driver.findElement(By.xpath(elements_locator)).click();
		
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        
		driver.findElement(By.xpath(uploaddownload_locator)).click();
		   act.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath(upload_locator)).click();
		
		try {
			Robot rb=new Robot();
			rb.delay(2000);
			
			StringSelection ss=new StringSelection(" C:\\\\Users\\\\disan\\\\OneDrive\\\\Documents\\\\KAVYA M(25-01-23).pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		public void link()
		{
			String elements_locator=prop.getProperty("Elements_Locator");
			String link_locator=prop.getProperty("Link_Locator");
			String homelink_locator=prop.getProperty("HomeLink_Locator");
			
			driver.findElement(By.xpath(elements_locator)).click();
  
			Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform();
	        
			driver.findElement(By.xpath(link_locator)).click();
			driver.findElement(By.xpath(homelink_locator)).click();
			
		}
		
		public void brokenLink()
		{
			String elements_locator=prop.getProperty("Elements_Locator");
			String brokenlink_locator=prop.getProperty("BrokenLink_Locator");
			String broken_link_locator=prop.getProperty("Broken_Link_Locator");
			
			driver.findElement(By.xpath(elements_locator)).click();
			Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform();
			driver.findElement(By.xpath(brokenlink_locator)).click();
			driver.findElement(By.xpath(broken_link_locator)).click();
			  
			
		}

		
		
		
	}
	


