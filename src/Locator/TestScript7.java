package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript7 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("amlankiranmishra01@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("apple");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
