package RobotClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class EaseMyTripDetails 
{
	public static void main(String[] args) throws InterruptedException
	{	
	ChromeOptions ch_options = new ChromeOptions();
	ch_options.addArguments("Disable-Notifications");
	WebDriver driver = new ChromeDriver(ch_options);
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
	driver.findElement(By.className("innerspcr")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("mflexcol")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[text()='Bangalore(BLR)'])[2]")).click();
	Thread.sleep(1000);
	}
}