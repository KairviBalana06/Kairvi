package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByGetAttribute
{
	public static void main(String[] args) 
	{
		String given_data="shinchan";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		search_field.sendKeys("Heemawari");
		String current_data = search_field.getAttribute("value");
		if(given_data.equalsIgnoreCase(current_data))
		{
			System.out.println("Japan aagye");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
		}
		else 
		{
			System.out.println("Doremon k pass jao");
			driver.close();
		}
	}
}