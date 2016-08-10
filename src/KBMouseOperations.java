import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class KBMouseOperations {

	
	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
		
		

	}

}
