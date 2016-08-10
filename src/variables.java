import org.openqa.selenium.WebDriver;

public class variables
{
	static String Url="http://google.com";
	String uid="QEdge";
	
	public static void main(String[] args) 
	{
		
		System.out.println(Url);
		//uid we cannot access from this method
	}

	public void launchapp()
	{
		System.out.println(Url);
		System.out.println(uid);
	}
	
}
