package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
public class FacebookTask
{
	public static void main(String[]args)
	{
	String given_url="https://www.facebook.com/";
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String current_url = driver.getCurrentUrl();
			if(given_url.equalsIgnoreCase(current_url))
					{
				 	System.out.println("I am in FACEBOOK");
					}
				else
					System.out.println("I am not in FACEBOOK");
	WebElement element =driver.findElement(By.xpath("//input[@id='email']"));
	element.sendKeys("kairvibalana@gmail.com");
	System.out.println("pehle id to banale");
	WebElement element1 =driver.findElement(By.xpath("//input[@id='passContainer']"));
	element.sendKeys("");
	WebElement element2 =driver.findElement(By.xpath("//input[@id='login']"));
	element.click();	
	}
}