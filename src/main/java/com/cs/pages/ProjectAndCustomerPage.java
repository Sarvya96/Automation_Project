package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class ProjectAndCustomerPage {

	//Locators of The Page
	private static final By CreateCustomer = By.xpath("//input[@onclick='addCustomer(this.form)']");
	private static final By CustomerCheckBox = By.name("customers[9]");
	private static final By DeleteCustomerBtn = By.xpath("//input[@value = 'Delete This Customer']");
	private static final By CustomerDeletionSuccessMsg = By.xpath("//span[@class ='successmsg']");
	private static final By CustomerCreationSuccessMsg = By.xpath("//span[@class='successmsg']");

private static final By DeleteBtn = By.xpath("//input[@value='Delete Selected']");//-->Common locator for customer and project
	
	private static final By Createproject = By.xpath("//input[@value='Create New Project']");
	private static final By ProjectCheckBox = By.name("projects[13]");	
	private static final By DeleteProject = By.id("deleteButton");
	private static final By ProjectDeletionSuccessMsg = By.xpath("//span[@class='successmsg']");
	private static final By ProjectCreationSuccessMsg = By.xpath("//span[@class='successmsg']");
	

	
	
	
	//Methods of the Page
	
	public CustomerPage clickOnCreateCustomer()
	{
		DriverManager.getDriver().findElement(CreateCustomer).click();
		return new CustomerPage();
	}
	
	public ProjectPage clickOnCreateProject()
	{
		DriverManager.getDriver().findElement(Createproject).click();
		return new ProjectPage();
	}
	
	public String getCustomerCreationSuccessMsg()
	{
		return DriverManager.getDriver().findElement(CustomerCreationSuccessMsg).getText();
	}
	

	public String getProjectCreationSuccessMsg()
	{
		return DriverManager.getDriver().findElement(ProjectCreationSuccessMsg).getText();
	}
	
	//other methods

	public ProjectAndCustomerPage clickOnCustomerCheckBox()
	{
		DriverManager.getDriver().findElement(CustomerCheckBox).click();
		return this;
	}
	
	public String CustomerDeletionSuccessMsg()
	{
		return DriverManager.getDriver().findElement(CustomerDeletionSuccessMsg).getText();
	}
	
	public ProjectAndCustomerPage clickOnProjectCheckBox()
	{
		DriverManager.getDriver().findElement(ProjectCheckBox).click();
		return this;
	}
	
	public ProjectAndCustomerPage clickOnDeleteProjectBtn() throws InterruptedException
	{
		DriverManager.getDriver().findElement(DeleteProject).click();
		Thread.sleep(2000l);
		return this;
	}
	
	public String getProjectDeletionSuccessMsg()
	{
		return DriverManager.getDriver().findElement(ProjectDeletionSuccessMsg).getText();
	}
	
	
	public ProjectAndCustomerPage clickOnDeleteBtn()
	{
		DriverManager.getDriver().findElement(DeleteBtn).click();
		return this;
	}
	
	public ProjectAndCustomerPage clickOnDeleteCustomerBtn() throws InterruptedException
	{
		DriverManager.getDriver().findElement(DeleteCustomerBtn).click();
		Thread.sleep(2000l);
		return this;
	}
}
