package FlipkartPages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;

public class FlipkartResultPage {
	
	//Locator
	private static final By MobileName = By.xpath("(//div[@class='_4rR01T'])[1]");
	
	//Method
	public mobileDetailsPage clickOnMobileName() 
	{
		DriverManager.getDriver().findElement(MobileName).click();	
		return new mobileDetailsPage();
	}
	

	
	
	
	
	
	
	
}
