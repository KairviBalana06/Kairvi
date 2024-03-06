package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ClickAndHold_0 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement italy = driver .findElement(By.id("box106"));
		WebElement spain = driver .findElement(By.id("box107"));
		WebElement norway = driver .findElement(By.id("box101"));
		WebElement denmark = driver .findElement(By.id("box104"));
		WebElement southkorea = driver .findElement(By.id("box105"));
		WebElement sweden = driver .findElement(By.id("box102"));
		WebElement unitedstates = driver .findElement(By.id("box103"));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.clickAndHold(rome).release(italy).build().perform();
		Thread.sleep(1000);
		act.clickAndHold(madrid).release(spain).build().perform();
		Thread.sleep(1000);
		act.clickAndHold(oslo).release(norway).build().perform();
		Thread.sleep(1000);
		act.clickAndHold(Copenhagen).release(denmark).build().perform();
		Thread.sleep(1000);
		act.clickAndHold(seoul).release(southkorea).build().perform();
		Thread.sleep(1000);
		act.clickAndHold(Stockholm).release(sweden).build().perform();	
		Thread.sleep(1000);
		act.clickAndHold(washington).release(unitedstates).build().perform();
		Thread.sleep(1000);
	}
}