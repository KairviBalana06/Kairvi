package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.moveToElement(right_click).build().perform();
		Thread.sleep(1000);
		act.contextClick().build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		Thread.sleep(1000);
		act.doubleClick().build().perform();
		try 
		{
			Thread.sleep(1000);
			WebElement delete = null;
			act.doubleClick(delete).build().perform();
			System.out.println("unsuccessfull");
		}
		catch(Exception e)
		{
			System.out.println("The Script is successfull");
		}
	}
}