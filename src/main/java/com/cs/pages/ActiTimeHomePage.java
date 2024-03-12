package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class ActiTimeHomePage {
	
	//Locator
	private static final By User = By.xpath("//a[@class='content users']");
	private static final By Tasks = By.xpath("(//td[@class='navItem relative'])[2]");
	
	//Method
	public UserPage clickOnUser()
	{
		DriverManager.getDriver().findElement(User).click();
		return new UserPage();
	}
	
	
	public TaskPage clickOnTasksOption()
	{
		DriverManager.getDriver().findElement(Tasks).click();
		return new TaskPage();
	}
}
