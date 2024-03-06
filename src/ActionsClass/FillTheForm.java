package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
public class FillTheForm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kairvi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Balana");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Ghar main");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kairvibalana@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox1")).click();
		
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()\"Dutch\"]")).click();
		driver.findElement(By.xpath("//a[text()\"Hindi\"]")).click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement single = driver.findElement(By.id("Skills"));
		Thread.sleep(1000);
		
//		ref.selectByValue("java");
	}
}