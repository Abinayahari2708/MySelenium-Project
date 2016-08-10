import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Employeeidtest {

	
	public static void main(String[] args) 
	{
		String empid;
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		empid=driver.findElement(By.xpath(".//*[@id='employeeId']"))
													.getAttribute("value");
		
		System.out.println(empid);
		driver.findElement(By.partialLinkText("Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
