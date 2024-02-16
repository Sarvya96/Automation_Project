package Com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.ActiTimeLoginPage;

	
public class UserCreationTestCase extends BaseTest {
	
	private UserCreationTestCase()   {}
	
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
	
		
		String actRes = atlp.enterName("admin")
						.enterpassword("manager")
							.clinOnLoginBtn()
								.clickOnUser()
										.clickOnManageDept()
											.enterOnDeptTextField("Testing")
												.clickOnAddBtn()
													.clickOnCloseBtn().clickOnCreateNewUser().enterUname().enterFname()
														.enterLname().entermailId().enterPwd()
															.enterReTypePwd().selectDept().clickOnCreateUserBtn().getCnfMsg();	
		
		
		 //Validation Of Test Case
		
		   System.out.println("Actual Res : "+ actRes);
		   String ExpRes = "User account has been successfully created.";
		   Assert.assertEquals(actRes, ExpRes,"Expected res is not matching with actual res");
	}

}
