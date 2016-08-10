import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EmpRegTest 
{


	public static void main(String[] args) throws InterruptedException 
	{
	List<WebElement> rows;
	WebElement cols;
	String fname, lname;
	fname="ramana";
	lname="abcdxyz";
	boolean emppresent=false;
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://opensource.demo.orangehrm.com");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	
	driver.findElement(By.name("firstName")).sendKeys(fname);
	driver.findElement(By.name("lastName")).sendKeys(lname);
	driver.findElement(By.id("btnSave")).click();
	
	driver.findElement(By.linkText("Employee List")).click();
	
	rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
	
	for (int i = 1; i < rows.size(); i++) 
	{
	 cols=driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr["+i+"]/td[3]/a"));
	 
	 if (fname.equalsIgnoreCase(cols.getText())) 
	 {
	  emppresent=true;
	  break;
	}
	}
    
	if (emppresent) 
	{
		System.out.println("Employee Registration Test Passed");
	} 
	else 
	{
		System.out.println("Employee Registration Test Failed");
	}
	
	}
}
