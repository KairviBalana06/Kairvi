package New;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class TakeScreenshotWebElement 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://twitter.com/RealHughJackman");
		org.openqa.selenium.WebElement hugh_jackman = driver.findElement(By.xpath("//div[@class='css-175oi2r r-1adg3ll r-bztko3 r-16l9doz r-6gpygo r-2o1y69 r-1v6e3re r-1xce0ei']"));
		File from = hugh_jackman.getScreenshotAs(OutputType.FILE);
		File to = new File ("C:\\Users\\Kairvi\\Pictures\\Screenshots\\hugh.png");
		FileHandler.copy(from, to);
	}
}