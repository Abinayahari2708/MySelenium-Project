import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class samplelogintest 
{

	
	public static void main(String[] args)
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///D://SELENIUM%20Training//Sample%20Apps//Login.html");
	driver.findElement(By.id("username")).sendKeys("qedge");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("demo");
	driver.findElement(By.name("login")).click();
	driver.close();
		

	}

}
