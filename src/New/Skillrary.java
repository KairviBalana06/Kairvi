package New;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Skillrary 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
	   WebElement GEARS = driver.findElement(By.xpath("//span[text()='GEARS']"));
//	   Actions act = new Actions(driver);
//	   act.moveToElement(GEARS).build().perform();
	   driver.findElement(By.xpath("//a[@class='ignorelink'])[7]")).click();
	}
}