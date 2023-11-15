package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Homepage extends Testbase{

	public Homepage() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	//Inventory
	@FindBy(xpath="//i[contains(@class,'fa-houzz')]")
	WebElement Inventory;
	//all inventory
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[text()='All Inventory']")
	WebElement AllInventory;
	//movestock
	@FindBy(xpath="//ul[@class='treeview-menu']/li/a[contains(text(),'Move Stock')]")
	WebElement Movestock;
	//master
	@FindBy(xpath="//i[contains(@class,'fa-database')]")
	WebElement master; 
	//customer
	@FindBy(xpath="//i[contains(@class,'fa-users')]")
	WebElement customer;
	//all customers
	@FindBy(linkText="All Customers")
	WebElement allcustomer;
	//add customer
	@FindBy(linkText="Add Customer")
	WebElement addcustomer;
	//usertype
		@FindBy(xpath="//a[@href='/Master/Usertypes']")
		WebElement usertype;
	//holiday
		@FindBy(linkText="Holidays")
		WebElement holidays;
		
    public Homepage(WebDriver driver)throws Throwable
    {
    	PageFactory.initElements(driver,this);
    }
    public  Inventory inventory() throws Throwable
    {
    	Utils.moveToElement(Inventory);
    	AllInventory.click();	 
		return  new Inventory();
    }
   
	public  UserType usertype() throws Throwable {
 
 
  
    	Utils.moveToElement(master);
    	usertype.click();
		return new UserType();
	}
 
	public Holidays holidays() throws Throwable
	{
		Utils.moveToElement(master);
		holidays.click();
		return new Holidays();
		
	}
	public void addcustomer()
	{
		Utils.moveToElement(customer);
		addcustomer.click();
	}
	public void editcustomer()
	{
		Utils.moveToElement(customer);
		allcustomer.click();
	}
	
 
}