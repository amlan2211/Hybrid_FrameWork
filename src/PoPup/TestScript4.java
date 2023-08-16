package PoPup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript4 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_SPACE);
	    r.keyPress(KeyEvent.VK_N);
	    r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_N);
		
		
	}

}
