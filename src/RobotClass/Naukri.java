package RobotClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String given_url="https://www.naukri.com/";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String current_url = driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
				{
			 	System.out.println("Verified");
				}
			else
				System.out.println("Not Verified");
		WebElement given_button=driver.findElement(By.className("nI-gNb-lg-rg__register"));
		if(given_button.isEnabled())
		{
		System.out.println("Verified");
		given_button.click();
		driver.findElement(By.id("name")).sendKeys("Kairvi Balana ");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("kairvibalana@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("@selenium#");
		Thread.sleep(1000);
		driver.findElement(By.id("mobile")).sendKeys("9899310171");
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //p[contains(text(),' I have work experience (excluding internships)')]")).click();
		driver.findElement(By.xpath("//input[type@='button']")).click();
			
		}
	}
}
