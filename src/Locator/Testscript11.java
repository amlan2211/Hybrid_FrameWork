package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscript11 {

	public static void main(String[] args) throws InterruptedException 
	{
           
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amlanmishra@gmail.com");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234456");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	}

}
