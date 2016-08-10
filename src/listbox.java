import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class listbox 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		int flyfromcount;
		WebElement flyfrom;
		List<WebElement> fflist;
		String expcity="Delhi";
		String actcity;
		boolean cityexist=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://book.spicejet.com/Search.aspx");
		flyfrom=driver.findElement(By.name("ControlGroup......"));
		Select flyfromlist=new Select(flyfrom);
		fflist=flyfromlist.getOptions();
		flyfromcount=fflist.size();
		for (int i = 1; i < flyfromcount ; i++) 
		{
			actcity=fflist.get(i).getText();
			if (actcity.toUpperCase().contains(expcity.toUpperCase())) 
			{
				cityexist=true;
				break;
			}  
		}
		if (cityexist) 
		{
			System.out.println(expcity+" is present in FlyFrom List"
														+" Test Passed");
			
		} else 
		{
			System.out.println(expcity+" is not present in FlyFrom List"
														+" Test Failed");
		}
		
	}

}
