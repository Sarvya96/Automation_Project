package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cs.Driver.DriverManager;

public class CreateTaskPage {
	//Locators of The Page
	//private static final By SelectCustomer = By.name("customerId"); 		        -->Done In Method
	//private static final By SelectProject = By.name("projectId");	   		        --> Done In Method
	private static final By TaskBox = By.name("task[0].name");
	//private static final By BillableBox = By.name("task[0].billingType");         -->Done In Method
	private static final By DeadLineBox = By.name("task[0].deadline");
	private static final By CreateBtn = By.xpath("//input[@value='Create Tasks']");
	
	
	

	
	//Method On the Page
	public CreateTaskPage selectCustomer()
	{
		WebElement element = DriverManager.getDriver().findElement(By.name("customerId"));
		Select select = new Select(element);
		select.selectByVisibleText("Tata Consultancy Services");
		return this;
	}
	
	public CreateTaskPage selectProject()
	{
		WebElement element = DriverManager.getDriver().findElement(By.name("projectId"));
		Select select = new Select(element);
		select.selectByVisibleText("Time Tracking Application");
		return this;
	}
	
	public CreateTaskPage enterInTaskBox()
	{
		DriverManager.getDriver().findElement(TaskBox).sendKeys("Create Login Page");
		return this;
	}
	
	public CreateTaskPage selectBillable()
	{
		WebElement element = DriverManager.getDriver().findElement(By.name("task[0].billingType"));
		Select select = new Select(element);
		select.selectByVisibleText("Billable");
		return this;
	}
	
	public CreateTaskPage enterInDeadlineBox()
	{
		DriverManager.getDriver().findElement(DeadLineBox).sendKeys("Mar 15 2024");
		return this;
	}
	
	public TaskPage clickOnCreateTaskBtn()
	{
		DriverManager.getDriver().findElement(CreateBtn).click();
		return new TaskPage();
	}
	
}
