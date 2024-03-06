package ActionsClass; 
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class Presentation 
	{
		public static void main(String[] args) throws InterruptedException 
		{	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.flipkart.com/");
			WebElement electronic = driver.findElement(By.xpath("//img[@alt='Electronics']"));
			Actions act = new Actions(driver);
			act.moveToElement(electronic).build().perform();
			WebElement doubleclick = driver.findElement(By.xpath("//a[text()='Wired Headphones']"));
			act.doubleClick(doubleclick).build().perform();
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			act.keyDown(Keys.PAGE_UP).build().perform();
			act.keyDown(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			act.keyDown(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			act.keyDown(Keys.PAGE_DOWN).build().perform();
			WebElement rome = driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
			WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
			act.clickAndHold(rome).moveToElement(italy).release().build().perform();
			Thread.sleep(3000);
			WebElement unitedstates = driver.findElement(By.xpath("//div[text()='United States']"));
			WebElement washington = driver.findElement(By.id("box3"));
			act.dragAndDrop(washington, unitedstates).build().perform();
			Thread.sleep(2000);
			act.keyDown(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
		//	driver.close();
		}
	}