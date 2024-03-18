package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class ProjectCreationTest extends BaseTest{

	@Test 
	public void createProject()
	{
			ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		
		String actMsg = atlp.enterName("Manager").enterpassword("manager")
											.clickOnLoginBtn().clickOnTasksOption()
												.clickOnProjectBtn().clickOnCreateProject()
												.selectCustomer().enterProjectname("Gaming Application").clickOnCreateProject()
												.getProjectCreationSuccessMsg();
		
		String expMsg = "Project \"Gaming Application\" has been successfully created.";
		System.out.println("Cnf Msg :- "+ expMsg);
		Assert.assertEquals(actMsg, expMsg,"Actual msg does not match with expected msg");
				
	}
}
