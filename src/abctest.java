import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class abctest 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("demo.qedge");
		driver.findElement(By.id("next")).click();
		//Thread.sleep(5000);  Constant time not preferred
		driver.findElement(By.id("Passwd")).sendKeys("qedge123");
		driver.findElement(By.id("signIn")).click();
	}

}
