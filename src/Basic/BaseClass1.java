package Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseClass1 
{
	static WebDriver driver;
	public static void precondition1()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void precondition2()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void precondition3()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void postconditionclose()
	{
		driver.close();
	}
	public static void postconditionquit()
	{
		driver.quit();
	}
	public static void main(String[]args) throws InterruptedException
	{
	}
}
		
		
