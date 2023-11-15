package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Login_Functionality extends Testbase {

	public Login_Functionality() throws Throwable {
		super();
	}


	@FindBy(xpath = "//input[@placeholder='example@gmail.com']")
	WebElement username;

	@FindBy(xpath = "//input[@title='Please enter your password']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbutton;

	public Login_Functionality(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, this);

	}

	public void Dologin() throws Throwable {
		username.sendKeys(props.getProperty("username"));
		password.sendKeys(props.getProperty("password"));
		loginbutton.click();
		
	}

	public void Dologinwithexcel(String Username, String Password) throws Throwable {

		username.sendKeys(Username);
		password.sendKeys(Password);

		loginbutton.click();

		

	}
	
	
}
