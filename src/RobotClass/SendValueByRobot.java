package RobotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendValueByRobot
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Robot rbt = new Robot();
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_O);
		rbt.keyPress(KeyEvent.VK_SHIFT);
		rbt.keyPress(KeyEvent.VK_R);
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyPress(KeyEvent.VK_G);
		rbt.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_O);
		rbt.keyRelease(KeyEvent.VK_R);
		rbt.keyRelease(KeyEvent.VK_A);
		rbt.keyRelease(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_G);
		rbt.keyRelease(KeyEvent.VK_E);
	}
}