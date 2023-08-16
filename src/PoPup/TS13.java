package PoPup;

import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TS13 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ]'"));
		org.openqa.selenium.Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		JavascriptException jse=(JavascriptException) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Actions a =new Actions(driver);
		a.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		
		

	}

}
