package com.cs.pages;

import org.openqa.selenium.By;
import com.cs.Driver.DriverManager;

public class TaskPage {
	
	//Locators Of the Page
	
	private static final By CreateNewTask = By.xpath("//input[@value='Create New Tasks']");
	//private static final By confirmationMsg = By.xpath("//*[text()='//cnfmsg = 1 new task was added to the customer \"Tata Consultancy Services\", project \"Time Tracking Application\"'.]");
	//private static final By ConfirmationMsg =By.xpath("//*[text()='Create Login Page']");
	private static final By TaskCheckBox = By.name("taskSelected[56]");
	private static final By DeleteSelectedTaskBtn = By.xpath("//input[@value='Delete Selected Tasks']");
	private static final By DeleteTask = By.xpath("//input[@value='Delete Task']");
	private static final By TaskDeletionMsg = By.xpath("//span[@class='successmsg']");
	
	
	private static final By TaskCreationConfirmationMsg = By.xpath("//span[@class='successmsg']");
	private static final By Project = By.linkText("Projects & Customers");
	

	
	
	

	
	//Methods Of The Page
	
	public CreateTaskPage clickOnCreateTask()
	{
		DriverManager.getDriver().findElement(CreateNewTask).click();
		return new CreateTaskPage();
	}
	
	public String TaskCreationSuccessMsg()
	{
		return DriverManager.getDriver().findElement(TaskCreationConfirmationMsg).getText();
	}
	
	public ProjectAndCustomerPage clickOnProjectBtn()
	{
		DriverManager.getDriver().findElement(Project).click();
		return new ProjectAndCustomerPage();
	}
	
	public TaskPage clickOnDeleteTaskBtn()
	{
		DriverManager.getDriver().findElement(DeleteTask).click();
		return this;
	}
	
	public String getTaskDeletionSuccessMsg()
	{
		return DriverManager.getDriver().findElement(TaskDeletionMsg).getText();
	}
	
	public TaskPage clickOnTaskCheckBoxBtn()
	{
		DriverManager.getDriver().findElement(TaskCheckBox).click();
		return this;
	}
	
	public TaskPage clickOnDeleteSelectedTaskBtn()
	{
		DriverManager.getDriver().findElement(DeleteSelectedTaskBtn).click();
		return this;
	}
}
