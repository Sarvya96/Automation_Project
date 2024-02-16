package com.cs.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cs.Driver.DriverManager;

public class UserPage  {
	
	//Locators of manage Department
	private static final By ManageDept = By.xpath("//td[@id='ext-gen33']");
	private static final By DeptTextField = By.xpath("//input[@class='text emptyCaption']"); //return this
	private static final By AddBtn = By.id("addUserGroupButton"); //return this
	private static final By CloseBtn = By.id("closeLightbox"); //return user page
	
	//Methods For Manage Department
		public UserPage clickOnManageDept()
		{
			DriverManager.getDriver().findElement(ManageDept).click();
			return this;
		}
		public UserPage enterOnDeptTextField(String dept) throws InterruptedException
		{
			DriverManager.getDriver().findElement(DeptTextField).sendKeys(dept);
			Thread.sleep(3000l);
			return this;
		}
		public UserPage clickOnAddBtn() throws InterruptedException
		{
			DriverManager.getDriver().findElement(AddBtn).click();
			Thread.sleep(2000l);
			return this;
		}
		public UserPage clickOnCloseBtn()
		{
			DriverManager.getDriver().findElement(CloseBtn).click();
			return this;
		}
	
	//Locators Of Create New User Module
	private static final By CreateNewUser = By.xpath("//td[@id='ext-gen40']");
	private static final By Uname = By.name("username");
	private static final By Pwd = By.name("passwordText");
	private static final By ReTypePwd = By.name("passwordTextRetype");
	private static final By Fname = By.name("firstName");
	private static final By Lname = By.name("lastName");
	private static final By mailId = By.name("email");
//	private static final By UsersDept = By.name("userGroupId");
	private static final By CreateUserBtn = By.xpath("//input[@value='   Create User   '] ");
	private static final By CnfMsg = By.xpath("//*[text()='User account has been successfully created.']");
	private static final By user = By.xpath("//a[@href='/administration/useredit.do?noReload=false&userId=23']"); //href="/administration/useredit.do?noReload=false&userId=20"
	private static final By deleteMsg = By.xpath("//*[text()='User account has been successfully deleted.']");
	//private static final By DeleteUser = By.xpath("//input[@value='Delete This User']");
	
	//Method for Create User Module
	public UserPage clickOnCreateNewUser()
	{
		DriverManager.getDriver().findElement(CreateNewUser).click();
		return this;
	}
	public UserPage enterUname()
	{
		DriverManager.getDriver().findElement(Uname).sendKeys("Manager");
		return this;
	}
	public UserPage enterPwd()
	{
		DriverManager.getDriver().findElement(Pwd).sendKeys("manager123");
		return this;
	}
	public UserPage enterReTypePwd()
	{
		DriverManager.getDriver().findElement(ReTypePwd).sendKeys("manager123");
		return this;
	}
	public UserPage enterFname()
	{
		DriverManager.getDriver().findElement(Fname).sendKeys("Manual");
		return this;
	}
	public UserPage enterLname()
	{
		DriverManager.getDriver().findElement(Lname).sendKeys("Tester");
		return this;
	}
	public UserPage entermailId()
	{
		DriverManager.getDriver().findElement(mailId).sendKeys("manual@gmail.com");
		return this;
	}
	
	public UserPage selectDept()
	{
		WebElement element = DriverManager.getDriver().findElement(By.name("userGroupId"));
		Select select = new Select(element);
		select.selectByVisibleText("Testing");
		return this;
	}
	
	public UserPage clickOnCreateUserBtn()
	{
		DriverManager.getDriver().findElement(CreateUserBtn).click();
		return this;
	}
	
	public String getCnfMsg() throws InterruptedException
	{
		Thread.sleep(2000l);
		return DriverManager.getDriver().findElement(CnfMsg).getText();
	}
	public UserPage clickOnUser()
	{
		DriverManager.getDriver().findElement(user).click();
		return this;
	}
	public UserPage clickOnDeleteUser()
	{
	 WebElement e = DriverManager.getDriver().findElement(By.xpath("//input[@value='Delete This User']"));
	 e.click();
	 Alert al = DriverManager.getDriver().switchTo().alert();
	 al.dismiss();
	 return this;	 
	}
	
	public String deleteUsermsg() throws InterruptedException
	{
		Thread.sleep(2000l);
		return DriverManager.getDriver().findElement(deleteMsg).getText();
	}
	
}
