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
										.clickOnTasksOption().clickOnTaskName("Create Logout Feature")
											.clickOnDeleteThisTaskBtn().clickOnDeleteTaskBtn()
													.getTaskDeletionSuccessMsg();
											
		
		
		
		System.out.println("Cnf Msg :- "+ actMsg);
		
		String expMsg = "Task has been successfully deleted.";
		Assert.assertEquals(actMsg, expMsg,"Actual result not matched with Expected");
	}
}
