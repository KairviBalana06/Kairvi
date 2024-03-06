package ActionsClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(1000);
		act.keyUp(Keys.PAGE_UP).build().perform();
	}
}
