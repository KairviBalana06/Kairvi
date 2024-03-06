package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double_click = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		Actions act = new Actions(driver);
		act.moveToElement(double_click).build().perform();
		Thread.sleep(1000);
		act.doubleClick(double_click).build().perform();
		try
		{
			act.doubleClick(double_click).build().perform();
			System.out.println("My script is unsuccessful");
		}
		catch(UnhandledAlertException e)
		{
			System.out.println("My script is successful");
		}
		
	}
}