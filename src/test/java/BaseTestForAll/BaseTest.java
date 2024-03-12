package BaseTestForAll;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cs.Driver.Driver;

public class BaseTest{
	protected BaseTest()  {}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		Driver.initDriver();
	}
	@AfterMethod
	protected void tearDown()
	{	
		Driver.quitDriver();
	} 
}
 
//In BaseTest() we have used the before method and after method and we have initialized the driver here
//In Basetest() now, we are calling initDriver() and qiutDriver() which are present in driver class
//before and after method are applicable for all the test which are present in flipkart test and homepage test
