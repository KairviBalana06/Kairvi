package ActionsClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAllTheElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	List<WebElement> topmenu = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
	for(WebElement web : topmenu )
		{
		web.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		Object act;
//		act.keysDown(Keys.CONTROL).movetoElement(web).click().build().perform();
		}
	}

}
