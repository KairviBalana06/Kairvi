package ActionsClass;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandlingOnMultipleWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String DWS = "https://demowebshop.tricentis.com/";
		String Facebook ="https://www.facebook.com/nopCommerce";
		String Twitter = "https://twitter.com/nopCommerce";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> eCommerce_link = driver.getWindowHandles();
		Thread.sleep(1000);
		for(String str : eCommerce_link)
		{
			driver.switchTo().window(str);
			String currentURL = driver.getCurrentUrl();
			if(DWS.equalsIgnoreCase(currentURL))
			{
				driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
			}
			else if(Facebook.equalsIgnoreCase(currentURL))
			{
				Thread.sleep(1000);
				driver.findElement(By.id(":rp:")).sendKeys("delhi bhand h");
			}
			else 
			{
				Thread.sleep(1000);
				driver.findElement(By.linkText("create account")).click();
			}
			Thread.sleep(1000);
		}
	}
}