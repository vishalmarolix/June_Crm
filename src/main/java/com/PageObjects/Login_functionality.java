package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Login_functionality extends Testbase {

	public Login_functionality() throws Throwable {
		super();
	}



	@FindBy (xpath="(//input[@class='form-control'])[1]")
	WebElement username;
	
	
	@FindBy (xpath="//input[@type='password']")
	WebElement password;
	
	
	@FindBy (xpath="//button[@class='btn green_btn']") 
	WebElement loginbutton;
	
	
	
	public Login_functionality(WebDriver driver)throws Throwable {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public Homepage Dologin() {
		
	username.sendKeys(props.getProperty("username"));	
	password.sendKeys(props.getProperty("password"));
	
	loginbutton.click();
	
	return new Homepage();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
