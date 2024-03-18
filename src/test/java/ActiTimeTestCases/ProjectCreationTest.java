package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class ProjectDeletionTest extends BaseTest{

	@Test
	public void projectdeletion() throws InterruptedException
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		
		String actMsg = atlp.enterName("Manager").enterpassword("manager").clickOnLoginBtn().
						clickOnTasksOption().clickOnProjectBtn()
						.clickOnProjectName("Gaming Application").clickOnDeleteThisProjectBtn()
						.clickOnDeleteProjectBtn().getProjectDeletionSuccessMsg();
		
		System.out.println("Confirmation Msg :- "+ actMsg);
		
		//Validation Of Test Case
		String expMsg = "Project has been successfully deleted.";
		Assert.assertEquals(actMsg, expMsg,"Actual msg does not matched with expected msg");
	}
}
