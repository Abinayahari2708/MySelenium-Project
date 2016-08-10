import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class googlelinks {

	
	public static void main(String[] args) 
	{
	
		String explink,actlink;
		explink="Gmail";
		boolean linkexist=false;
		List<WebElement> links;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		links=driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) 
		{
			actlink=links.get(i).getText();
			if (explink.equalsIgnoreCase(actlink)) 
			{
				linkexist=true;
				break;
			}
		}
		if (linkexist) 
		{
			System.out.println(explink+" Link is Present, Test Pass");
		} else 
		{
			System.out.println(explink+" Link is not Present, Test Fail");
		}
		
	}

}
