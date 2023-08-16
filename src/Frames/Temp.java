package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Temp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("file:///C:/Users/91784/Desktop/TEMP4.html");
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("abcde");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		WebElement ele=driver.findElement(By.id("//iframe[@id='f1']"));
		driver.switchTo().frame(ele);
		//Thread.sleep(2000);
		driver.findElement(By.id("b3")).sendKeys("xyz");

	}

}
