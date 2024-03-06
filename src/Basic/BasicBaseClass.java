package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class BasicBaseClass 
{
	public class SelectInSingleSelectDropDownMenu extends BaseClass1
	{
	public static void mai(String[]args) throws InterruptedException
		{
		precondition1();
		driver.get("file:///C:/Users/Kairvi/Downloads/demo.html");
		WebElement single_level = driver.findElement(By.id("standard_cars"));
		Select ref = new Select (single_level);
		Thread.sleep(2000);
		ref.selectByIndex(0);
		Thread.sleep(2000);
		ref.selectByVisibleText("Audi");
		Thread.sleep(2000);
		ref.selectByVisibleText("ford");
		Thread.sleep(2000);
		ref.selectByVisibleText("BMW");
		Thread.sleep(2000);
		ref.selectByVisibleText("Honda");
		Thread.sleep(2000);
		ref.selectByVisibleText("Jaguar");
		Thread.sleep(2000);
		ref.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		ref.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		ref.selectByVisibleText("Mini");
		Thread.sleep(2000);
		ref.selectByVisibleText("Nissan");
		Thread.sleep(2000);
		ref.selectByVisibleText("lr");
		Thread.sleep(2000);
		}
	}
}