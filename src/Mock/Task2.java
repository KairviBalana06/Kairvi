package Mock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(40000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("vertical-tab-0"));
	}
}