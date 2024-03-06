package Basic;
import org.openqa.selenium.chrome.ChromeDriver;
public class SecondtzoStartSelenium 
{
	public static void main(String[]args) 
	{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.campusshoes.com/");
	driver.get("https://www.woodlandworldwide.com/");
	driver.get("https://www.adidas.co.in/");
	driver.get("https://www.nike.com/in/");
	driver.get("https://www.asianfootwears.com/");
	driver.quit();
	}

}
