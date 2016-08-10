import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Functions {

	
	public static void main(String[] args) 
	{
		String res;
		res=launchApp("http://localhost/orangehrm");
		System.out.println("Launch App Test: "+res);
	}

	
	public static String launchApp(String url)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
			return "Pass";
		} else 
		{
			return "Fail";
		}
		
	}
	
	
	
	
	
	
	
}
