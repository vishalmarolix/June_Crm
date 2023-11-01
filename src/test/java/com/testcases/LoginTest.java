package com.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjects.Login_functionality;
import com.Utils.ExcelUtils;
import com.base.Testbase;

public class LoginTest extends Testbase {

	Login_functionality lf;

	public LoginTest() throws Throwable {
		super();
	}

	@BeforeMethod

	public void setup() throws Throwable {

		Initialization();

		lf = new Login_functionality(driver);

	}

	@Test

	public void Verifylogin() {

		lf.Dologin();

		String url = driver.getCurrentUrl();

		Assert.assertEquals("http://empirehome.myprojectsonline.co.in/EmpireHome/", url);

	}
	@DataProvider 
	public  Object[][] getdata(String sheet) throws IOException
	{
		return ExcelUtils.getdatafromexcel(sheet);
	}

	@AfterMethod

	public void teardown() {

		//driver.close();

	}

}
