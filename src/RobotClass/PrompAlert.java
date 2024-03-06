package RobotClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrompAlert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Kairvi");
		alt.accept();
	}
}