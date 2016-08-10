package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class captureTitle 
{

	
	public static void main(String[] args) 
	{
			
	String Expcontent="My Account";
	String Actcontent;
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/intl/en/policies/");
	Actcontent=driver.getPageSource();
	if (Actcontent.toUpperCase().contains(Expcontent.toUpperCase())) 
	{
		System.out.println("Content Test Pass");
		
	} else 
	{
		System.out.println("Content Test Fail");
	}
	
	
	
		
		

	
	
	}

}
