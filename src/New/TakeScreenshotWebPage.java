package New;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class TakeScreenshotWebPage 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakeScreenshot ts = (TakeScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\Kairvi\\Pictures\\Screenshots\\dws.png");
		FileHandler.copy(from, to);
	}
}