package Locator;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript16 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	     List<WebElement> links=driver.findElements(By.xpath("//a"));
		int size=links.size();
		System.out.println(size);
	

	}

}
