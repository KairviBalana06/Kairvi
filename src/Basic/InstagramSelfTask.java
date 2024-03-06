package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InstagramSelfTask 
{
	public static void main(String[]args)
	{
		String given_url="https://www.instagram.com/accounts/login/?hl=en";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		String current_url = driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
	 	System.out.println("I am in INSTAGRAM");
		}
		else
		System.out.println("I am not in INSTAGRAM");
		WebElement element =driver.findElement(By.xpath("//input[@id='Phone number, username, or email']"));
		element.sendKeys("");
		WebElement element1 =driver.findElement(By.xpath("//input[@id='password']"));
		element.sendKeys("");
		WebElement element2 =driver.findElement(By.xpath(""));
		element.click();	
	}
}