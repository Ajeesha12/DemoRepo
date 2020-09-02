package com.noc.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.noc.base.testbase;
import com.noc.pages.Homepage;
import com.noc.pages.Loginpage;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class Loginpagetest extends testbase {
	Loginpage logpage;
	Homepage hpage;
	public Loginpagetest()
	{
		super();// calling testbaseclass constructor for initialize properties.using super keyword calling super(base) class
		
	}
		
	@BeforeMethod
	public void setup()
	{
		initialization();
		//calling the method from base class
		logpage= new Loginpage();
		
		}
	@Test (priority=1)
	public void titletest()
	{
		String title= logpage.validatetitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "ASPCL NOC Admin Portal");
		
	}
	@Test (priority=2)
	public void logintest()
	{
		 hpage= logpage.verifylogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
	
	public void close()
	{
		driver.quit();
	}
	

}
