import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HRMSAdminLoginTest 
{
	static WebDriver driver;
	static String uid,pwd,result;
	
	
	public static void main(String[] args) 
	{
	
		
	result=launchApp("http://opensource.demo.orangehrm.com");
	System.out.println("Launch App Test: "+result);	
	result=adminLogin("Admin","admin");
	System.out.println("Admin Login Test: "+result);
	result=adminLogout();
	System.out.println("Admin Logout Test: "+result);
	closeApp();
	}
	
	
	public static String launchApp(String url)
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
			return "Pass";
		} else 
		{
			return "Fail";
		}
		
	}
	
	
	public static String adminLogin(String uid,String pwd)
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.partialLinkText("Welcome")).isDisplayed()) 
		{
			return "Pass";
		} else 
		{
			return "Fail";
		}
	}
	
	public static String adminLogout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
			return "Pass";
		} else 
		{
			return "Fail";
		}
	}
	
	public static void closeApp()
	{
		driver.quit();
	}
	
	

}
