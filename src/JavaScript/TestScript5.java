package JavaScript;

import java.awt.Point;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript5 {

	public static void main(String[] args) throws InterruptedException 
	{ 
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement  ele =driver.findElement(By.xpath("//a[.='About Us'"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x=(int) loc.getX();
		int y=(int) loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");
		
		

	}

}
