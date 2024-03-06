package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class OpenTheElementInTheWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).moveToElement(books).click().build().perform();
	}
}