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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_Login_Logout_Positive_Credentials extends CreateDriver{
	
	
	@Test(dataProvider="dp2")
	public void tc_001(String uname, String pass)
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
	}

	
	@DataProvider(name="dp2")
	public Object[][] testDataExcel() throws IOException
	{
		File f = new File("./InputTestData/Input.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet s1 = wk.getSheet("Sheet1");
		int r = s1.getPhysicalNumberOfRows();
		Object [][] testdata = new Object[r][2];
		
		
		for(int i=0;i<r;i++)
		{
			XSSFRow r1 =s1.getRow(i);
			XSSFCell un = r1.getCell(0);
			XSSFCell ps = r1.getCell(1);
			testdata[i][0]=un.getStringCellValue();
			testdata[i][1]=ps.getStringCellValue();
		}
		
		return testdata;
		
	}
	
	@DataProvider(name="dp1")
	public Object[][] testData()
	{
		Object [][] testdata= {
				                 {"uname1","pas1"},
				                 {"uname2","pass2"},
				                 {"uname3","pass3"}
	                          };
		return testdata;
	}
	
}
