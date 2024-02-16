package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class ActiTimeHomePage {
	
	//Locator
	private static final By User = By.xpath("//a[@class='content users']");
	
	
	//Method
	public UserPage clickOnUser()
	{
		DriverManager.getDriver().findElement(User).click();
		return new UserPage();
	}
}
