package PoPup;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Testscript10 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https;//www.redbus.in");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//input[@id='src']").sendKeys("BANGALORE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']").sendKeys("mysore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='f1 icon calender_icon-new icon-calendar icon")).click();
		driver.findElement(By.xpath("//td[.='26']")).click();
		driver.findElement(By.xpath("//button[.='Search "))
		
		
			
		

	}

}
