package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class CustomerPage {
	
	//Locators of the Page
	private static final By CustomerName= By.name("name");
	private static final By CreateCustomerBtn = By.name("createCustomerSubmit");
	
	//Method Of the Page
	
	public CustomerPage enterCustomerName(String name)
	{
		DriverManager.getDriver().findElement(CustomerName).sendKeys(name);
		return this;
	}
	
	public ProjectAndCustomerPage clickOnCreateCustomerbtn()
	{
		DriverManager.getDriver().findElement(CreateCustomerBtn).click();
		return new ProjectAndCustomerPage();
	}
	
}
