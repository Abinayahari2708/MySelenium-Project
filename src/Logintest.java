import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Logintest 
{
	@Test
	public static void empidtest()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrm.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
		
		
		driver.findElement(By.partialLinkText("Admin")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
	
}
