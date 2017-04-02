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
		
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
	}
	
	
	@AfterMethod
	public void dropDriverObject()
	{
	    driver.quit();	
	}
	
	
}
