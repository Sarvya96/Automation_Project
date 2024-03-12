package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class TaskDeletionTest extends BaseTest {

	@Test
	public void deletetask()
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		
		String actMsg = atlp.enterName("Manager").enterpassword("manager").clickOnLoginBtn()
										.clickOnTasksOption().clickOnTaskCheckBoxBtn().clickOnDeleteSelectedTaskBtn()
										.clickOnDeleteTaskBtn().getTaskDeletionSuccessMsg();
											
		
		
		
		System.out.println("Cnf Msg :- "+ actMsg);
		
		String expMsg = "Selected tasks have been successfully deleted.";
		Assert.assertEquals(actMsg, expMsg,"Actual result not matched with Expected");
	}
}
