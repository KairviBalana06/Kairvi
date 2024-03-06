package RobotClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DisableNotification 
{
	public static void main(String[] args)
	{	
		ChromeOptions ch_options = new ChromeOptions();
		ch_options.addArguments("Disable-Notifications");
		WebDriver driver = new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	}
}