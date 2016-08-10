import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class editlistcount 
{


	public static void main(String[] args) 
	{
	String expcity="Hyderabad";
	String actcity;
	boolean cityexist=false;
	List<WebElement> citylist;
	WebDriver driver=new FirefoxDriver();
	driver.get("http://redbus.in");
	driver.findElement(By.id("txtSource")).sendKeys(expcity.substring(0, 1));
	citylist=driver.findElements
				(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
	
	for (int i = 0; i < citylist.size(); i++) 
	{
		actcity=citylist.get(i).getText();
		if (expcity.equalsIgnoreCase(actcity)) 
		{
			cityexist=true;
			break;
		} 
	}
	
	if (cityexist) 
	{
			System.out.println(expcity+" is Present in FromList");
	} else 
	{
		System.out.println(expcity+" is not Present in FromList");
	}
	
		
	}

}
