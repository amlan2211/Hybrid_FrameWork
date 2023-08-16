package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript16 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.uitestpractice.com/Students/Actions");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.click(driver.findElement(By.name("one")));
		a.click(driver.findElement(By.name("two")));
		a.click(driver.findElement(By.name("three")));
		a.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		driver.quit();
	    

	}

}
