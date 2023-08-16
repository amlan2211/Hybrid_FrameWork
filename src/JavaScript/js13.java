package JavaScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class js13 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ'"));
		org.openqa.selenium.Point loc=ele.getLocation();
		
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x);
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy("+x+","+y+")");
		/*Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);*/

	}

}
