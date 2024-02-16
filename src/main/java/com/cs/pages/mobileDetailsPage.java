package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class mobileDetailsPage {

	//Locators 
	
	protected static final By price = By.xpath("(//*[text()='₹82,999'])[1]");

		public String getPrice()
	{
		return DriverManager.getDriver().findElement(price).getText();
	}
	

	
}
