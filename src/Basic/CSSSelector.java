package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector 
{
	public static void main(String[]srgs)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.tagName("input")).sendKeys("pagal hai kya");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.close();
	}

}
