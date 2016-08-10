import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class multiselect {

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebElement carlist;
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Listbox1.html");
		carlist=driver.findElement(By.xpath("html/body/select"));
		Select clist=new Select(carlist);
		clist.selectByIndex(0);
		Thread.sleep(5000);
		clist.selectByIndex(1);
		Thread.sleep(5000);
		clist.selectByVisibleText("Audi");

	}

}
