package New;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
public class Scrolling
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https//www.skillrary.com/");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy.(0,1500)");
		Thread.sleep(2000);
//		js.executeScript("window.scrollTo.(0,1500)");
		
	}
}