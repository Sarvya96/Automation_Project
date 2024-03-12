package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cs.Driver.DriverManager;

public class CreateUserPage {

	//Locators Of Create New User Module
	
	private static final By Uname = By.name("username");
	private static final By Pwd = By.name("passwordText");
	private static final By ReTypePwd = By.name("passwordTextRetype");
	private static final By Fname = By.name("firstName");
	private static final By Lname = By.name("lastName");
	private static final By mailId = By.name("email");	
	//href="/administration/useredit.do?noReload=false&userId=20"
	private static final By CreateUserBtn = By.xpath("//input[@value='   Create User   '] ");
	
	
	
	//Method for Create User Module
	
	public CreateUserPage enterUname(String uname)
	{
		DriverManager.getDriver().findElement(Uname).sendKeys(uname);
		return this;
	}
	public CreateUserPage enterPwd(String pwd)
	{
		DriverManager.getDriver().findElement(Pwd).sendKeys(pwd);
		return this;
	}
	public CreateUserPage enterReTypePwd(String Rpwd)
	{
		DriverManager.getDriver().findElement(ReTypePwd).sendKeys(Rpwd);
		return this;
	}
	public CreateUserPage enterFname(String FisrtName)
	{
		DriverManager.getDriver().findElement(Fname).sendKeys(FisrtName);
		return this;
	}
	public CreateUserPage enterLname(String LastName)
	{
		DriverManager.getDriver().findElement(Lname).sendKeys(LastName);
		return this;
	}
	public CreateUserPage entermailId(String mail)
	{
		DriverManager.getDriver().findElement(mailId).sendKeys(mail);
		return this;
	}
	
	public CreateUserPage selectDept()
	{
		WebElement element = DriverManager.getDriver().findElement(By.name("userGroupId"));
		Select select = new Select(element);
		select.selectByVisibleText("Testing");
		return this;
	}
	
	public UserPage clickOnCreateUserBtn()
	{
		DriverManager.getDriver().findElement(CreateUserBtn).click();
		try {
			Thread.sleep(3000l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new UserPage();
	}
	
	
	
	
}
