import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AdminLoginTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrm.com");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	if (driver.findElement(By.linkText("Welcome Admin")).isDisplayed()) 
	{
		System.out.println("Admin Login Test Pass");
	} else 
	{
		System.out.println("Admin Login Test Fail");
	}
	driver.findElement(By.partialLinkText("Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
	}
	

}
