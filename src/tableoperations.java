import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class tableoperations 
{
	public static void main(String[] args) 
	{
	
	boolean cexist=false;
	String expVal="Euro";
	List<WebElement> rows;
	List<WebElement> cols;
	WebDriver driver=new FirefoxDriver();
	driver.get("http://money.rediff.com/tools/forex");
	rows=driver.findElements
				(By.xpath(".//*[@id='leftcontainer']/div[2]/div[2]" +
													"/table/tbody/tr"));
	for (int i = 0; i < rows.size(); i++) 
	{
		cols=rows.get(i).findElements(By.tagName("td"));
		if (cols.get(0).getText().toUpperCase().contains
											(expVal.toUpperCase())) 
		{
			cexist=true;
			break;
		} 
		
	}
	
	if (cexist) 
	{
		System.out.println(expVal+" is Present in Currancy Rates Table, Test Pass");
	} else 
	{
		System.out.println(expVal+" is not Present in Currancy Rates Table, Test Fail");
	}
	
	
	
	}

}
