package ActionsClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.zeromq.ZStar.Set;
public class FacebookGetWindowHandles 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String dws_handle = driver.getWindowHandle();
		System.out.println(dws_handle);
		List<WebElement> products = driver.findElements(By.className("column follow-us"));
		Actions act  = new Actions(driver);
		for(WebElement web : products)
		{
			act.keyDown(Keys.CONTROL).click(web).build().perform();
		}
		Set Multiple_window = (Set) driver.getWindowHandles();
		System.out.println(Multiple_window);

	}
}