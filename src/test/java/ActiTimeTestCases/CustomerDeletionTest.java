package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class CustomerDeletionTest extends BaseTest{

	@Test
	public void deleteCustomer() throws InterruptedException
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		
		String actMsg = atlp.enterName("Manager").enterpassword("manager")
								.clickOnLoginBtn().clickOnTasksOption()
									.clickOnProjectBtn().clickOnCustomerCheckBox()
										.clickOnDeleteBtn().clickOnDeleteCustomerBtn()
											.CustomerDeletionSuccessMsg();
		
		System.out.println("Confirmation Msg :- "+ actMsg);
		
		//Validation of Test Case
		String expMsg = "Selected customers have been successfully deleted.";
		Assert.assertEquals(actMsg, expMsg,"Actual msg does not matched with expected msg");
		
		
						
	}
}
