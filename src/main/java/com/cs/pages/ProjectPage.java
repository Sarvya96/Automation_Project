package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cs.Driver.DriverManager;

public class ProjectPage extends CustomerPage {
	
	//Locators of the page 
	private static final By ProjectName = By.name("name");
	private static final By CreateProject = By.name("createProjectSubmit");
	
	
	//Methods of The page
	public ProjectPage enterProjectname(String name)
	{
		DriverManager.getDriver().findElement(ProjectName).sendKeys(name);
		return this;
	}
	
	public ProjectAndCustomerPage clickOnCreateProject()
	{
		DriverManager.getDriver().findElement(CreateProject).click();
		return new ProjectAndCustomerPage();
	}
	
	public ProjectPage selectCustomer()
	{
		WebElement element = DriverManager.getDriver().findElement(By.name("customerId"));
		Select select = new Select(element);
		select.selectByVisibleText("Infosys");
		return this;
	}
	
	
	
}
