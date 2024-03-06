package Basic;
import org.openqa.selenium.chrome.ChromeDriver;
public class ThirdToStartSelenium
{ 
	public static void main(String[]args)
	{
	String given_url="https://demowebshop.tricentis.com/";
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equalsIgnoreCase(current_url))
			{
		 	System.out.println("I am at DMS Workspace");
			}
		else
			System.out.println("I am not at DMS Workspace");
	}	

}