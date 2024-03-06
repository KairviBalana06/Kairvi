package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DWSTask2
{
	public static void main(String[] args)
	{
		String given_title="Demo Web Shop";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String currentTitle=driver.getTitle();
		if(given_title.equalsIgnoreCase(currentTitle)) 
		{
			System.out.println("Title is Verified");
			WebElement BookElement = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
			if(BookElement.isDisplayed())
			{
				System.out.println("Book is verified");
				BookElement.click();
				String given_url="https://demowebshop.tricentis.com/books";
				String current_url=driver.getCurrentUrl();
				if(given_url.equalsIgnoreCase(current_url))
				{
				System.out.println("VERIFIED");
				driver.navigate().back();
				WebElement find=driver.findElement(By.xpath("//strong[Conatins(text(),'Community poll')"));
				    if(find.isDisplayed())
				    {
				    	System.out.println("MATCHED");
				    	driver.close();
				    }
				    else
				    	System.out.println(" NOT MATCHED");
				    	
				}
				else
					System.out.println(" NOT VERIFIED");
			}
			else
				System.out.println("Book is not verified");
			}
		else
			System.out.println("Book is not verified");
		}
	}
