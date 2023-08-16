package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript18 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		Thread.sleep(2000);
		ele.sendKeys("amlan");
		System.out.println(ele.getAttribute("value"));

	}

}
