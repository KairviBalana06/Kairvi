package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	String given_url = "https://www.shoppersstack.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(2000);
	String current_url = driver.getCurrentUrl();
	if(given_url.equalsIgnoreCase(current_url))
	{
		Thread.sleep(2000);
		System.out.println("I am in ShoppersStack");
	}
	else
		System.out.println("I am not in ShoppersStack");
		WebElement login_in= driver.findElement(By.id("loginBtn"));
		if(login_in.isEnabled())
		{
			login_in.click();
			Thread.sleep(2000);
			WebElement create_acc = driver.findElement(By.className("MuiButton-label"));
			if(create_acc.isDisplayed())
			{
				create_acc.click();
				driver.findElement(By.id("First Name")).sendKeys("Kairvi");
				driver.findElement(By.id("Last Name")).sendKeys("Balana");
				driver.findElement(By.id("Female")).click();
				driver.findElement(By.id("Phone Number")).sendKeys("987654321");
				driver.findElement(By.id("Email Address")).sendKeys("kairvibalana@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("@selenim#");
				driver.findElement(By.id("Confirm Password")).sendKeys("@selenium#");
				driver.findElement(By.id("Terms and Conditions")).click();
				WebElement register =driver.findElement(By.id("Register"));
				Thread.sleep(2000);
				if(register.isEnabled())
				{
					Thread.sleep(2000);
					register.click();
					System.out.println("Enabled");
				}
				else{
					driver.navigate().back();
					driver.close();
					System.out.println("nahi hua");
					}
			}
		}
	}
}