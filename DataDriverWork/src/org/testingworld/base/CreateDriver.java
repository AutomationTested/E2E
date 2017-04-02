/*
 * Name : Nitin T
 * Description : This class is for maintaining drives
 * Date : 
 */

package org.testingworld.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CreateDriver {
    public WebDriver driver;
	
    
	@BeforeMethod
	public void initiateWebdriver()
	{
		ResourceBundle config= ResourceBundle.getBundle("Config");
		if(config.getString("browserName").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(config.getString("browserName").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.get(config.getString("applicationURL"));
	}
	
	
	@AfterMethod
	public void dropDriverObject()
	{
	    driver.quit();	
	}
	
	
}
