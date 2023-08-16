package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscript12 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/maps/dir///@21.125498,81.914063,5z");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Choose starting point']")).sendKeys("bengaluru");
		driver.findElement(By.xpath("//input[@aria-label='Choose destination...']")).sendKeys("mysuru");
		//driver.findElement(By.xpath("//div[@class='PLEQOe reverse']")).click();
	   

	}

}
