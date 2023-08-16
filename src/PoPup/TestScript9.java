package PoPup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().
		Thread.sleep(1000);
		driver.get("https://www.google.com/maps/@12.959744,77.594624,12z?authuser=0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg50']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@aria-controls='sbsg51']"));
		driver.findElement(By.xpath("//input[@aria-controls='sbsg51']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println()

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
