package com.noc.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.noc.utilities.testutil;

public class testbase {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 
	//public static void main(String[] args) throws Exception
	public testbase()     //constructor
	{
	
	try {
		prop = new Properties();
	    FileInputStream file;
	   file = new FileInputStream (("C:\\Users\\Admin\\eclipse-workspace\\maventest\\src\\main\\java\\com\\noc\\config\\config.properties"));
	   prop.load(file);
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
    public  void initialization()
    {
    String browsername= prop.getProperty("browser");
    
    if (browsername.equals("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\chromedriver.exe");
    	driver= new ChromeDriver();
    	}
	else if(browsername.equals("Firefox"))
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver_win32\\geckodriver.exe");
    	driver= new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(testutil.pageload_timeout, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(testutil.impl_timeout, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
  
    
    
    
    
    
	}

	
		
	}


