package FlipkartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.cs.Driver.DriverManager;

public class FlipkartHomePage {
	
	//Locators 
	private static final By SearchBar = By.name("q");
	
	//method
	public FlipkartResultPage enterWhatToSearch(String search) throws InterruptedException
	{
		DriverManager.getDriver().findElement(SearchBar).sendKeys(search,Keys.ENTER);
		Thread.sleep(3000l);
		return new FlipkartResultPage();
	}
}
