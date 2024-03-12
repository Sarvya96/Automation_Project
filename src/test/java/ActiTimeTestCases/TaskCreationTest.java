package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class TaskCreationTest extends BaseTest{
	
	@Test
	public void createTask()
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		String actMsg = atlp.enterName("Manager").enterpassword("manager")
								.clickOnLoginBtn().clickOnTasksOption().clickOnCreateTask().selectCustomer().
								selectProject().enterInTaskBox().enterInDeadlineBox()
									.selectBillable().clickOnCreateTaskBtn().TaskCreationSuccessMsg();
		
		
		String expMsg ="1 new task was added to the customer \"Tata Consultancy Services\", project \"Time Tracking Application\".";
		System.out.println("Confirmation Msg :- "+ expMsg);
		Assert.assertEquals(actMsg, expMsg,"Actual msg is not matchig with expected msg");
		
	}
}
