package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class ManageDeptPage  {
	
	//Locators of manage Department
	
	private static final By DeptTextField = By.xpath("//input[@class='text emptyCaption']"); //return this
	private static final By AddBtn = By.id("addUserGroupButton"); //return this
	private static final By CloseBtn = By.id("closeLightbox"); //return user page
	private static final By DeptText = By.xpath("//div[@title='Support']");
	
	
	
	//Methods For Manage Department
	
		public ManageDeptPage enterOnDeptTextField(String dept) throws InterruptedException
		{
			DriverManager.getDriver().findElement(DeptTextField).sendKeys(dept);
			Thread.sleep(3000l);
			return this;
		}
		public ManageDeptPage clickOnAddBtn() throws InterruptedException
		{
			DriverManager.getDriver().findElement(AddBtn).click();
			Thread.sleep(2000l);
			return this;
		}
		public UserPage clickOnCloseBtn()
		{
			DriverManager.getDriver().findElement(CloseBtn).click();
			return new UserPage();
		}
		
		public String cnfDeptMsg()
		{
			 return DriverManager.getDriver().findElement(DeptText).getText();
			
		}
	
		
		

}
