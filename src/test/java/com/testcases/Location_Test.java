package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjects.Location_pageobjects;
import com.PageObjects.Login_Functionality;
import com.base.Testbase;

public class Location_Test extends Testbase {
	public Location_pageobjects lp;
	public Login_Functionality lf;

	public Location_Test() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws Throwable {
		Initialization();

		lf = new Login_Functionality(driver);
		
		lf.Dologin();

		lp = new Location_pageobjects(driver);
	}

	@Test
	public void validateLocation() throws Throwable {
		lp.verifyLocation();
	}
}