package org.testingworld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(By.id("email")).sendKeys(password);
	}
	
	public void clickSignin()
	{
		driver.findElement(By.id("email")).click();;
	}
}
