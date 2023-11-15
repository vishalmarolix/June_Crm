package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjects.Login_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class Login_Test extends Testbase {

	private static final String Sheetname = "Sheet1";
	Login_Functionality lf;

	public Login_Test() throws Throwable {
		super();
	}

	@BeforeMethod

	public void setup() throws Throwable {

		Initialization();

		lf = new Login_Functionality(driver);

	}

	@Test

	public void Verifylogin() throws Throwable {

		lf.Dologin();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/", url);

	}

	@Test(dataProvider = "Data", dataProviderClass = Login_Test.class)
	public void verifyloginwithExcel(String Username, String Password) throws Throwable {

		lf.Dologinwithexcel(Username, Password);

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/", url);

	}

	@DataProvider

	public Object[][] Data() throws Throwable {
		Utils.ReadDataFromExcel(Sheetname);

		return Utils.ReadDataFromExcel(Sheetname);

	}

	@AfterMethod

	public void teardown() {

		//driver.close();

	}

}