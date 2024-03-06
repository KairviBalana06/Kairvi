package Basic;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class ClickAllCATEGORIES 
{
	 public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement>CATEGORIES_products=driver.findElements(By.xpath("//div[@class='block block-category-navigation']/div[2]/ul/li/a"));		for(WebElement webelement : CATEGORIES_products )
		{
	webelement.click();
	Thread.sleep(1000);
	driver.navigate().back();
		}
	}  
}
