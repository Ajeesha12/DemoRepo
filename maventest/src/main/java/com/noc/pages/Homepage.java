package com.noc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noc.base.testbase;

public class Homepage extends testbase {
	@FindBy(xpath="//a[contains(text(),'jithu')]")
			WebElement user_name;
	@FindBy (xpath="//button[text()=' Processed ']")
	WebElement processed_button;
	@FindBy (xpath="//button[text()=' Pending Approvals ']")
	WebElement pending_button;
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
public String verifytitle()

{  //String S= driver.getTitle();
   // System.out.println(S);
	return driver.getTitle();	
}
	public processed_page processed_click()
	{
		
		processed_button.click();
		return new processed_page();
		
	}

 public pending_page pending_click()
 {
	 
	 pending_button.click();
	 return new pending_page();
	 
 }

}

