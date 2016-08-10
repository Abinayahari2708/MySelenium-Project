import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Linksnavigation 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		String expradio="half trip";
		String actradio;
		boolean radioexist=false;
		List<WebElement> radios;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		
		radios=driver.findElements(By.xpath(".//*[@id='SearchForm']/nav/ul/li/label"));
		
		for (int i = 0; i < radios.size(); i++) 
		{
			actradio=radios.get(i).getAttribute("title");
			if (actradio.equalsIgnoreCase(expradio)) 
			{
				radioexist=true;
				break;
			}
		}
		if (radioexist) 
		{
			System.out.println(expradio+" is Present");
		} else 
		{
			System.out.println(expradio+" is not Present");
		}
		
		
		
		
	}

}
