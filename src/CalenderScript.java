import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CalenderScript {

	public static void main(String[] args) 
	{
		
	String date="20/June/2017";
	String[] temp=new String[3];
	temp=date.split("/");
	String dt,month,year;
	dt=temp[0];
	month=temp[1];
	year=temp[2];
	
	String calyear,calmonth;
	WebElement cal;
	List<WebElement> rows;
	List<WebElement> cells;
	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.cleartrip.com/");
	
	driver.findElement(By.id("DepartDate")).click();
	calyear=driver.findElement(By.
							className("ui-datepicker-year")).getText();
	
	calmonth=driver.findElement(By.
							className("ui-datepicker-month")).getText();
	
	while (!calyear.equals(year)) 
	{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(
						By.className("ui-datepicker-year")).getText();
	}
	
	while (!calmonth.equalsIgnoreCase(month)) 
	{
		driver.findElement(By.className("nextMonth ")).click();
		calmonth=driver.findElement(
					By.className("ui-datepicker-month")).getText();
	}
	
	cal=driver.findElement(By.className("calendar"));
	rows=cal.findElements(By.tagName("tr"));
	for (int i = 1; i < rows.size(); i++) 
	{
		cells=rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < cells.size(); j++) 
		{
			if (cells.get(j).getText().equals(dt)) 
			{
				cells.get(j).click();
			}
		}
		
	}
	
	}
}
