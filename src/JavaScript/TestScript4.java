package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		for(int i=1;i<=3;i++)
		{
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		for(int i=1;i<=3;i++)
		{
			jse.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
		}
		

	}

}
