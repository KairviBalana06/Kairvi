package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSTask 
{
	public static void main(String[] args) 
	{
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");	
		String current_url= driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		 {
			 System.out.println("I am in DWS");
		driver.findElement(By.xpath("//a[text()='Computers']")).click();
		driver.close();
		 }
		 else
			 System.out.println("I am not in DWS");
	}    
}