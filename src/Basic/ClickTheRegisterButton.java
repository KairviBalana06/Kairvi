package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickTheRegisterButton
{
	public static void mian(String[]args)
	{
		String given_url="https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");	
		String current_url =driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("I am in DWS page");
			WebElement element=driver.findElement(By.className("ico-register"));
			element.click();
		}
		else
			System.out.println("I am not in DWS page");
		
	}   

}