package Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Webelement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscript {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver
		=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/91784/Desktop/Demo3.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).click();

	}

}

