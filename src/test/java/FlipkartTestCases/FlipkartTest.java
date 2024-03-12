package FlipkartTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.DriverManager;

import BaseTestForAll.BaseTest;

public final class FlipkartTest extends BaseTest {
	private FlipkartTest()   {}
	
	@Test
	public void test1() throws InterruptedException
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Flipkart",Keys.ENTER);
		Thread.sleep(3000l);
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Ebay",Keys.ENTER);
		Thread.sleep(3000l);
	}
}

//Firstly we have written the test1() and test2() in the flipkart-Test 
//We have extended this class with base test to get the driver because driver is initialized in the base test