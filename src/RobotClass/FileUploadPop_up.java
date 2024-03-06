package RobotClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadPop_up 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Adobe Scan Oct 10, 2022.pdf");
	}
}