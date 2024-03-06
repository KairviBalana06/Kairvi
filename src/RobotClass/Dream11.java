package RobotClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dream11 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dream11.com/");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
//	driver.switchTo().frame(0);
	WebElement smile= (WebElement) driver.switchTo().frame("send-sms-iframe");
	Thread.sleep(1000);
	driver.switchTo().frame(smile);
	driver.findElement(By.id("regEmail")).sendKeys("9899310171");
	}

}
