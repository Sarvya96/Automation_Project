package com.cs.Driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import utils.ReadPropertyFile;

public final class Driver
{
	private Driver() {}
		
	public static void initDriver() throws Exception
	{
		if(Objects.isNull(DriverManager.getDriver()))
		{
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(ReadPropertyFile.get("url"));
			
			//DriverManager.getDriver().get("https://www.google.com/");
			DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		} 
	}
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
		
	}
}

//In this class we had all the material regarding driver and driver method 