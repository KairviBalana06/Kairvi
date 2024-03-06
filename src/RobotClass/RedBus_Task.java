package RobotClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class RedBus_Task 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions ch_options = new ChromeOptions();
		ch_options.addArguments("Disable-Notifications");
		WebDriver driver = new ChromeDriver(ch_options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		driver.findElement(By.id("src")).sendKeys("Rohini");
		Thread.sleep(1000);
		driver.findElement(By.className("placeHolderMainText")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("dest")).sendKeys("Vrindavan");
		Thread.sleep(1000);
		driver.findElement(By.className("placeHolderMainText")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("onwardCal")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("20")).click();
	}
}