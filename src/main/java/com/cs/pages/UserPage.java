package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class UserPage {
	private static final By ManageDept = By.xpath("//div[@id='ext-comp-1003']");
	private static final By CreateNewUser = By.xpath("//td[@id='ext-gen40']");
	private static final By CnfMsg = By.xpath("//*[text()='User account has been successfully created.']");
	private static final By user = By.xpath("//a[@href='/administration/useredit.do?noReload=false&userId=30']");

	
		public ManageDeptPage clickOnManageDept()
		{
		DriverManager.getDriver().findElement(ManageDept).click();
		return new ManageDeptPage();
		}
	
		public CreateUserPage clickOnCreateNewUser()
		{
		DriverManager.getDriver().findElement(CreateNewUser).click();
		return new CreateUserPage();
		}
			
		public String getCnfMsg() throws InterruptedException
		{
			Thread.sleep(2000l);
			return DriverManager.getDriver().findElement(CnfMsg).getText();
		}
		
		public DeletePage clickOnUser()
		{
			DriverManager.getDriver().findElement(user).click();
			return new DeletePage();
		}

	
}
