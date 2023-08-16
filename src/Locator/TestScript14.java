package Locator;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestScript14 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/91784/Desktop/newscript.html");
		WebElement ele= driver.findElement(By.id("a1"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ac");
		WebElement ele2=driver.findElement(By.id("a2"));
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"av");

	}

}
