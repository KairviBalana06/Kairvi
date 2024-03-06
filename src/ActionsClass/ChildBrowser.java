package ActionsClass;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ChildBrowser 
{
		public static void main(String[] args) throws InterruptedException 
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(1000);
		String parent = driver.getWindowHandle();
		Set<String> ECommerce_Link = driver.getWindowHandles();
		ECommerce_Link.remove(parent);
		for(String str : ECommerce_Link)
			{
			driver.switchTo().window(str);
			driver.findElement(By.id(":rp:")).sendKeys("Delhi bhand h");
			}
		}
}
