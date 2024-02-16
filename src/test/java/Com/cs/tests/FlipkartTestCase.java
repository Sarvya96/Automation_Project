package Com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.pages.FlipkartHomePage;

public final class FlipkartTestCase extends BaseTest{
	private  FlipkartTestCase()		{}
	
	@Test
	 public void searchTest() throws InterruptedException 
	 {
		FlipkartHomePage fhp = new FlipkartHomePage();
		
		String actPrice = fhp.enterWhatToSearch("Iphone 15 plus")
						.clickOnMobileName()
						.getPrice();
		
		System.out.println("Price : " + actPrice);
		String expPrice = "₹82,999";	
		Assert.assertEquals(actPrice, expPrice,"Price Does not match");
		
	 }
	
	
	
	
	
	
	
	
	
	
}
