package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScript15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[.='))
	    WebElement src= driver.findElement(By.id("box3"));
	    WebElement dst= driver.findElement(By.id("box103"));
	    
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dst).perform();

	}

}
