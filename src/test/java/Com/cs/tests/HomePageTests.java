package Com.cs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.DriverManager;

public final class HomePageTests extends BaseTest {
	private HomePageTests()   {}
	@Test
	public void test3() throws InterruptedException
	{
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Flipkart",Keys.ENTER);
		Thread.sleep(2000l);
	}
}

//We have extended this class with BaseTest to get the driver because driver is initialized in the base test
