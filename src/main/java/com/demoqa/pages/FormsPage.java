package com.demoqa.pages;

import org.openqa.selenium.By;

import com.demoqa.base.DemoQABase;

public class FormsPage extends DemoQABase{
	
	public void forms() {
		String form_locator=prop.getProperty("Form_Locator");
		driver.findElement(By.xpath(form_locator)).click();
	}
	
	public void practiceForm()
	{
		String form_locator=prop.getProperty("Form_Locator");
		String practiceform_locator=prop.getProperty("PracticeForm_Locator");
		
		driver.findElement(By.xpath(form_locator)).click();
		driver.findElement(By.xpath(practiceform_locator)).click();
		
	}
	
	public void formFilling()
	{
		String form_locator=prop.getProperty("Form_Locator");
		String practiceform_locator=prop.getProperty("PracticeForm_Locator");
		String name_locator=prop.getProperty("Name_Locator");
		String name_input=prop.getProperty("Name_Input");
		String lastname_locator=prop.getProperty("LastName_Locator");
		String lastname_input=prop.getProperty("LastName_Input");
		String email_locator=prop.getProperty("Email_Locator");
		String email_input=prop.getProperty("Email_Input");
		String gender_locator=prop.getProperty("Gender_Locator");
		String mobile_locator=prop.getProperty("Mobile_Locator");
		String mobile_input=prop.getProperty("Mobile_Input");
		String subject_locator=prop.getProperty("Subject_Locator");
		String subject_input=prop.getProperty("Subject_Input");
		
		
		driver.findElement(By.xpath(form_locator)).click();
		driver.findElement(By.xpath(practiceform_locator)).click();
		
		//Passing values to the form
		driver.findElement(By.xpath(name_locator)).sendKeys(name_input);
		driver.findElement(By.xpath(lastname_locator)).sendKeys(lastname_input);
		driver.findElement(By.xpath(email_locator)).sendKeys(email_input);
		driver.findElement(By.xpath(gender_locator)).click();
		driver.findElement(By.xpath(mobile_locator)).sendKeys(mobile_input);
		driver.findElement(By.xpath(subject_locator)).sendKeys(subject_input);
		

	}

}
