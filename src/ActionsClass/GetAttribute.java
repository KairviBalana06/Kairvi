package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute
{
	public static void main(String[] args) 
	{
		String given_data="small-searchterms";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search_field = driver.findElement(By.id("q"));
		String current_data = search_field.getAttribute("id");
		if(given_data.equalsIgnoreCase(current_data))
		{
			System.out.println(current_data);
			System.out.println("Id is same");
			driver.close();
		}
		else
			System.out.println("Id is not same");
	}
}