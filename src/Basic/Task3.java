package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task3
{
	public static void main(String[]args)
	{
		String given_url = "https://demowebshop.tricentis.com/login";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a"));
		String current_url = driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
				{
			 	System.out.println("I am at DMS Workspace");
				}
		else
				System.out.println("I am not at DMS Workspace");
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a"));
		if(given_url.equalsIgnoreCase(current_url))
		{
	 	System.out.println("I am at DMS Workspace");
		}
		else
		System.out.println("I am not at DMS Workspace");
		
		
		driver.findElement(By.xpath(" "));
	}

}
