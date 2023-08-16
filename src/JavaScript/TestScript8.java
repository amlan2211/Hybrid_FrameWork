package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript8 {

	public static void main(String[] args) throws InterruptedException 
	{
	{
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			FirefoxDriver driver =new FirefoxDriver();
		    driver.get("https://www.amazon.in/");
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'")).sendKeys("mobile");
			
	}
		

	}

}
