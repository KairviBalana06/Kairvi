package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		driver.navigate().to("https://demowebshop.tricentis.com/");
	}
}