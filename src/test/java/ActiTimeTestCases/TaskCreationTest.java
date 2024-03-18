package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class TaskCreationTest extends BaseTest{
	
	@Test
	public void createTask() throws InterruptedException
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		String actMsg = atlp.enterName("Manager").enterpassword("manager")
								.clickOnLoginBtn().clickOnTasksOption().clickOnCreateTask().selectCustomer().
								selectProject().enterInTaskBox().
									clickOnCreateTaskBtn().TaskCreationSuccessMsg();
		
		
		//Validation Of Test Case
		String customer = "\"Tata Consultancy Services\"";
		String project = "\"Time Tracking Application\"";
		
		String expMsg ="1 new task was added to the customer "+customer+", "+"project "+project+".";
		System.out.println("Confirmation Msg :- "+ expMsg);
		Assert.assertEquals(actMsg, expMsg,"Actual msg is not matchig with expected msg");
		
	}
}
