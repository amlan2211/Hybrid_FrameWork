package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/91784/Desktop/Demo11.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@value='hotel']"));
	     
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("l");
		Thread.sleep(2000);
		s.selectByVisibleText("gobi");
		Thread.sleep(2000);
		s.deselectAll();
	     
		

	}

}
