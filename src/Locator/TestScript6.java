package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript6 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/maps/dir///@12.9564672,77.594624,12z");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[]")).sendKeys("bengaluru");
		driver.findElement(By.cssSelector("input[placeholder='Choose destination']")).sendKeys("mysuru");

	}

}
