package PoPup;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TS11 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("file:///C:/Users/91784/Desktop/temp.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("jpmadhan");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).clear();
		driver.findElement(By.id("a2")).click();
		driver.findElement(By.id("a3")).click();
		
		

	}

}
