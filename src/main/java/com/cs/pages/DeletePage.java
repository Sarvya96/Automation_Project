package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cs.Driver.DriverManager;

public class DeletePage {

	private static final By DeleteUser = By.xpath("//input[@value='Delete This User']");
	private static final By deleteMsg = By.xpath("//*[text()='User account has been successfully deleted.']");
	
	
	public DeletePage clickOnDeleteUser()
	{
	 DriverManager.getDriver().findElement(DeleteUser).click();
	 return this;	 
	}
	
	public DeletePage alrtAccept() {
	    DriverManager.getDriver().switchTo().alert().accept();
	    return this;
	}
	
	public DeletePage alrtDismiss() {
	    DriverManager.getDriver().switchTo().alert().dismiss();
	    return this;
	}
	
	public String deleteUsermsg() throws InterruptedException
	{
		Thread.sleep(2000l);
		return DriverManager.getDriver().findElement(deleteMsg).getText();
	}
}
