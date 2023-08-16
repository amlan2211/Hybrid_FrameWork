package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class TestScript17 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("file:///C:/Users/91784/Desktop/Demo8.html");
		Thread.sleep(1000);
		List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox'"));
		for(WebElement ele:checkbox)
		{
			ele.click();
		}
		for(int i=checkbox.size()-1;i>=0;i--)
		{
			WebElement ele=checkbox.get(i);
			ele.click();
		}
		
		

	}

}
