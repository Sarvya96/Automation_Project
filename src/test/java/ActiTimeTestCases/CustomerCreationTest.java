package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

public class CustomerCreationTest extends BaseTest{

	@Test
	public void createCustAndProject()
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		
		String actMsg = atlp.enterName("Manager").enterpassword("manager")
											.clickOnLoginBtn().clickOnTasksOption()
												.clickOnProjectBtn().clickOnCreateCustomer()
												.enterCustomerName("Infosys").clickOnCreateCustomerbtn().getCustomerCreationSuccessMsg();
													
		
	
		//Validation Of Test Case
		
		String expMsg = "Customer \"Infosys\" has been successfully created.";
		System.out.println("CnfMsg :- "+ actMsg);
		Assert.assertEquals(actMsg, expMsg,"Actual msg does not match with ecxpected msg");
	}
}
