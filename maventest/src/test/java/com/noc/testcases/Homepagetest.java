package com.noc.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.noc.base.testbase;
import com.noc.pages.Homepage;
import com.noc.pages.Loginpage;

public class Homepagetest extends testbase {

	Loginpage login_page;
	Homepage home_page;
public Homepagetest() 
{
	super();
}
// testcases should be independent, before every test launch and after test close the browser
		
	@BeforeMethod
	public void setup()
	{
		initialization();
		login_page=new Loginpage();
		home_page=login_page.verifylogin(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test
	public void verify_title() {
		
		
		String title= home_page.verifytitle();
		System.out.println(title);
				
		Assert.assertEquals(title, "ASPCL NOC Admin Portal","Home page title not matched");// string message if assertion title	
		//return title;
		
	}
	
	@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
		
		
	}

