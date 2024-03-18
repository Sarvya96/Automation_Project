package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class DepartmentCreationTest extends BaseTest{
		
	@Test
	public void createDepartment() throws InterruptedException
	{
		ActiTimeLoginPage atp = new ActiTimeLoginPage();
		
		String actualText = atp.enterName("admin").enterpassword("manager")
									.clickOnLoginBtn().clickOnUserHeaderBtn()
										.clickOnManageDept().enterOnDeptTextField("Support")
										.clickOnAddBtn().cnfDeptMsg();
		
		
		//Validation Of Test Case
		String expText = "Support";
		System.out.println("Text :- "+ expText);
		Assert.assertEquals(actualText, expText,"Actual Text is not Matching with the Expected Text");
		
	}
	
}


