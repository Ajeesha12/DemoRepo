package com.noc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.noc.base.testbase;

public class Loginpage extends testbase {

	//page factory- OR (object repository)
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	@FindBy (xpath= "//input[@name='password']")
	WebElement password;
	@FindBy (xpath= "//button[text()='Login']")	
	WebElement login_button;
	//initializing page objects
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
		// PageFactory.initElements(driver, this)- to initialize pagefacoty, all
		//elements in this page initialized with driver	
	}
	public String validatetitle() {
	
		 return driver.getTitle();
		
		}
	
	public Homepage verifylogin(String un,String pwd){
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();	
	return new Homepage();
	
	}
	
	
	}

