package ActiTimeTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

import BaseTestForAll.BaseTest;

	
public class UserDeletionTest extends BaseTest {
	
	private UserDeletionTest()   {}
	
	@Test
	public void userCreationTest() throws InterruptedException
	{
		
		//Verifying Test Case...
		ActiTimeLoginPage atlp = new ActiTimeLoginPage();

/* 
 		UserPage athp = atlp.enterName("admin")
								.enterpassword("manager")
								.clinOnLoginBtn()
								.clickOnUser()
								.clickOnManageDept()
								.enterOnDeptTextField("Testing")
								.clickOnAddBtn()
								.clickOnCloseBtn().clickOnCreateNewUser().enterUname("Manager").enterFname("Manual")
								.enterLname("Tester").entermailId("Manual@gmail.com").enterPwd("manual123")
								.enterReTypePwd("manual123").selectDept().clickOnCreateUserBtn();
 */	
	
		
		String actMsg = atlp.enterName("Manager")
								.enterpassword("manager")
									.clickOnLoginBtn().clickOnUserHeaderBtn()
									   	.clickOnUser("Tulangekar, Sarvesh (Sarvya)").clickOnDeleteUser().alrtAccept().deleteUsermsg();
				
	/*
				System.out.println("Actual Msg : "+actMsg);
				String expMsg ="User account has been successfully created.";
				Assert.assertEquals(actMsg, expMsg,"Msg does not match");
	*/			
				
				System.out.println("Actual Msg : "+actMsg);
				String expMsg ="User account has been successfully deleted.";
				Assert.assertEquals(actMsg, expMsg,"Msg does not match");
		
	}
	
}
