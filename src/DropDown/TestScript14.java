package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript14 {

	public static void main(String[] args) throws InterruptedException
    {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕'"));
		Thread.sleep(2000);
	    WebElement ele= driver.findElement(By.xpath("//div[.='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		

	}

}
