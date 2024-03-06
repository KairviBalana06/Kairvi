package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookTask2 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement given_button=driver.findElement(By.xpath("//a[text()='create new account']"));
		if(given_button.isDisplayed())
		{
			System.out.println("I am in FACEBOOK");
			given_button.click();
			driver.close();
		}
		else 
		
			System.out.println("I am not in FACEBOOK");
	}

}
