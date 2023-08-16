package Locator;
import org.openqa.By;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/91784/Desktop/Demo4.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("abc");
		

	}

}
