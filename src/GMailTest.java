import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GMailTest
{

@BeforeClass	
public void launchapp()
{
	System.out.println("Launch App ");
}
	
@AfterClass
public void closeapp()
{
	System.out.println("Close App");
}

	
@BeforeMethod	
public void login()
{
	System.out.println("Login");
}
	
@AfterMethod
public void logout()
{
	System.out.println("Logout");
}

@Test(priority=0)	
public void sendmail()
{
	System.out.println("send mail test");
}


@Test(priority=1)
public void receivemail()
{
	System.out.println("receive mail test");
}

@BeforeTest
public void deletecoockies()
{
	System.out.println("delete Coockies");
}

@AfterTest
public void closebrowser()
{
	System.out.println("Close the current browser");
}
@BeforeSuite
public void initDriver()
{
	System.out.println("Initialize WebDriver");
}

@AfterSuite
public void KillDriver()
{
	System.out.println("Destroy Driver Object");
}

	
}
