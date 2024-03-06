package Basic;
import java.util.*; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class BasicBaseClass1 extends BaseClass1
{
	public static void main(String[] args) throws InterruptedException
	{
	precondition1();
	driver.get("file:///C:/Users/Kairvi/Downloads/demo.html");
	WebElement multi_level = driver.findElement(By.id("multiple_cars"));
	Select ref = new Select(multi_level);
	if(ref.isMultiple())
		{
	List<WebElement>car_product = ref.getOptions();
	for(WebElement web : car_product)
		{
		web.click();
		}
		}
	else 
		{
		System.out.println("you are trying to perform on single_level drop down menu");
		}
	}
} 