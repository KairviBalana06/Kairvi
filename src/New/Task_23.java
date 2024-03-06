package New;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Task_23 
{
	public static void main(String[] args) throws IOException 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.redbus.in/");
	TakeScreenshot ts = (TakeScreenshot)driver;
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\Kairvi\\Pictures\\Screenshots\\redbus.png");
	FileHandler.copy(from, to);
	}
}