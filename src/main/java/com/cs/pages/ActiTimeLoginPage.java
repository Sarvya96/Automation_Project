package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class ActiTimeLoginPage {
	
	//Locators
	private static final By UserName = By.name("username");
	private static final By Password = By.name("pwd");
	private static final By LoginBtn = By.xpath("//a[@id='loginButton']");
	
	//Methods
	
	public ActiTimeLoginPage enterName(String name)
	{
		DriverManager.getDriver().findElement(UserName).sendKeys(name);
		return this;
	}
	
	public ActiTimeLoginPage enterpassword(String pwd)
	{
		DriverManager.getDriver().findElement(Password).sendKeys(pwd);
		return this;
	}
	
	public ActiTimeHomePage clinOnLoginBtn()
	{
		DriverManager.getDriver().findElement(LoginBtn).click();
		return new ActiTimeHomePage();
	}
}
