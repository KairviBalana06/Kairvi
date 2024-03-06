package Mock;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MockTask 
{
	public static void main(String[]args) throws InterruptedException
	{
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url = driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
				{
			 	System.out.println("I am in DWS page");
				}
			else
				System.out.println("I am not in DWS page");
		List<WebElement> menu =driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		for(WebElement web : menu )
		{
		web.click();
		Thread.sleep(1000);
		driver.navigate().back();
		}
	}
}