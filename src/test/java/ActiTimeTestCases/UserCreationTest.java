package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

@Test
public class UserCreationTest extends BaseTest{
	
	@Test
	public void createUserTest() throws InterruptedException
	{
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();
		
		String actMsg = atlp.enterName("admin").enterpassword("manager")
							.clickOnLoginBtn().clickOnUser().clickOnCreateNewUser()
								.enterUname("King").enterPwd("123").enterReTypePwd("123")
										.enterFname("virat").enterLname("kohli")
											.entermailId("vk@gmail.com").selectDept().clickOnCreateUserBtn()
												.getCnfMsg();
		
		//Validation Of Test Case
		
		String expMsg = "User account has been successfully created.";
		System.out.println("Confirmation Msg :- "+ expMsg);
		
		Assert.assertEquals(actMsg, expMsg,"Actual msg does not match with expected msg..");
	}
}
