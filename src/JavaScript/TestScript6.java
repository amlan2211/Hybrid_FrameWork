package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript6 {

	public static void main(String[] args) throws  InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.redbus.in");
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dest'")).sendKeys("mysore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='26'")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='button'")).click();

	}

}
