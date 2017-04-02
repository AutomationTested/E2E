package org.testingworld.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testingworld.base.CreateDriver;
import org.testingworld.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_002_Login_Logout_Negative_Credentials2 extends CreateDriver{
	
	
	@Test
	public void tc_002()
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername("uname");
		login.enterPassword("pass");
		//Assert.assertFalse(true);
	}

	

}
