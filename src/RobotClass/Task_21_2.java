package RobotClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task_21_2 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Kairvi/Downloads/2automation.html");
		WebElement Google_link = driver.findElement(By.xpath("//a[text()='Google']"));
		if(Google_link.isEnabled())
		{
			Google_link.click();
			System.out.println("hogya");
			driver.navigate().back();
			driver.findElement(By.id("small-searchterms")).sendKeys("Whatever");
			
		}
		else
			System.out.println("nhi hua");
	}
}