import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radios {

	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://cleartrip.com");
	if (driver.findElement(By.id("OneWay")).isSelected()) 
	{
		System.out.println("OneWay Radio button is selected " +
				"								by default, Test Pass");
	} else 
	{
		System.out.println("OneWay Radio button is not selected by " +
													"default, Test Fail");
	}

	}

}
